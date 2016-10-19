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

public class IsStatement extends BinaryStatement {

	public IsStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
		super(sourceLocation, v1, v2);
	}


	@Override
	protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		if(value1.varType.vbType == VbVarType.vbVariant){
			value1 = (VbValue) value1.value;
		}
		if(value2.varType.vbType == VbVarType.vbVariant){
			value2 = (VbValue) value2.value;
		}
		
		if(value1.varType.vbType != VbVarType.vbObject)
			throw new VbRuntimeException(VbRuntimeException.类型不匹配, this.v1.getSourceLocation());
		
		if(value2.varType.vbType != VbVarType.vbObject)
			throw new VbRuntimeException(VbRuntimeException.类型不匹配, this.v2.getSourceLocation());
		
		if(value1.value == value2.value){
			return new VbValue(VbVarType.VbBoolean, -1);
		} else {
			return new VbValue(VbVarType.VbBoolean, 0);
		}
	}

}
