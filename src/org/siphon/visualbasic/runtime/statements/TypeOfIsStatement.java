package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;

public class TypeOfIsStatement extends Statement {

	private Statement statement;
	private ClassModuleDecl patternClass;

	public TypeOfIsStatement(Statement statement, ClassTypeDecl patternType, SourceLocation sourceLocation) {
		super(sourceLocation);
		this.statement = statement;
		if(patternType != null){
			this.patternClass = patternType.classModule;
		}
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		VbValue value = statement.eval(interpreter, frame);
		if(value.varType.vbType == VbVarType.vbVariant){
			value = (VbValue) value.value;
		}
		
		if(value.varType.vbType != VbVarType.vbObject)
			throw new VbRuntimeException(VbRuntimeException.类型不匹配, statement.getSourceLocation());
		
		ClassModuleDecl valueCls = value.varType.getClassModuleDecl();
		if(patternClass == null || valueCls == patternClass || valueCls.isImplementFrom(patternClass)){
			return new VbValue(VbVarType.VbBoolean, -1);
		} else {
			return new VbValue(VbVarType.VbBoolean, 0);
		}
	}

}
