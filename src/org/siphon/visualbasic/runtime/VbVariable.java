package org.siphon.visualbasic.runtime;

import javax.management.RuntimeErrorException;

import org.siphon.visualbasic.ArgumentMode;
import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.OverflowException;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;

public class VbVariable {

	public VbVarType varType;		// 即 varDecl.varType
	
	public VbValue value;
	
	public VarDecl varDecl;

	private boolean readonly = false;
	
	public boolean isReadonly() {
		return readonly;
	}

	public VbVariable setReadonly(boolean readonly) {
		this.readonly = readonly;
		return this;
	}

	public static final VbVariable ME = new VbVariable(null, null).setReadonly(true);
	
	public VbVariable(VarDecl varDecl, VbValue value) {
		this.varDecl = varDecl;
		if(varDecl != null) this.varType = varDecl.varType;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.format("(VAR %s type:%s value: %s)", varDecl.name, varType.vbType, value);
	}

	public void assign(VbValue value, Interpreter interpreter, CallFrame frame, SourceLocation sourceLocation) throws VbRuntimeException {
		if(this.isReadonly()){
			throw new VbRuntimeException(VbRuntimeException.对象不支持此动作, sourceLocation);
		}
		
		if(value.isObject()){
			if(this.varType.vbType != VbVarType.vbObject && this.varType.vbType != VbVarType.vbVariant){
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} 
			if(this.varDecl.withEvents){
				removeEventHandlers(this.value, interpreter, frame);
				
				this.setObjectValue(value, sourceLocation);
				
				((ModuleInstance) this.value.value).bindEventHandlers(this.varDecl, frame.module, interpreter, frame);
			} else {
				this.setObjectValue(value, sourceLocation);
			}
		} else {	// not object type
			if(this.varType.vbType == VbVarType.vbObject){
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			}
			try {
				if(this.varDecl instanceof ArgumentDecl){
					ArgumentDecl argDecl = (ArgumentDecl) this.varDecl;
					if(argDecl.mode == ArgumentMode.ByRef){	// TODO ByRef 不一定是这样实现的
						VbValue val = VbValue.cast(value, this.varType.vbType);
//						if(value.varType.vbType != this.varType.vbType){
//							throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
//						}
						this.value.updateValue(val.value);
					} else {
						if(value.isObject() && this.varType.isBaseType()){
							value = interpreter.evalDefaultMember(value, frame, sourceLocation);
						}
						this.value = VbValue.cast(value, this.varType.vbType);
					}
				} else {
					if(value.isObject() && this.varType.isBaseType()){
						value = interpreter.evalDefaultMember(value, frame, sourceLocation);
					}
					this.value = VbValue.cast(value, this.varType.vbType);
				}
			} catch (OverflowException e) {
				throw new VbRuntimeException(VbRuntimeException.溢出, sourceLocation);
			} catch (ClassCastException e) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
			} catch(NullValueException e){
				throw new VbRuntimeException(VbRuntimeException.Null的使用无效, sourceLocation);
			}
		}
	}
	
	private void setObjectValue(VbValue value, SourceLocation sourceLocation) throws VbRuntimeException {
		if(value.varType.vbType == VbVarType.vbVariant){
			value = (VbValue) value.value;
		}
		if(this.varType.vbType == VbVarType.vbVariant){
			this.value = value;
			return;
		}
		
		ClassModuleDecl myClass = this.varType.getClassModuleDecl();
		if(myClass == null){		// dim as Object | IUnknown
			this.value = value;
			return;
		}
		
		ModuleInstance inst = (ModuleInstance) value.value;
		ClassModuleDecl instCls = (ClassModuleDecl) inst.getModuleDecl();
		ClassModuleDecl currCls = value.varType.getClassModuleDecl();
		if(instCls == myClass){
			if(currCls == myClass){
				this.value = value;
			} else {
				VbVarType t = new VbVarType(VbVarType.vbObject, new ClassTypeDecl(instCls.getLibrary(), instCls), null, null);
				this.value = new VbValue(t, inst);
			}
		} else if(instCls.isImplementFrom(myClass)){
			VbVarType t = new VbVarType(VbVarType.vbObject, instCls.getImplementorTypeDecl(myClass), null, null);	// 转为为能实现本类型的值
			this.value = new VbValue(t, inst);
		} else {
			throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
		}
	}

	private void removeEventHandlers(VbValue value, Interpreter interpreter, CallFrame frame) {
		if(value == null || value.varType.vbType != VbVarType.vbObject || value.value == null) return;
		
		ModuleInstance instance = (ModuleInstance) value.value;
		instance.removeEventListener(frame.module);
	}

}
