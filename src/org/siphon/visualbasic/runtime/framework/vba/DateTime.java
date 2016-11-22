package org.siphon.visualbasic.runtime.framework.vba;

import java.util.Date;

import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.framework.VbMethod;

public class DateTime {
	
	@VbMethod
	public static VbValue Now(){		// 这是一个属性，但是 Module 是没有属性的，也没有 Static 属性，估计要用 GlobalInstance 的类来实现
		return new VbValue(VbVarType.VbVariant, VbValue.fromJava(new Date()));
	}
	
	@VbMethod
	public static VbValue Time(){
		Date d = new Date();
		double v = (d.getTime() % 86400000 + java.util.TimeZone.getDefault().getRawOffset()) / 86400000.0;
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbDate, v));
	}
	
	@VbMethod
	public static VbValue Date(){
		Date d = new Date();
		long v = (d.getTime() + java.util.TimeZone.getDefault().getRawOffset()) / 86400000;
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbDate, (double)v));
	}
	
	@VbMethod
	public static VbValue Date$(){
		return VbValue.CStr(Date());
	}
	
	@VbMethod("Function DateAdd(Interval As String, Number As Double, Date)")
	public static VbValue DateAdd(String Interval, double Number, VbValue date){
		return VbValue.Empty;
	}
	
//	//Function DateDiff(Interval As String, Date1, Date2, [FirstDayOfWeek As VbDayOfWeek = vbSunday], [FirstWeekOfYear As VbFirstWeekOfYear = vbFirstJan1])
//	@VbMethod
//	public static VbValue DateDiff(String Interval, VbValue date1, VbValue date2, FirstDayOfWeek){
//		
//	}
    
}
