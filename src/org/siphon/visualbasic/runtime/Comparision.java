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
package org.siphon.visualbasic.runtime;

import org.apache.commons.lang3.ArrayUtils;
import org.siphon.visualbasic.OverflowException;

public class Comparision {
	
	public static final int[] TypeOrder = new int[] { VbVarType.vbByte, VbVarType.vbInteger, VbVarType.vbLong, VbVarType.vbSingle, VbVarType.vbCurrency, VbVarType.vbDouble, VbVarType.vbDecimal };

	public static VbValue eq(VbValue num1, VbValue num2) {
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		
		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		int c = compare(num1, num2);
		VbValue r = new VbValue(VbVarType.VbBoolean, c == 0? -1 : 0);
		if(returnVariant){
			return new VbValue(VbVarType.VbVariant, r);
		} else {
			return r;
		}
	}
	
	public static VbValue neq(VbValue num1, VbValue num2) {
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		
		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		int c = compare(num1, num2);
		VbValue r = new VbValue(VbVarType.VbBoolean, c != 0? -1 : 0);
		if(returnVariant){
			return new VbValue(VbVarType.VbVariant, r);
		} else {
			return r;
		}
	}
	
	public static VbValue gt(VbValue num1, VbValue num2) {
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		
		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		int c = compare(num1, num2);
		VbValue r = new VbValue(VbVarType.VbBoolean, c > 0? -1 : 0);
		if(returnVariant){
			return new VbValue(VbVarType.VbVariant, r);
		} else {
			return r;
		}
	}
	
	public static VbValue geq(VbValue num1, VbValue num2) {
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		
		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		int c = compare(num1, num2);
		VbValue r = new VbValue(VbVarType.VbBoolean, c >= 0? -1 : 0);
		if(returnVariant){
			return new VbValue(VbVarType.VbVariant, r);
		} else {
			return r;
		}
	}
	
	public static VbValue leq(VbValue num1, VbValue num2) {
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		
		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		int c = compare(num1, num2);
		VbValue r = new VbValue(VbVarType.VbBoolean, c <= 0? -1 : 0);
		if(returnVariant){
			return new VbValue(VbVarType.VbVariant, r);
		} else {
			return r;
		}
	}
	
	public static VbValue lt(VbValue num1, VbValue num2) {
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		
		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		int c = compare(num1, num2);
		VbValue r = new VbValue(VbVarType.VbBoolean, c < 0? -1 : 0);
		if(returnVariant){
			return new VbValue(VbVarType.VbVariant, r);
		} else {
			return r;
		}
	}
	
	public static int compare(VbValue num1, VbValue num2) {
		
		VbVarType resultType = null;
		Object result = null;

		if (num1.isVariant())
			num1 = (VbValue) num1.value;
		if (num2.isVariant())
			num2 = (VbValue) num2.value;

		if (num1.isString() && num2.isString()) {
			return ((String)num1.value).compareTo((String) num2.value);
		}

		if (num1.isString() && num2.isEmpty())
			return 1;
		if (num2.isString() && num1.isEmpty())
			return -1;

		if (num1.isString()) {
			try {
				num1 = VbValue.CDbl(num1);
			} catch (Exception e) {
				throw new ClassCastException();
			}
		}

		if (num2.isString()) {
			try {
				num2 = VbValue.CDbl(num2);
			} catch (Exception e) {
				throw new ClassCastException();
			}
		}

		if (num1.varType.vbType == VbVarType.vbEmpty)
			num1 = new VbValue(VbVarType.VbInteger, 0);
		if (num2.varType.vbType == VbVarType.vbEmpty)
			num2 = new VbValue(VbVarType.VbInteger, 0);

		if (num1.varType.vbType == VbVarType.vbBoolean)
			num1 = VbValue.cast(num1, VbVarType.vbInteger);
		if (num2.varType.vbType == VbVarType.vbBoolean)
			num2 = VbValue.cast(num2, VbVarType.vbInteger);

		if (num1.value instanceof Number == false)
			throw new ClassCastException();
		if (num2.value instanceof Number == false)
			throw new ClassCastException();

		if(num1.varType.vbType == VbVarType.vbCurrency && num2.varType.vbType != VbVarType.vbCurrency){
			num1 = VbValue.CDbl(num1);
		} else if(num2.varType.vbType == VbVarType.vbCurrency){
			num2 = VbValue.CDbl(num2);
		}
		
		return ((Double)((Number)num1.value).doubleValue()).compareTo(((Number)num2.value).doubleValue());
	}
	
	private static double compare(Number a, Number b) {
		return Math.signum(a.doubleValue() - b.doubleValue());
	}

}
