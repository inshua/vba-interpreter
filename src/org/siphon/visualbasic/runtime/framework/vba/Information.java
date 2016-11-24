package org.siphon.visualbasic.runtime.framework.vba;

import java.awt.Color;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.ErrObject;
import org.siphon.visualbasic.runtime.VbArray;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.VbVarType.TypeEnum;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.VbParam;
import org.siphon.visualbasic.runtime.framework.Enums.VbIMEStatus;
import org.siphon.visualbasic.runtime.statements.EvalAssignableStatement;

public class Information {

	@VbMethod(value = "Function Err() As ErrObject", withIntepreter = true)
	public static ErrObject Err(Interpreter interpreter, CallFrame frame) {
		return frame.error;
	}

	@VbMethod("Function IMEStatus() As VbIMEStatus")
	public static VbIMEStatus IMEStatus() {
		throw new UnsupportedOperationException("TODO");
	}

	@VbMethod("Function IsArray(VarName) As Boolean")
	public static boolean isArray(VbValue varName) {
		if (varName.isVariant()) {
			return ((VbValue) varName.value).varType.vbType == VbVarType.vbArray;
		} else {
			return varName.varType.vbType == VbVarType.vbArray;
		}
	}

	@VbMethod("Function IsDate(Expression) As Boolean")
	public static boolean isDate(VbValue expression) {
		if (expression.isVariant())
			return isDate((VbValue) expression.value);
		if (expression.varType.vbType == VbVarType.vbDate) {
			return true;
		}
		if (expression.varType.vbType == VbVarType.vbString) {
			try {
				VbValue.parseDate((String) expression.value);
				return true;
			} catch (Exception e) {
				return false;
			}
		}

		return false;
	}
	
	@VbMethod("Function IsEmpty(Expression) As Boolean")
	public static boolean isEmpty(VbValue expression) {
		return expression.isEmpty(); 
	}
	
	@VbMethod("Function IsError(Expression) As Boolean")
	public static boolean isError(VbValue expression) {
		return expression.isError();
	}
	
	@VbMethod("Function IsMissing(Expression) As Boolean")
	public static boolean isMissing(VbValue expression) {
		return expression.isMissing();
	}

	@VbMethod("Function IsNull(Expression) As Boolean")
	public static boolean isNull(VbValue expression) {
		return expression.isNull();
	}
	
	@VbMethod("Function IsNumeric(Expression) As Boolean")
	public static boolean isNumeric(VbValue expression) {
		Object v = expression.getExactValue();
		if(v instanceof Number){
			return true;
		} else if(v instanceof String){
			try{
				VbValue.CDbl(expression);
				return true;
			}catch(Exception e){
				return false;
			}
		}
		return false;
	}
	
	@VbMethod("Function IsObject(Expression) As Boolean")
	public static boolean isObject(VbValue expression) {
		return expression.isObject();
	}
	
	@VbMethod("Function RGB(Red As Integer, Green As Integer, Blue As Integer) As Long")
	public static int rgb(int red, int green, int blue){
		int rgb = red;
		rgb = (rgb << 8) + green;
		rgb = (rgb << 8) + blue;
		return rgb;
	}
	
	@VbMethod("Function TypeName(VarName) As String")
	public static String typeName(VbValue varName){
		if(varName.isVariant()){
			return typeName((VbValue)varName.value);
		}
		return varName.varType.getTypeName();
	}
	
	@VbMethod("Function VarType(VarName) As VbVarType")
	public static int varType(VbValue varName){
		return varName.varType.vbType;
	}
	
}
