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
import org.siphon.visualbasic.compile.ImpossibleException;

public class LogicalExpr {

	private static final int[] TypeOrder = {VbVarType.vbBoolean, VbVarType.vbByte, VbVarType.vbInteger, VbVarType.vbLong};

	public static VbValue and(VbValue num1, VbValue num2){
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		
		boolean returnVariant = num1.isVariant() || num2.isVariant();
		
		num1 = processNumber(num1);
		num2 = processNumber(num2);
		
		int t = num1.varType.vbType;
		VbVarType resultType = num1.varType;
		
		if(num1.isNull()){
			if(num2.isNull()) return VbValue.Null;
			
			if(MathExpr.eqZero((Number) num2.value)){
				return new VbValue(VbVarType.VbVariant, num2);
			} else {
				return VbValue.Null;
			}
		} else if(num2.isNull()){
			if(MathExpr.eqZero((Number) num1.value)){
				return new VbValue(VbVarType.VbVariant, num1);
			} else {
				return VbValue.Null;
			}
		}
		
		int typeOrder1 = ArrayUtils.indexOf(TypeOrder, num1.varType.vbType);
		int typeOrder2 = ArrayUtils.indexOf(TypeOrder, num2.varType.vbType);
		assert typeOrder1 != -1 && typeOrder2 != -1;
		if (typeOrder1 < typeOrder2) {
			t = num2.varType.vbType;
			num1 = VbValue.cast(num1, t);
			resultType = num2.varType;
		} else {
			resultType = num1.varType;
			if (typeOrder2 < typeOrder1) {
				num2 = VbValue.cast(num2, t);
			}
		}
		
		Number v = and((Number)num1.value, (Number)num2.value);
		if(t == VbVarType.vbByte){
			v = (Integer)v & 0xff;
		}
		num1 = new VbValue(resultType, v);
		
		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, num1);
		} else {
			return num1;
		}
	}
	
	
	public static VbValue or(VbValue num1, VbValue num2){
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		
		boolean returnVariant = num1.isVariant() || num2.isVariant();
		
		num1 = processNumber(num1);
		num2 = processNumber(num2);
		
		if(num1.isNull()){
			if(num2.isNull()) return VbValue.Null;
			
			if(MathExpr.eqZero((Number) num2.value) == false){
				return new VbValue(VbVarType.VbVariant, num2);
			} else {
				return VbValue.Null;
			}
		} else if(num2.isNull()){
			if(MathExpr.eqZero((Number) num1.value) == false){
				return new VbValue(VbVarType.VbVariant, num1);
			} else {
				return VbValue.Null;
			}
		}
		
		int t = num1.varType.vbType;
		VbVarType resultType = num1.varType;
		
		int typeOrder1 = ArrayUtils.indexOf(TypeOrder, num1.varType.vbType);
		int typeOrder2 = ArrayUtils.indexOf(TypeOrder, num2.varType.vbType);
		assert typeOrder1 != -1 && typeOrder2 != -1;
		if (typeOrder1 < typeOrder2) {
			t = num2.varType.vbType;
			num1 = VbValue.cast(num1, t);
			resultType = num2.varType;
		} else {
			resultType = num1.varType;
			if (typeOrder2 < typeOrder1) {
				num2 = VbValue.cast(num2, t);
			}
		}
		
		Number v = or((Number)num1.value, (Number)num2.value);
		if(t == VbVarType.vbByte){
			v = (Integer)v & 0xff;
		}
		num1 = new VbValue(resultType, v);
		
		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, num1);
		} else {
			return num1;
		}
	}
	
	
	public static VbValue xor(VbValue num1, VbValue num2){
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		boolean returnVariant = num1.isVariant() || num2.isVariant();
		
		num1 = processNumber(num1);
		num2 = processNumber(num2);
		
		int t = num1.varType.vbType;
		VbVarType resultType = num1.varType;
		
		int typeOrder1 = ArrayUtils.indexOf(TypeOrder, num1.varType.vbType);
		int typeOrder2 = ArrayUtils.indexOf(TypeOrder, num2.varType.vbType);
		assert typeOrder1 != -1 && typeOrder2 != -1;
		if (typeOrder1 < typeOrder2) {
			t = num2.varType.vbType;
			num1 = VbValue.cast(num1, t);
			resultType = num2.varType;
		} else {
			resultType = num1.varType;
			if (typeOrder2 < typeOrder1) {
				num2 = VbValue.cast(num2, t);
			}
		}
		
		Number v = xor((Number)num1.value, (Number)num2.value);
		if(t == VbVarType.vbByte){
			v = (Integer)v & 0xff;
		}
		num1 = new VbValue(resultType, v);
		
		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, num1);
		} else {
			return num1;
		}
	}
	
	public static VbValue imp(VbValue num1, VbValue num2){
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		boolean returnVariant = num1.isVariant() || num2.isVariant();
		
		num1 = processNumber(num1);
		num2 = processNumber(num2);
		
		if(num1.isNull()){
			if(num2.isNull()) return VbValue.Null;
			
			if(MathExpr.eqZero((Number) num2.value) == false){
				return new VbValue(VbVarType.VbVariant, num2);
			} else {
				return VbValue.Null;
			}
		} else if(num2.isNull()){
			if(MathExpr.eqZero((Number) num1.value)){
				return not(new VbValue(VbVarType.VbVariant, num1));
			} else {
				return VbValue.Null;
			}
		}
		
		int t = num1.varType.vbType;
		VbVarType resultType = num1.varType;
		
		int typeOrder1 = ArrayUtils.indexOf(TypeOrder, num1.varType.vbType);
		int typeOrder2 = ArrayUtils.indexOf(TypeOrder, num2.varType.vbType);
		assert typeOrder1 != -1 && typeOrder2 != -1;
		if (typeOrder1 < typeOrder2) {
			t = num2.varType.vbType;
			num1 = VbValue.cast(num1, t);
			resultType = num2.varType;
		} else {
			resultType = num1.varType;
			if (typeOrder2 < typeOrder1) {
				num2 = VbValue.cast(num2, t);
			}
		}
		
		Number v = imp((Number)num1.value, (Number)num2.value);
		if(t == VbVarType.vbByte){
			v = (Integer)v & 0xff;
		}
		num1 = new VbValue(resultType, v);
		
		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, num1);
		} else {
			return num1;
		}
	}
	
	public static VbValue eqv(VbValue num1, VbValue num2){
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		
		boolean returnVariant = num1.isVariant() || num2.isVariant();
		
		num1 = processNumber(num1);
		num2 = processNumber(num2);
		
		int t = num1.varType.vbType;
		VbVarType resultType = num1.varType;
		
		int typeOrder1 = ArrayUtils.indexOf(TypeOrder, num1.varType.vbType);
		int typeOrder2 = ArrayUtils.indexOf(TypeOrder, num2.varType.vbType);
		assert typeOrder1 != -1 && typeOrder2 != -1;
		if (typeOrder1 < typeOrder2) {
			t = num2.varType.vbType;
			num1 = VbValue.cast(num1, t);
			resultType = num2.varType;
		} else {
			resultType = num1.varType;
			if (typeOrder2 < typeOrder1) {
				num2 = VbValue.cast(num2, t);
			}
		}
		
		Number v = eqv((Number)num1.value, (Number)num2.value);
		if(t == VbVarType.vbByte){
			v = (Integer)v & 0xff;
		}
		num1 = new VbValue(resultType, v);
		
		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, num1);
		} else {
			return num1;
		}
	}
	
	public static VbValue not(VbValue number){
		if(number.isError()){
			throw new ClassCastException();
		}
		if(number.isNull()){
			return VbValue.Null;
		}
		
		boolean returnVariant = number.isVariant();
		
		number = processNumber(number);
		
		VbVarType resultType = number.varType;
		try {
			Number v = not((Number)number.value);
			if(number.varType.vbType == VbVarType.vbByte){
				v = (Integer)v & 0xff;
			}
			number = new VbValue(resultType, v);
		} catch (ArithmeticException | OverflowException e) {
			throw new OverflowException();
		}

		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, number);
		} else {
			return number;
		}
	}

	private static VbValue processNumber(VbValue number) {
		if(number.isNull()) return number;
		
		if(number.isVariant()){
			number = (VbValue) number.value;
		}
		if (number.isString()) {
			try {
				number = VbValue.CDbl(number);
			} catch (Exception e) {
				throw new ClassCastException();
			}
		} else if (number.varType.vbType == VbVarType.vbEmpty){
			number = new VbValue(VbVarType.VbInteger, 0);
		}
		
		if (number.varType.vbType == VbVarType.vbDate) {
			number = VbValue.CDbl(number);
		}

		if (number.value instanceof Number == false)
			throw new ClassCastException();
		
		switch(number.varType.vbType){
		case VbVarType.vbSingle:
		case VbVarType.vbDouble:
		case VbVarType.vbCurrency:
		case VbVarType.vbDecimal:
			number = VbValue.CLng(number);
		}
		return number;
	}

	private static Number not(Number value) {
		if(value instanceof Integer){
			return ~(Integer)value;
		} else if(value instanceof Long){
			return ~(Long)value;
		} else {
			throw new ImpossibleException();
		}
	}
	
	private static Number and(Number num1, Number num2) {
		if(num1 instanceof Integer){
			return (Integer)num1 & (Integer)num2;
		} else if(num1 instanceof Long){
			return (Long)num1 & (Long)num2;
		} else {
			throw new ImpossibleException();
		}
	}
	
	private static Number or(Number num1, Number num2) {
		if(num1 instanceof Integer){
			return (Integer)num1 | (Integer)num2;
		} else if(num1 instanceof Long){
			return (Long)num1 | (Long)num2;
		} else {
			throw new ImpossibleException();
		}
	}
	
	private static Number xor(Number num1, Number num2) {
		if(num1 instanceof Integer){
			return (Integer)num1 ^ (Integer)num2;
		} else if(num1 instanceof Long){
			return (Long)num1 ^ (Long)num2;
		} else {
			throw new ImpossibleException();
		}
	}
	
	/*
	 * VB Operators to VB.NET
		http://netcoole.com/vb6tocs/vbhtml/vbopers.htm
	 */
	private static Number imp(Number num1, Number num2) {
		if(num1 instanceof Integer){
			int n1 = (Integer)num1;
			int n2 = (Integer)num2;
			return  (~n1) | n2;
		} else if(num1 instanceof Long){
			long n1 = (Long)num1;
			long n2 = (Long)num2;
			return (~n1) | n2;
		} else {
			throw new ImpossibleException();
		}
	}
	
	private static Number eqv(Number num1, Number num2) {
		if(num1 instanceof Integer){
			int n1 = (Integer)num1;
			int n2 = (Integer)num2;
			return  ~(n1 ^ n2);
		} else if(num1 instanceof Long){
			long n1 = (Long)num1;
			long n2 = (Long)num2;
			return ~(n1 ^ n2);
		} else {
			throw new ImpossibleException();
		}
	}

	public static VbVarType findNotResultType(char c, VbVarType varType) {
		return null;
	}

	public static VbVarType findOpResultType(VbVarType varType, VbVarType varType2, char c) {
		return null;
	}
}
