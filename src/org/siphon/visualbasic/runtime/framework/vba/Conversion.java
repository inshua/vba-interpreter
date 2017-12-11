/*******************************************************************************
 * Copyright (C) 2017 Inshua<inshua@gmail.com>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package org.siphon.visualbasic.runtime.framework.vba;

import java.math.BigDecimal;

import org.siphon.visualbasic.runtime.MathExpr;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.framework.VbMethod;

public class Conversion {

	@VbMethod("Function CBool(Expression) As Boolean")
	public static VbValue CBool(VbValue expression){
		return VbValue.CBool(expression);
	}
	
	@VbMethod("Function CByte(Expression) As Byte")
	public static VbValue CByte(VbValue expression){
		return VbValue.CByte(expression);
	}
	
	@VbMethod("Function CCur(Expression) As Currency")
	public static VbValue CCur(VbValue expression){
		return VbValue.CCur(expression);
	}
	
	@VbMethod("Function CDate(Expression) As Date")
	public static VbValue CDate(VbValue expression){
		return VbValue.CDate(expression);
	}
	
	@VbMethod("Function CDbl(Expression) As Double")
	public static VbValue CDbl(VbValue expression){
		return VbValue.CDbl(expression);
	}
	
	@VbMethod("Function CDec(Expression) As Decimal")
	public static VbValue CDec(VbValue expression){
		return VbValue.CDec(expression);
	}
	
	@VbMethod("Function CInt(Expression) As Integer")
	public static VbValue CInt(VbValue expression){
		return VbValue.CInt(expression);
	}
	
	@VbMethod("Function CLng(Expression) As Long")
	public static VbValue CLng(VbValue expression){
		return VbValue.CLng(expression);
	}
	
	@VbMethod("Function CSng(Expression) As Single")
	public static VbValue CSng(VbValue expression){
		return VbValue.CSng(expression);
	}

	@VbMethod("Function CStr(Expression) As String")
	public static VbValue CStr(VbValue expression){
		return VbValue.CStr(expression);
	}
	
	@VbMethod("Function CVar(Expression) As Variant")
	public static VbValue CVar(VbValue expression){
		return VbValue.CVar(expression);
	}
	
	@VbMethod("Function CVDate(Expression)")
	public static VbValue CVDate(VbValue expression){
		return VbValue.CVar(VbValue.CDate(expression));
	}
	
	
	@VbMethod("Function Fix(Number)")
	public static VbValue Fix(VbValue number){
		double sgn = Math.sgn(number);
		return MathExpr.multi(VbValue.fromJava(sgn), Int(Math.Abs(number)));
	}
	
	@VbMethod("Function Int(Number)")
	public static VbValue Int(VbValue number){
		double v = (Double)VbValue.CDbl(number).value;
		return new VbValue(VbVarType.VbVariant, VbValue.fromJava(v));
	}
	
	@VbMethod("Function Hex(Number)")
	public static VbValue hex(VbValue number){
		double v = (Double)VbValue.CDbl(number).value;
		return new VbValue(VbVarType.VbVariant, VbValue.fromJava(Double.toHexString(v)));
	}
	
	@VbMethod
	public static String Hex$(VbValue number){
		double v = (Double)VbValue.CDbl(number).value;
		return Double.toHexString(v);
	}
	
	@VbMethod("Function Oct(Number)")
	public static VbValue oct(VbValue number){
		double v = (Double)VbValue.CDbl(number).value;
		return new VbValue(VbVarType.VbVariant, VbValue.fromJava(Double.toHexString(v)));
	}
	
	@VbMethod
	public static String Oct$(VbValue number){
		double v = (Double)VbValue.CDbl(number).value;
		return Double.toHexString(v);
	}
	
	
	@VbMethod("Function Str(Number)")
	public static VbValue str(VbValue number){
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod
	public static String Str$(VbValue number){
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod("Function Val(String As String) As Double")
	public static String Val(String s){
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod("Function CVErr(Expression)")
	public static VbValue CVErr(VbValue expression){
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod("Function Error(Expression)")
	public static VbValue Error(VbValue expression){
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod
	public static String Error$(VbValue expression){
		throw new UnsupportedOperationException("TODO");
	}


}
