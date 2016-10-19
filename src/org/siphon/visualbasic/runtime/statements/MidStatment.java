package org.siphon.visualbasic.runtime.statements;

import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.VbDecl;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.MathExpr;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.VbVariable;

import sun.security.krb5.internal.ReplayCache;

public class MidStatment extends Statement {

	private VarDecl varDecl;
	private Statement start;
	private Statement replace;
	private Statement length;

	public MidStatment(SourceLocation sourceLocation, VarDecl varDecl, Statement start, Statement length, Statement replace) {
		super(sourceLocation);
		this.varDecl = varDecl;
		this.start = start;
		this.length = length;
		this.replace = replace;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		VbVariable var = frame.locateVbVariable(varDecl);
		VbValue value = var.value;
		if (value.varType.vbType == VbVarType.vbVariant) {
			value = (VbValue) value.value;
		}
		if (value.varType.vbType != VbVarType.vbString) {
			throw new VbRuntimeException(VbRuntimeException.类型不匹配);
		}

		VbValue startValue = start.eval(interpreter, frame);
		startValue = MathExpr.pos(startValue);
		if (startValue.value instanceof Number == false) {
			throw new VbRuntimeException(VbRuntimeException.类型不匹配);
		}

		VbValue lengthValue = null;
		if (length != null) {
			lengthValue = length.eval(interpreter, frame);
			lengthValue = MathExpr.pos(lengthValue);
			if (lengthValue.value instanceof Number == false) {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配);
			}
		}
		
		VbValue replaceValue = replace.eval(interpreter, frame);
		if(replaceValue.varType.vbType == VbVarType.vbVariant){
			replaceValue = (VbValue) replaceValue.value;
		}
		if (replaceValue.varType.vbType != VbVarType.vbString) {
			throw new VbRuntimeException(VbRuntimeException.类型不匹配);
		}

		String str = (String) value.value;
		int s = ((Number) startValue.value).intValue() - 1;	//vb start from 1
		int l = str.length();
		if(lengthValue != null) l = ((Number) lengthValue.value).intValue();
		int e = s + l;
		String replaceStr = (String) replaceValue.value;
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<str.length(); i++){
			if(i >= s && i < e){
				int p = i - s;
				if(p < replaceStr.length()){
					sb.append(replaceStr.charAt(p));
				} else {
					sb.append(str.charAt(i));
				}
			} else {
				sb.append(str.charAt(i));
			}
		}
		
		value.value = sb.toString();
		
		return null;
	}

}
