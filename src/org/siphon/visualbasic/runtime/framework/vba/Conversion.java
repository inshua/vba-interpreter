package org.siphon.visualbasic.runtime.framework.vba;

import java.math.BigDecimal;

public class Conversion {


	/**
	 * double 类型数字转为其它数字类型
	 * 很多数学运算都是用 double 完成的
	 * @param value
	 * @param numberType
	 * @return
	 */
	public static Object doubleToNumType(double value, Class<? extends Number> numberType) {
		if(numberType == java.lang.Double.class){
			return value;
		} else if(numberType == java.lang.Integer.class){
			return (int)value;
		} else if(numberType  == java.lang.Long.class){
			return (long)value;
		} else if (numberType == java.lang.Float.class){
			return (float) value;
		} else if(numberType == BigDecimal.class){
			return new BigDecimal(value);
		} else {
			throw new ClassCastException(value + " cannot cast to " + numberType.getName());
		}
	}

}
