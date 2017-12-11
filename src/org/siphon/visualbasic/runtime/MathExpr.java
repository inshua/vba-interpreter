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

import java.math.BigDecimal;

import org.apache.commons.lang3.ArrayUtils;
import org.siphon.visualbasic.OverflowException;
import org.siphon.visualbasic.compile.ImpossibleException;

public class MathExpr {

	// Byte、Integer、Long、Single、Double、Currency 和 Decimal
	public static final int[] AddSubtractTypeOrder = new int[] { VbVarType.vbByte, VbVarType.vbInteger, VbVarType.vbLong, VbVarType.vbSingle, VbVarType.vbDouble, VbVarType.vbCurrency, VbVarType.vbDecimal };
	
	// Byte、 Integer、Long、Single、Currency、Double 和 Decimal
	public static final int[] MultiTypeOrder = new int[] { VbVarType.vbByte, VbVarType.vbInteger, VbVarType.vbLong, VbVarType.vbSingle, VbVarType.vbCurrency, VbVarType.vbDouble, VbVarType.vbDecimal };
	
	/* 
	 * 
	 * 加法：
	 * 存在一个运算数是 Variant，结果一定是 Variant
		数值+数值，得到数值，但是有可能溢出
		Single + Long 得到 Double
		数值+数值/V， 得到 Variant，溢出时升级，得到 升级类型/V
		日期当数值（Double）处理，得到日期，超出范围则：如结果是 V 转为 Double， 否则报溢出
		Boolean 当数值处理（Integer），得到数字
		字符串，如两个都是字符串，不论是不是数字字符串，直接连接，其它情况都执行 CDbl
		
		减法、乘法与加法雷同，唯减法、乘法不带有字符串连接效果，乘法不返回 Date，Date 视为 Double，其余相同
		除法：除非有 Single 参与运算，其它类型（含CURRENCY）一概返回 Double，包括 1/1。 Single 与比它低阶的类型（不含Long）相除，结果为 Single。
			Decimal 比 Double 更高例外。

	 	MSDN 里对数学运算的介绍错谬连篇。
	*/
	public static VbValue add(VbValue num1, VbValue num2) throws OverflowException {
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		
		VbVarType resultType = null;
		Object result = null;

		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		if (num1.isVariant())
			num1 = (VbValue) num1.value;
		if (num2.isVariant())
			num2 = (VbValue) num2.value;

		if (num1.isString() && num2.isString()) {
			result = new VbValue(VbVarType.VbString, (String) num1.value + (String) num2.value);
			if (returnVariant) {
				return VbValue.CVar((VbValue) result);
			} else {
				return (VbValue) result;
			}
		}

		if (num1.isString() && num2.isEmpty())
			return VbValue.CVar((VbValue) num1);
		if (num2.isString() && num1.isEmpty())
			return VbValue.CVar((VbValue) num2);

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

		boolean returnDate = false;
		if (num1.varType.vbType == VbVarType.vbDate) {
			num1 = VbValue.cast(num1, VbVarType.vbDouble);
			returnDate = true;
		}
		if (num2.varType.vbType == VbVarType.vbDate) {
			num2 = VbValue.cast(num2, VbVarType.vbDouble);
			returnDate = true;
		}

		if (num1.value instanceof Number == false)
			throw new ClassCastException();
		if (num2.value instanceof Number == false)
			throw new ClassCastException();

		int t = 0;
		if (num1.varType.vbType == VbVarType.vbSingle && num2.varType.vbType == VbVarType.vbLong) {
			resultType = VbVarType.VbDouble;
			t = VbVarType.vbDouble;
		} else if (num2.varType.vbType == VbVarType.vbSingle && num1.varType.vbType == VbVarType.vbLong) {
			resultType = VbVarType.VbDouble;
			t = VbVarType.vbDouble;
		} else {
			t = num1.varType.vbType;
			int typeOrder1 = ArrayUtils.indexOf(AddSubtractTypeOrder, num1.varType.vbType);
			int typeOrder2 = ArrayUtils.indexOf(AddSubtractTypeOrder, num2.varType.vbType);
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
		}

		while (true) {
			try {
				result = add((Number) num1.value, (Number) num2.value);

				if (returnDate) {
					if(t == VbVarType.vbCurrency){
						result = new VbValue(VbVarType.VbDate, VbValue.currencyToDouble((Long)result));
					} else {
						result = new VbValue(VbVarType.VbDate, (Double) result);
					}
				} else {
					result = new VbValue(resultType, result);
				}
				break;
			} catch (ArithmeticException | OverflowException e) {
				if (returnVariant) {
					switch (t) {
					case VbVarType.vbByte:
						t = VbVarType.vbInteger;
						resultType = VbVarType.VbInteger;
						num1 = VbValue.cast(num1, t);
						num2 = VbValue.cast(num2, t);
						break;
					case VbVarType.vbInteger:
						t = VbVarType.vbLong;
						resultType = VbVarType.VbLong;
						num1 = VbValue.cast(num1, t);
						num2 = VbValue.cast(num2, t);
						break;
					case VbVarType.vbSingle:
						t = VbVarType.vbDouble;
						resultType = VbVarType.VbDouble;
						num1 = VbValue.cast(num1, t);
						num2 = VbValue.cast(num2, t);
						break;
					case VbVarType.vbCurrency:
					case VbVarType.vbDouble:
						if (returnDate) {
							returnDate = false;
						} else {
							throw new OverflowException();
						}
						break;
					default:
						throw new OverflowException();
					}
				} else {
					throw new OverflowException();
				}
			}
		}

		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, result);
		} else {
			return (VbValue) result;
		}
	}

	public static VbValue subtract(VbValue num1, VbValue num2) throws OverflowException {
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		
		VbVarType resultType = null;
		Object result = null;

		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		if (num1.isVariant())
			num1 = (VbValue) num1.value;
		if (num2.isVariant())
			num2 = (VbValue) num2.value;

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

		boolean returnDate = false;
		if (num1.varType.vbType == VbVarType.vbDate) {
			num1 = VbValue.cast(num1, VbVarType.vbDouble);
			returnDate = true;
		}
		if (num2.varType.vbType == VbVarType.vbDate) {
			num2 = VbValue.cast(num2, VbVarType.vbDouble);
			returnDate = true;
		}

		if (num1.value instanceof Number == false)
			throw new ClassCastException();
		if (num2.value instanceof Number == false)
			throw new ClassCastException();

		int t = 0;
		if (num1.varType.vbType == VbVarType.vbSingle && num2.varType.vbType == VbVarType.vbLong) {
			resultType = VbVarType.VbDouble;
			t = VbVarType.vbDouble;
		} else if (num2.varType.vbType == VbVarType.vbSingle && num1.varType.vbType == VbVarType.vbLong) {
			resultType = VbVarType.VbDouble;
			t = VbVarType.vbDouble;
		} else {
			t = num1.varType.vbType;
			int typeOrder1 = ArrayUtils.indexOf(AddSubtractTypeOrder, num1.varType.vbType);
			int typeOrder2 = ArrayUtils.indexOf(AddSubtractTypeOrder, num2.varType.vbType);
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
		}

		while (true) {
			try {
				result = subtract((Number) num1.value, (Number) num2.value);

				if (returnDate) {
					if(t == VbVarType.vbCurrency){
						result = new VbValue(VbVarType.VbDate, VbValue.currencyToDouble((Long)result));
					} else {
						result = new VbValue(VbVarType.VbDate, (Double) result);
					}
				} else {
					result = new VbValue(resultType, result);
				}
				break;
			} catch (ArithmeticException | OverflowException e) {
				if (returnVariant) {
					switch (t) {
					case VbVarType.vbByte:
						t = VbVarType.vbInteger;
						resultType = VbVarType.VbInteger;
						num1 = VbValue.cast(num1, t);
						num2 = VbValue.cast(num2, t);
						break;
					case VbVarType.vbInteger:
						t = VbVarType.vbLong;
						resultType = VbVarType.VbLong;
						num1 = VbValue.cast(num1, t);
						num2 = VbValue.cast(num2, t);
						break;
					case VbVarType.vbSingle:
						t = VbVarType.vbDouble;
						resultType = VbVarType.VbDouble;
						num1 = VbValue.cast(num1, t);
						num2 = VbValue.cast(num2, t);
						break;
					case VbVarType.vbCurrency:
					case VbVarType.vbDouble:
						if (returnDate) {
							returnDate = false;
						} else {
							throw new OverflowException();
						}
						break;
					default:
						throw new OverflowException();
					}
				} else {
					throw new OverflowException();
				}
			}
		}

		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, result);
		} else {
			return (VbValue) result;
		}
	}

	public static VbValue multi(VbValue num1, VbValue num2) throws OverflowException {
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		
		VbVarType resultType = null;
		Object result = null;

		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		if (num1.isVariant())
			num1 = (VbValue) num1.value;
		if (num2.isVariant())
			num2 = (VbValue) num2.value;

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

		if (num1.varType.vbType == VbVarType.vbDate) {
			num1 = VbValue.cast(num1, VbVarType.vbDouble);
		}
		if (num2.varType.vbType == VbVarType.vbDate) {
			num2 = VbValue.cast(num2, VbVarType.vbDouble);
		}

		if (num1.value instanceof Number == false)
			throw new ClassCastException();
		if (num2.value instanceof Number == false)
			throw new ClassCastException();

		int t = 0;
		if (num1.varType.vbType == VbVarType.vbSingle && num2.varType.vbType == VbVarType.vbLong) {
			resultType = VbVarType.VbDouble;
			t = VbVarType.vbDouble;
		} else if (num2.varType.vbType == VbVarType.vbSingle && num1.varType.vbType == VbVarType.vbLong) {
			resultType = VbVarType.VbDouble;
			t = VbVarType.vbDouble;
		} else {
			t = num1.varType.vbType;
			int typeOrder1 = ArrayUtils.indexOf(MultiTypeOrder, num1.varType.vbType);
			int typeOrder2 = ArrayUtils.indexOf(MultiTypeOrder, num2.varType.vbType);
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
		}

		while (true) {
			try {
				result = multi((Number) num1.value, (Number) num2.value);
				result = new VbValue(resultType, result);
				break;
			} catch (ArithmeticException | OverflowException e) {
				if (returnVariant) {
					switch (t) {
					case VbVarType.vbByte:
						t = VbVarType.vbInteger;
						resultType = VbVarType.VbInteger;
						num1 = VbValue.cast(num1, t);
						num2 = VbValue.cast(num2, t);
						break;
					case VbVarType.vbInteger:
						t = VbVarType.vbLong;
						resultType = VbVarType.VbLong;
						num1 = VbValue.cast(num1, t);
						num2 = VbValue.cast(num2, t);
						break;
					case VbVarType.vbSingle:
						t = VbVarType.vbDouble;
						resultType = VbVarType.VbDouble;
						num1 = VbValue.cast(num1, t);
						num2 = VbValue.cast(num2, t);
						break;
					default:
						throw new OverflowException();
					}
				} else {
					throw new OverflowException();
				}
			}
		}

		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, result);
		} else {
			return (VbValue) result;
		}
	}

	public static VbValue div(VbValue num1, VbValue num2) throws OverflowException {
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		
		VbVarType resultType = null;
		Object result = null;

		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		if (num1.isVariant())
			num1 = (VbValue) num1.value;
		if (num2.isVariant())
			num2 = (VbValue) num2.value;

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

		if (num1.varType.vbType == VbVarType.vbDate) {
			num1 = VbValue.cast(num1, VbVarType.vbDouble);
		}
		if (num2.varType.vbType == VbVarType.vbDate) {
			num2 = VbValue.cast(num2, VbVarType.vbDouble);
		}

		if (num1.value instanceof Number == false)
			throw new ClassCastException();
		if (num2.value instanceof Number == false)
			throw new ClassCastException();

		// 除法只有 Single、Double、Decimal 三种返回取值
		int t = VbVarType.vbDouble;
		resultType = VbVarType.VbDouble;
		if(num1.varType.vbType == VbVarType.vbDecimal){
			if(num2.varType.vbType != VbVarType.vbDecimal){
				num2 = VbValue.CDec(num2);
			}
			t = VbVarType.vbDecimal;
			resultType = VbVarType.VbDecimal;
		} else if(num2.varType.vbType == VbVarType.vbDecimal){
			num1 = VbValue.CDec(num1);
			t = VbVarType.vbDecimal;
			resultType = VbVarType.VbDecimal;
			
		} else if(num1.varType.vbType == VbVarType.vbDouble){
			if(num2.varType.vbType != VbVarType.vbDouble){
				num2 = VbValue.CDbl(num2);
			}
		} else if(num2.varType.vbType == VbVarType.vbDouble){
			num1 = VbValue.CDbl(num1);
			
		} else if(num1.varType.vbType == VbVarType.vbSingle){
			if(num2.varType.vbType == VbVarType.vbInteger || num2.varType.vbType == VbVarType.vbByte){
				num2 = VbValue.CSng(num2);
				t = VbVarType.vbSingle;
				resultType = VbVarType.VbSingle;
			} else {
				num1 = VbValue.CDbl(num1);
				num2 = VbValue.CDbl(num2);
			}
		} else if(num2.varType.vbType == VbVarType.vbSingle){
			if(num1.varType.vbType == VbVarType.vbInteger || num1.varType.vbType == VbVarType.vbByte){
				num1 = VbValue.CSng(num1);
				t = VbVarType.vbSingle;
				resultType = VbVarType.VbSingle;
			} else {
				num1 = VbValue.CDbl(num1);
				num2 = VbValue.CDbl(num2);
			}
		} else {
			num1 = VbValue.CDbl(num1);
			num2 = VbValue.CDbl(num2);
		}
		

		while (true) {
			try {
				result = div((Number) num1.value, (Number) num2.value);
				result = new VbValue(resultType, result);
				break;
			} catch (ArithmeticException | OverflowException e) {
				if (returnVariant) {
					switch (t) {
					case VbVarType.vbSingle:
						t = VbVarType.vbDouble;
						resultType = VbVarType.VbDouble;
						num1 = VbValue.cast(num1, t);
						num2 = VbValue.cast(num2, t);
						break;
					default:
						if(((Number)num2.value).doubleValue() == 0){
							throw new DivByZeroException();
						} else {
							throw new OverflowException();
						}
					}
				} else {
					if(((Number)num2.value).doubleValue() == 0){
						throw new DivByZeroException();
					} else {
						throw new OverflowException();
					}
				}
			}
		}

		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, result);
		} else {
			return (VbValue) result;
		}
	}
	
	// 整除
	public static VbValue idiv(VbValue num1, VbValue num2) throws OverflowException {
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		
		VbVarType resultType = null;
		Object result = null;

		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		if (num1.isVariant())
			num1 = (VbValue) num1.value;
		if (num2.isVariant())
			num2 = (VbValue) num2.value;

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

		if (num1.varType.vbType == VbVarType.vbDate) {
			num1 = VbValue.cast(num1, VbVarType.vbDouble);
		}
		if (num2.varType.vbType == VbVarType.vbDate) {
			num2 = VbValue.cast(num2, VbVarType.vbDouble);
		}

		if (num1.value instanceof Number == false)
			throw new ClassCastException();
		if (num2.value instanceof Number == false)
			throw new ClassCastException();

		// 整除只有 Byte、Integer、Long 三种返回取值
		int t = 0;

		int type1 = num1.varType.vbType;
		if(type1 == VbVarType.vbDouble || type1 == VbVarType.vbSingle 
				|| type1 == VbVarType.vbCurrency || type1 == VbVarType.vbSingle
				|| type1 == VbVarType.vbDecimal ){
			num1 = VbValue.CLng(num1);
		}
		int type2 = num2.varType.vbType;
		if(type2 == VbVarType.vbDouble || type2 == VbVarType.vbSingle 
				|| type2 == VbVarType.vbCurrency || type2 == VbVarType.vbSingle
				|| type2 == VbVarType.vbDecimal){
			num2 = VbValue.CLng(num2);
		}
		
		int typeOrder1 = ArrayUtils.indexOf(AddSubtractTypeOrder, num1.varType.vbType);
		int typeOrder2 = ArrayUtils.indexOf(AddSubtractTypeOrder, num2.varType.vbType);
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
		
		while (true) {
			try {
				result = idiv((Number) num1.value, (Number) num2.value);
				assert result instanceof Integer || result instanceof Long;
				result = new VbValue(resultType, result);
				break;
			} catch (ArithmeticException | OverflowException e) {
				if(((Number)num2.value).doubleValue() == 0){
					throw new DivByZeroException();
				} else {
					throw new OverflowException();
				}
			}
		}

		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, result);
		} else {
			return (VbValue) result;
		}
	}
	
	public static VbValue power(VbValue num1, VbValue num2) throws OverflowException {
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		
		VbVarType resultType = null;
		Object result = null;

		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		if (num1.isVariant())
			num1 = (VbValue) num1.value;
		if (num2.isVariant())
			num2 = (VbValue) num2.value;

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
			num1 = new VbValue(VbVarType.VbDouble, 0);
		if (num2.varType.vbType == VbVarType.vbEmpty)
			num2 = new VbValue(VbVarType.VbDouble, 0);

		if (num1.varType.vbType == VbVarType.vbBoolean)
			num1 = VbValue.cast(num1, VbVarType.vbDouble);
		if (num2.varType.vbType == VbVarType.vbBoolean)
			num2 = VbValue.cast(num2, VbVarType.vbDouble);

		if (num1.varType.vbType == VbVarType.vbDate) {
			num1 = VbValue.cast(num1, VbVarType.vbDouble);
		}
		if (num2.varType.vbType == VbVarType.vbDate) {
			num2 = VbValue.cast(num2, VbVarType.vbDouble);
		}

		if (num1.value instanceof Number == false)
			throw new ClassCastException();
		if (num2.value instanceof Number == false)
			throw new ClassCastException();
		
		resultType = VbVarType.VbDouble;
		if(num1.varType.vbType == VbVarType.vbDecimal){
			resultType = VbVarType.VbDecimal;
			if(num2.varType.vbType != VbVarType.vbDecimal){
				num2 = VbValue.cast(num2, VbVarType.vbDecimal);
			}
		} else if(num2.varType.vbType == VbVarType.vbDecimal){
			num1 = VbValue.cast(num1, VbVarType.vbDecimal);
			resultType = VbVarType.VbDecimal;
		} else {
			if(num1.varType.vbType != VbVarType.vbDouble){
				num1 = VbValue.cast(num1, VbVarType.vbDouble);
			}
			if(num2.varType.vbType != VbVarType.vbDouble){
				num2 = VbValue.cast(num2, VbVarType.vbDouble);
			}
		}

		while (true) {
			try {
				result = power((Number) num1.value, (Number) num2.value);
				result = new VbValue(resultType, result);
				break;
			} catch (ArithmeticException | OverflowException e) {
				throw new OverflowException();
			}
		}

		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, result);
		} else {
			return (VbValue) result;
		}
	}
	
	public static VbValue mod(VbValue num1, VbValue num2) throws OverflowException {
		if(num1.isNull() || num2.isNull()){
			return VbValue.Null;
		}
		if(num1.isError() || num2.isError()){
			throw new ClassCastException();
		}
		
		VbVarType resultType = null;
		Object result = null;

		boolean returnVariant = (num1.isVariant() || num2.isVariant());
		if (num1.isVariant())
			num1 = (VbValue) num1.value;
		if (num2.isVariant())
			num2 = (VbValue) num2.value;

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

		if (num1.varType.vbType == VbVarType.vbDate) {
			num1 = VbValue.cast(num1, VbVarType.vbDouble);
		}
		if (num2.varType.vbType == VbVarType.vbDate) {
			num2 = VbValue.cast(num2, VbVarType.vbDouble);
		}

		if (num1.value instanceof Number == false)
			throw new ClassCastException();
		if (num2.value instanceof Number == false)
			throw new ClassCastException();

		// 除法只有 Single、Double、Decimal 三种返回取值
		int t = 0;

		int type1 = num1.varType.vbType;
		if(type1 == VbVarType.vbDouble || type1 == VbVarType.vbSingle 
				|| type1 == VbVarType.vbCurrency || type1 == VbVarType.vbSingle
				|| type1 == VbVarType.vbDecimal ){
			num1 = VbValue.CLng(num1);
		}
		int type2 = num2.varType.vbType;
		if(type2 == VbVarType.vbDouble || type2 == VbVarType.vbSingle 
				|| type2 == VbVarType.vbCurrency || type2 == VbVarType.vbSingle
				|| type2 == VbVarType.vbDecimal){
			num2 = VbValue.CLng(num2);
		}
		
		int typeOrder1 = ArrayUtils.indexOf(AddSubtractTypeOrder, num1.varType.vbType);
		int typeOrder2 = ArrayUtils.indexOf(AddSubtractTypeOrder, num2.varType.vbType);
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
		
		while (true) {
			try {
				result = mod((Number) num1.value, (Number) num2.value);
				assert result instanceof Integer || result instanceof Long;
				result = new VbValue(resultType, result);
				break;
			} catch (ArithmeticException | OverflowException e) {
				throw new ImpossibleException();
			}
		}

		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, result);
		} else {
			return (VbValue) result;
		}
	}

	public static Number add(Number n1, Number n2) {
		Class c = n1.getClass();
		if (c == Integer.class) {
			return Math.addExact(n1.intValue(), n2.intValue());
		} else if (c == Long.class) {
			return Math.addExact(n1.longValue(), n2.longValue());
		} else if (c == Double.class) {
			return n1.doubleValue() + n2.doubleValue();
		} else if (c == Float.class) {
			return n1.floatValue() + n2.floatValue();
		} else if (c == BigDecimal.class) {
			return ((BigDecimal) n1).add((BigDecimal) n2);
		} else {
			throw new UnsupportedOperationException(n1 + " and " + n2 + " cannot add together");
		}
	}

	public static Number subtract(Number n1, Number n2) {
		Class c = n1.getClass();
		if (c == Integer.class) {
			return Math.subtractExact(n1.intValue(), n2.intValue());
		} else if (c == Long.class) {
			return Math.subtractExact(n1.longValue(), n2.longValue());
		} else if (c == Double.class) {
			return n1.doubleValue() - n2.doubleValue();
		} else if (c == Float.class) {
			return n1.floatValue() - n2.floatValue();
		} else if (c == BigDecimal.class) {
			return ((BigDecimal) n1).add((BigDecimal) n2);
		} else {
			throw new UnsupportedOperationException(n1 + " and " + n2 + " cannot subtract together");
		}
	}

	public static Number div(Number n1, Number n2) {
		Class c = n1.getClass();
		if (c == Integer.class) {
			return n1.doubleValue() / n2.doubleValue();
		} else if (c == Long.class) {
			return n1.doubleValue() / n2.doubleValue();
		} else if (c == Double.class) {
			return n1.doubleValue() / n2.doubleValue();
		} else if (c == Float.class) {
			return n1.floatValue() / n2.floatValue();
		} else if (c == BigDecimal.class) {
			return ((BigDecimal) n1).divide((BigDecimal) n2);
		} else {
			throw new UnsupportedOperationException(n1 + " and " + n2 + " cannot subtract together");
		}
	}
	
	public static Number idiv(Number n1, Number n2) {
		Class c = n1.getClass();
		if (c == Integer.class) {
			return n1.intValue() / n2.intValue();
		} else if (c == Long.class) {
			return n1.longValue() / n2.longValue();
		} else {
			throw new UnsupportedOperationException(n1 + " and " + n2 + " cannot subtract together");
		}
	}
	
	public static Number mod(Number n1, Number n2) {
		Class c = n1.getClass();
		if (c == Integer.class) {
			return n1.intValue() % n2.intValue();
		} else if (c == Long.class) {
			return n1.longValue() % n2.longValue();
		} else {
			throw new UnsupportedOperationException(n1 + " and " + n2 + " cannot subtract together");
		}
	}

	public static Number multi(Number n1, Number n2) {
		Class c = n1.getClass();
		if (c == Integer.class) {
			return Math.multiplyExact(n1.intValue(), n2.intValue());
		} else if (c == Long.class) {
			return Math.multiplyExact(n1.longValue(), n2.longValue());
		} else if (c == Double.class) {
			return n1.doubleValue() * n2.doubleValue();
		} else if (c == Float.class) {
			return n1.floatValue() * n2.floatValue();
		} else if (c == BigDecimal.class) {
			return ((BigDecimal) n1).multiply((BigDecimal) n2);
		} else {
			throw new UnsupportedOperationException(n1 + " and " + n2 + " cannot subtract together");
		}
	}

	public static VbValue e(VbValue n1, VbValue n2) {
		Number a = (Number) n1.value;
		long b = ((Number) n2.value).longValue();
		return new VbValue(VbVarType.VbDouble, a.doubleValue() * Math.pow(10, b));
		
//		Class c = a.getClass();
//		if (c == Integer.class) {
//			return Math.multiplyExact(n1.intValue(), (int) Math.pow(10, n2.intValue()));
//		} else if (c == Long.class) {
//			return Math.multiplyExact(n1.longValue(), (long) Math.pow(10, n2.longValue()));
//		} else if (c == Double.class) {
//			return n1.doubleValue() * Math.pow(10, n2.doubleValue());
//		} else if (c == Float.class) {
//			return n1.floatValue() * Math.pow(10, n2.floatValue());
//		} else {
//			throw new UnsupportedOperationException(n1 + " and " + n2 + " cannot add together");
//		}
	}

	public static Number power(Number n1, Number n2) {
		Class c = n1.getClass();
		if (c == Integer.class || c == Long.class || c == Double.class || c == Float.class) {
			return Math.pow(n1.doubleValue(), n2.doubleValue());
		} else if (c == BigDecimal.class) {
			return new BigDecimal(Math.pow(n1.doubleValue(), n2.doubleValue()));
		} else {
			throw new UnsupportedOperationException(n1 + " and " + n2 + " cannot power together");
		}
	}

	// 正
	public static VbValue pos(VbValue number) {
		if(number.isNull()){
			return VbValue.Null;
		}
		if(number.isError()){
			throw new ClassCastException();
		}
		
		boolean returnVariant = number.isVariant();

		if(returnVariant){
			number = (VbValue) number.value;
		}
		
		if (number.isString()) {	// VB 的 +v 似乎相当于 Empty + v，所以并不带有转换为数字的功能，但这样没有实用性，因此当转数字处理
			number = VbValue.CDbl(number);
			if(returnVariant){
				return new VbValue(VbVarType.VbVariant, number);
			} else {
				return number;
			}
		}

		if (number.varType.vbType == VbVarType.vbEmpty)
			number = new VbValue(VbVarType.VbInteger, 0);

		if (number.varType.vbType == VbVarType.vbBoolean)
			number = VbValue.cast(number, VbVarType.vbInteger);

		if (number.value instanceof Number == false)
			throw new ClassCastException();

		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, number);
		} else {
			return number;
		}
	}
	
	// 负
	public static VbValue neg(VbValue number) {
		if(number.isNull()){
			return VbValue.Null;
		}
		if(number.isError()){
			throw new ClassCastException();
		}
		
		boolean returnVariant = number.isVariant();
		
		if(returnVariant){
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
		} else if (number.varType.vbType == VbVarType.vbBoolean){
			number = VbValue.cast(number, VbVarType.vbInteger);
		}
		
		boolean returnDate = false;
		if (number.varType.vbType == VbVarType.vbDate) {
			number = VbValue.CDbl(number);
			returnDate = true;
		}

		if (number.value instanceof Number == false)
			throw new ClassCastException();
		
		if(number.varType.vbType == VbVarType.vbByte){	// 在VB里, -CByte(0) 也是 Integer
			number = VbValue.CInt(number);
		}

		int t = number.varType.vbType;
		VbVarType resultType = number.varType;
		while (true) {
			try {
				Number v = neg((Number)number.value);

				if (returnDate) {
					number = new VbValue(VbVarType.VbDate, (Double) v);
				} else {
					number = new VbValue(resultType, v);	
				}
				break;
			} catch (ArithmeticException | OverflowException e) {
				if (returnVariant) {
					switch (t) {
					case VbVarType.vbInteger:	// int 范围 -32768, 32767，可能因为逆转导致溢出
						t = VbVarType.vbLong;
						resultType = VbVarType.VbLong;
						number = VbValue.cast(number, t);
						break;
					case VbVarType.vbSingle:
						t = VbVarType.vbDouble;
						resultType = VbVarType.VbDouble;
						number = VbValue.cast(number, t);
						break;
					case VbVarType.vbCurrency:
					case VbVarType.vbDouble:
						if (returnDate) {
							returnDate = false;
						} else {
							throw new OverflowException();
						}
						break;
					default:
						throw new OverflowException();
					}
				} else {
					throw new OverflowException();
				}
			}
		}

		if (returnVariant) {
			return new VbValue(VbVarType.VbVariant, number);
		} else {
			return number;
		}
	}

	public static Number neg(Number value) {
		Class c = value.getClass();
		if (c == Integer.class) {
			return -(Integer)value;
		} else if (c == Long.class) {
			return -(Long)value;
		} else if (c == Double.class) {
			return -(Double)value;
		} else if (c == Float.class) {
			return -(Float)value;
		} else if (c == BigDecimal.class) {
			return ((BigDecimal)value).negate();
		} else {
			throw new UnsupportedOperationException(value + " cannot neg");
		}
	}

	public static boolean eqZero(Number n) {
		if(n instanceof Integer){
			return n.intValue() == 0;
		} else if(n instanceof Long){
			return n.longValue() == 0;
		} else if(n instanceof Double){
			return n.doubleValue() == 0;
		} else if(n instanceof Float){
			return n.floatValue() == 0;
		} else if(n instanceof BigDecimal){
			return ((BigDecimal)n).equals(0);
		} else {
			throw new ImpossibleException();
		}
	}
}
