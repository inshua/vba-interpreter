package org.siphon.visualbasic.runtime.framework.vba;

import java.util.Date;

import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.framework.VbMethod;

public class DateTime {
	
	@VbMethod
	public static Object Now(){		// 这是一个属性，但是 Module 是没有属性的，也没有 Static 属性，估计要用 GlobalInstance 的类来实现
		return new VbValue(VbVarType.VbVariant, VbValue.fromJava(new Date()));
	}
	
	@VbMethod
	public static Object Time(){
		Date d = new Date();
		double v = (d.getTime() % 86400000 + java.util.TimeZone.getDefault().getRawOffset()) / 86400000.0;
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbDate, v));
	}
}
