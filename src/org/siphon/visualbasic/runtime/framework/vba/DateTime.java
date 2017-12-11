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

import java.util.Date;

import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.Enums.VbDayOfWeek;

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
	
//	@VbMethod("Function DateAdd(Interval As String, Number As Double, Date)")
//	public static VbValue DateAdd(String Interval, double Number, VbValue date){
//		return VbValue.Empty;
//	}
//	
//	@VbMethod("DateDiff(Interval As String, Date1, Date2, Optional FirstDayOfWeek As VbDayOfWeek = vbSunday], Optional FirstWeekOfYear As VbFirstWeekOfYear = vbFirstJan1)")
//	public static VbValue DateDiff(String Interval, VbValue date1, VbValue date2, int FirstDayOfWeek, int FirstWeekOfYear){
//		return VbValue.Empty;
//	}
    
}
