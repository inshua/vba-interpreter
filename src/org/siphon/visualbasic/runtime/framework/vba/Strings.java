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

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.runtime.UdtInstance;
import org.siphon.visualbasic.runtime.VbArray;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.VbVarType.TypeEnum;
import org.siphon.visualbasic.runtime.framework.Enums;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.VbParam;

public class Strings {

	@VbMethod
	public static VbValue Mid(@VbParam(name = "String") VbValue string,
			@VbParam(name = "Start", type = TypeEnum.vbLong) VbValue start,
			@VbParam(name = "Length", optional = true) VbValue length) {

		String s = (String) string.toJava();

		Long from = (Long) start.toJava() - 1;
		String result = null;
		if (length.isMissing()) {
			result = s.substring(from.intValue());
		} else {
			result = s.substring(from.intValue(), from.intValue() + ((Number) length.toJava()).intValue());
		}

		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbString, result));
	}

	@VbMethod("Function MonthName(Month As Long, Optional Abbreviate As Boolean = False) As String")
	public static String monthName(int month, boolean abbreviate) {
		month = month - 1;
		if (abbreviate) {
			return new DateFormatSymbols().getShortMonths()[month];
		} else {
			return new DateFormatSymbols().getMonths()[month];
		}
	}

	@VbMethod("Function AscB(String As String) As Integer")
	public static int AscB(String String1) {
		return String1.getBytes()[0];
	}

	@VbMethod("Function AscW(String As String) As Integer")
	public static int AscW(String String1) {
		return Asc(String1);
	}

	@VbMethod("Function Asc(String As String) As Integer")
	public static int Asc(String String1) {
		return String1.charAt(0);
	}

	@VbMethod("Function ChrB(CharCode As Long)")
	public static String ChrB(int Char) {
		return Chr(Char);
	}

	@VbMethod("Function ChrB$(CharCode As Long)")
	public static String ChrB$(int Char) {
		return ChrB(Char);
	}

	@VbMethod("Function ChrW(CharCode As Long)")
	public static String ChrW(int Char) {
		return Chr(Char);
	}

	@VbMethod("Function ChrW$(CharCode As Long) As String")
	public static String ChrW$(int Char) {
		return Chr(Char);
	}

	@VbMethod("Function Chr(CharCode As Long)")
	public static String Chr(int Char) {
		byte[] b = { (byte) Char };
		try {
			return new String(b, "utf-8");
		} catch (Exception e) {
		}
		return new String(b);
	}

	@VbMethod("Function Chr$(CharCode As Long) As String")
	public static String Chr$(int Char) {
		return Chr(Char);
	}

	@VbMethod("Function InStr(Optional Start, Optional String1, Optional String2, Optional Compare As VbCompareMethod = vbBinaryCompare)")
	public static VbValue InStr(VbValue Start, VbValue String1, VbValue String2, VbValue Compare) throws VbRuntimeException {
		int start = 1;
		String string1 = null, string2 = null;
		int compare = Enums.VbCompareMethod.vbBinaryCompare;

		if (Compare.isMissing() && String2.isMissing()) {
			string1 = (String) VbValue.CStr(Start).value;
			string2 = (String) VbValue.CStr(String1).value;
		} else {
			start = (int) VbValue.CInt(Start).value;
			string1 = (String) VbValue.CStr(String1).value;
			string2 = (String) VbValue.CStr(String2).value;
		}

		if (start < 1) {
			throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
		}

		if (StringUtils.isEmpty(string1)) {
			return VbValue.Empty.clone();
		}

		if (StringUtils.isEmpty(string2)) {
			return VbValue.Empty.clone();
		}

		if (start > string1.length()) {
			return VbValue.Empty.clone();
		}

		if (compare == Enums.VbCompareMethod.vbTextCompare) {
			string1 = string1.toLowerCase();
			string2 = string2.toLowerCase();
		}

		int i = string1.indexOf(string2, start - 1);

		return new VbValue(VbVarType.VbVariant, VbValue.fromJava(i + 1));

	}
	
	
	@VbMethod("Function InStrRev(Optional Start, Optional String1, Optional String2, Optional Compare As VbCompareMethod = vbBinaryCompare) As Long")
	public static VbValue InStrRev(VbValue Start, VbValue String1, VbValue String2, VbValue Compare) throws VbRuntimeException {
		int start = 1;
		String string1 = null, string2 = null;
		int compare = Enums.VbCompareMethod.vbBinaryCompare;

		if (Compare.isMissing() && String2.isMissing()) {
			string1 = (String) VbValue.CStr(Start).value;
			string2 = (String) VbValue.CStr(String1).value;
		} else {
			start = (int) VbValue.CInt(Start).value;
			string1 = (String) VbValue.CStr(String1).value;
			string2 = (String) VbValue.CStr(String2).value;
		}

		if (start < 1) {
			throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
		}

		if (StringUtils.isEmpty(string1)) {
			return VbValue.Empty.clone();
		}

		if (StringUtils.isEmpty(string2)) {
			return VbValue.Empty.clone();
		}

		if (start > string1.length()) {
			return VbValue.Empty.clone();
		}

		if (compare == Enums.VbCompareMethod.vbTextCompare) {
			string1 = string1.toLowerCase();
			string2 = string2.toLowerCase();
		}

		int i = string1.lastIndexOf(string2, start - 1);

		return VbValue.fromJava(i + 1);

	}

	@VbMethod("Function Join(SourceArray, Optional Delimiter) As String")
	public static String join(VbValue array, VbValue delimiter) throws VbRuntimeException {
		if (array.isVariant())
			array = (VbValue) array.value;
		if (array.varType.vbType != VbVarType.vbArray) {
			throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
		}
		VbArray a = (VbArray) array;
		if (a.getArrayDef().ranks.length > 1) {
			throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
		}
		String d = " ";
		if (!delimiter.isMissing()) {
			d = (String) VbValue.CStr(delimiter).value;
		}
		StringBuffer sb = new StringBuffer();
		for (Iterator<VbValue> it = a.iterator(); it.hasNext();) {
			VbValue v = it.next();
			sb.append(VbValue.CStr(v).value);
			if (it.hasNext()) {
				sb.append(d);
			}
		}
		return sb.toString();
	}

	@VbMethod("Function LCase(String)")
	public static VbValue LCase(VbValue string) {
		String s = (String) VbValue.CStr(string).value;
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbString, s.toLowerCase()));
	}

	@VbMethod("Function LCase$(String As String) As String")
	public static String LCase$(String string) {
		return string.toLowerCase();
	}

	@VbMethod("Function Left(String, Length As Long)")
	public static VbValue Left(VbValue string, long length) throws VbRuntimeException {
		if (length < 0)
			throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
		if (string.isEmpty() || string.isNull() || length == 0)
			return new VbValue(VbVarType.VbString, "");
		String s = (String) VbValue.CStr(string).value;
		if (length > s.length())
			length = s.length();
		s = s.substring(0, (int) length - 1);
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbString, s));
	}

	@VbMethod("Function Left$(String As String, Length As Long) As String")
	public static String Left$(String string, long length) throws VbRuntimeException {
		if (length < 0)
			throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
		if (string == null || string.isEmpty() || length == 0)
			return "";
		if (length > string.length())
			length = string.length();
		return string.substring(0, (int) length - 1);
	}

	@VbMethod("Function Right(String, Length As Long)")
	public static VbValue Right(VbValue string, long length) throws VbRuntimeException {
		if (length < 0)
			throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
		if (string.isEmpty() || string.isNull() || length == 0)
			return new VbValue(VbVarType.VbString, "");
		String s = (String) VbValue.CStr(string).value;
		if (length > s.length())
			return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbString, s));
		s = s.substring((int) length - 1);
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbString, s));
	}

	@VbMethod("Function Right$(String As String, Length As Long) As String")
	public static String Right$(String string, long length) throws VbRuntimeException {
		if (length < 0)
			throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
		if (string == null || string.isEmpty() || length == 0)
			return "";
		if (length > string.length())
			return string;
		return string.substring((int) length - 1);
	}

	@VbMethod("Function Len(Expression)")
	public static int len(VbValue expression) {
		if(expression.isVariant()) expression = (VbValue) expression.value;
		switch(expression.varType.vbType){
		case VbVarType.vbString:
			return ((String)expression.value).length();
		case VbVarType.vbInteger:
			return 4;
		case VbVarType.vbLong:
			return 8;
		case VbVarType.vbBoolean:
			return 4;
		case VbVarType.vbByte:
			return 1;
		case VbVarType.vbDouble:
			return 8;
		case VbVarType.vbSingle:
			return 4;
		case VbVarType.vbEmpty:
			return 0;
		case VbVarType.vbDecimal:
			return 8;
		case VbVarType.vbCurrency:
			return 8;
		case VbVarType.vbDate:
			return 4;
		case VbVarType.vbError:
			return 4;
		case VbVarType.vbUserDefinedType:
			int size = 0;
			UdtInstance udt = (UdtInstance) expression.value;
			for(String n : udt.decl.members.keySet()){
				size += len(udt.getValue(n));
			}
			return size;
		default:
			throw new ClassCastException();
		}
	}
	
	@VbMethod("Function LenB(Expression)")
	public static int LenB(VbValue expression) {
		throw new UnsupportedOperationException("TODO");
	}

	@VbMethod("Function Filter(SourceArray, Match As String, Optional Include As Boolean = True, Optional Compare As VbCompareMethod = vbBinaryCompare)")
	public static VbValue Filter(VbValue sourceArray, String match, boolean include, int compare) throws Exception {
		if (sourceArray.isVariant())
			sourceArray = (VbValue) sourceArray.value;
		if (sourceArray.varType.vbType != VbVarType.vbArray) {
			throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
		}
		VbArray arr = (VbArray) sourceArray;
		if (arr.getArrayDef().ranks.length > 1) {
			throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
		}
		if (compare == Enums.VbCompareMethod.vbTextCompare) {
			match = match.toUpperCase();
		}
		List<String> ls = new ArrayList<>();
		for (Iterator<VbValue> it = arr.iterator(); it.hasNext();) {
			VbValue v = it.next();
			String s = (String) VbValue.CStr(v).value;
			if (compare == Enums.VbCompareMethod.vbTextCompare) {
				s = s.toUpperCase();
			}
			if (s.contains(match)) {
				if (include) {
					ls.add(s);
				}
			} else {
				if (!include) {
					ls.add(s);
				}
			}
		}
		VbArray result = VbArray.create(VbVarType.VbString, 0, ls.size() - 1);
		int i = 0;
		for (Iterator<String> it = ls.iterator(); it.hasNext();) {
			String s = (String) it.next();
			result.set(new Integer[] { i++ }, new VbValue(VbVarType.VbString, s), null);
		}
		return new VbValue(VbVarType.VbVariant, result);
	}

	@VbMethod("Function Format$(Expression, Optional Format, Optional FirstDayOfWeek As VbDayOfWeek = vbSunday, Optional FirstWeekOfYear As VbFirstWeekOfYear = vbFirstJan1) As String")
	public static String Format(VbValue Expression, VbValue Format, int firstDayOfWeek, int firstWeekOfYear) {
		//TODO
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod("Function FormatDateTime(Expression, Optioanl NamedFormat As VbDateTimeFormat = vbGeneralDate) As String")
	public static String formatDateTime(VbValue expression, int namedFormat){
		//TODO
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod("Function FormatNumber(Expression, Optional NumDigitsAfterDecimal As Long = -1, Optional IncludeLeadingDigit As VbTriState = vbUseDefault, Optional UseParensForNegativeNumbers As VbTriState = vbUseDefault], [GroupDigits As VbTriState = vbUseDefault) As String")
	public static String FormatNumber(VbValue expression, int NumDigitsAfterDecimal, int IncludeLeadingDigit, int UseParensForNegativeNumbers, int GroupDigits){
		//TODO
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod("Function FormatPercent(Expression, Optional NumDigitsAfterDecimal As Long = -1, Optional IncludeLeadingDigit As VbTriState = vbUseDefault, Optional UseParensForNegativeNumbers As VbTriState = vbUseDefault, Optional GroupDigits As VbTriState = vbUseDefault) As String")
	public static String FormatPercent(VbValue expression, int NumDigitsAfterDecimal, int UseParensForNegativeNumbers, int GroupDigits){
		//TODO
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod("Function LTrim$(String As String) As String")
	public static String ltrim$(String s) {
	    int i = 0;
	    while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
	        i++;
	    }
	    return s.substring(i);
	}

	@VbMethod("Function RTrim$(String As String) As String")
	public static String rtrim$(String s) {
	    int i = s.length()-1;
	    while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
	        i--;
	    }
	    return s.substring(0,i+1);
	}
	
	@VbMethod("Function LTrim(String)")
	public static VbValue LTrim(VbValue string){
		String s = (String) VbValue.CStr(string).value;
		s = ltrim$(s);
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbString, s));
	}
	
	@VbMethod("Function RTrim(String)")
	public static VbValue RTrim(VbValue string){
		String s = (String) VbValue.CStr(string).value;
		s = rtrim$(s);
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbString, s));
	}
	
	@VbMethod("Function Replace(Expression As String, Find As String, Replace As String, Optional Start As Long = 1, Optional Count As Long = -1, Optional Compare As VbCompareMethod = vbBinaryCompare) As String")
	public String replace(String expression, String find, String replace, long start, long count, int compare){
		//TODO
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod("Function Space$(Number As Long) As String")
	public String space$(long number){
		return StringUtils.repeat(' ', (int)number);
	}
	
	@VbMethod("Function Space(Number As Long)")
	public VbValue space(long number){
		String s = StringUtils.repeat(' ', (int)number);
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbString, s));
	}
	
	@VbMethod("Function Split(Expression As String, Optional Delimiter, Optional Limit As Long = -1, Optional Compare As VbCompareMethod = vbBinaryCompare)")
	public static VbValue split(String expression, VbValue delimiter, long limit, int compare){
		//TODO
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod("Function StrComp(String1, String2, Optional Compare As VbCompareMethod = vbBinaryCompare)")
	public static VbValue split(VbValue String1, VbValue String2, int compare){
		//TODO
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod("Function StrConv(String, Conversion As VbStrConv, Optional LocaleID As Long)")
	public static VbValue StrConv(VbValue string, int conversion, long localeId){
		//TODO
		throw new UnsupportedOperationException("TODO");
	}
	
	@VbMethod("Function String$(Number As Long, Character) As String")
	public String string$(long number, VbValue c){
		String s = (String) VbValue.CStr(c).value;
		return StringUtils.repeat(s, (int)number);
	}

	@VbMethod("Function String(Number As Long, Character)")
	public VbValue string(long number, VbValue c){
		String s = (String) VbValue.CStr(c).value;
		s = StringUtils.repeat(s, (int)number);
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbString, s));
	}
	
	@VbMethod
	public String StrReverse(String expression){
		return StringUtils.reverse(expression);
	}
	
	@VbMethod("Function Trim$(String As String) As String")
	public String trim$(String string){
		return string.trim();
	}
	
	@VbMethod("Function Trim(String)")
	public VbValue trim(VbValue string){
		String s = (String) VbValue.CStr(string).value;
		s = s.trim();
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbString, s));
	}
	
	@VbMethod("Function UCase(String)")
	public static VbValue UCase(VbValue string) {
		String s = (String) VbValue.CStr(string).value;
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbString, s.toUpperCase()));
	}

	@VbMethod("Function UCase$(String As String) As String")
	public static String UCase$(String string) {
		return string.toUpperCase();
	}

	@VbMethod("Function WeekdayName(Weekday As Long, Optional Abbreviate As Boolean = False, Optional FirstDayOfWeek As VbDayOfWeek = vbUseSystemDayOfWeek) As String")
	public String weekdayName(long weekDay, boolean abbreviate, int FirstDayOfWeek){
		//TODO
		throw new UnsupportedOperationException("TODO");
	}
}
