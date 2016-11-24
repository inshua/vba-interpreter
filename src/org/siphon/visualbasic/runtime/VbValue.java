package org.siphon.visualbasic.runtime;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.parse.ANTLRParser.exceptionGroup_return;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.NumberRange;
import org.siphon.visualbasic.OverflowException;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.VbTypeDecl;
import org.siphon.visualbasic.compile.ImpossibleException;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;

import com.sun.glass.ui.Pixels.Format;

public class VbValue {

	public final static VbValue Empty = new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbEmpty, null));

	public final static VbValue Nothing = new VbValue(new VbVarType(VbVarType.vbObject), null);
	
	public final static VbValue Null = new VbValue(new VbVarType(VbVarType.vbVariant), new VbValue(VbVarType.VbNull, null));
	
	public final static VbValue Missing = new VbValue(new VbVarType(VbVarType.vbVariant), new VbValue(VbVarType.VbError, 448));

	public static final VbValue TRUE = new VbValue(VbVarType.VbBoolean, -1);
	
	public static final VbValue FALSE = new VbValue(VbVarType.VbBoolean, 0);

	public final VbVarType varType;

	public Object value;

	public VbValue(VbVarType varType, Object value) {
		super();
		assert value instanceof VbValue == false || varType.vbType == VbVarType.vbVariant;
		this.varType = varType;
		this.value = value;
		
		int vbType = varType.vbType;
		if(vbType > 0 && vbType < VbVarType.NumberRange.length){
			NumberRange range = VbVarType.NumberRange[vbType];
			if(range != null){
				range.checkRange((Number) value);
			}
		}
	}

	public static VbValue cast(VbValue value, int varType) throws OverflowException {
		if (value.varType.vbType == varType)
			return value;
		
		switch (varType) {
		case VbVarType.vbInteger:
			return CInt(value);
		case VbVarType.vbString:
			return CStr(value);
		case VbVarType.vbLong:
			return CLng(value);
		case VbVarType.vbSingle:
			return CSng(value);
		case VbVarType.vbDouble:
			return CDbl(value);
		case VbVarType.vbDate:
			return CDate(value);
		case VbVarType.vbBoolean:
			return CBool(value);
		case VbVarType.vbByte:
			return CByte(value);
		case VbVarType.vbVariant:
			return CVar(value);
		case VbVarType.vbDecimal:
			return CDec(value);
		case VbVarType.vbCurrency:
			return CCur(value);
		default:
			throw new ClassCastException(String.format("%s cannot cast to %s", value, varType));
		}
	}

	public static VbValue CVar(VbValue value) {
		if(value.varType.vbType == VbVarType.vbVariant)
			return value.clone();
		else 
			return new VbValue(VbVarType.VbVariant, value.clone());	//TODO 不 clone 行不行？？？？？
	}

	public static VbValue CSng(VbValue value) {
		if(value.isNull()){
			throw new NullValueException();
		}
		if (value.varType.vbType == VbVarType.vbSingle)
			return value.clone();

		VbValue v = CDbl(value);
		return new VbValue(VbVarType.VbSingle, ((Number) v.value).floatValue());
	}

	public static VbValue CStr(VbValue value) {
		/*
		 * Boolean 含有 True或 False 的字符串 
			Date 含有系统中短日期格式日期的字符串 
			Null 一个运行时错误 
			Empty 一个零长度字符串 ("") 
			Error 包含单词 Error 以及错误号的字符串 			实际运行得到的是错误号
			其他数值 含有数值的字符串 
		 */
		if(value.isNull()){
			throw new NullValueException();
		}
		
		if(value.varType.vbType == VbVarType.vbVariant){
			value = (VbValue) value.value;
		}
		switch (value.varType.vbType) {
		case VbVarType.vbString:
			return value;
		case VbVarType.vbBoolean:
			return new VbValue(VbVarType.VbString, (Integer) value.value == 0 ? "False" : "True");

		case VbVarType.vbDate:
			double d = (Double)value.value;
			if(d >=0 && d < 1){	// time part only
				DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
				Date date = doubleToDate((Double)value.value);
				LocalTime ld = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
				return new VbValue(VbVarType.VbString, ld.format(formatter));
			} else {
				DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
				Date date = doubleToDate((Double)value.value);
				LocalDateTime ld = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
				return new VbValue(VbVarType.VbString, ld.format(formatter));
			}
		case VbVarType.vbEmpty:
			return new VbValue(VbVarType.VbString, "");
		
		case VbVarType.vbNull:
			return new VbValue(VbVarType.VbString, "Null");

		case VbVarType.vbError:
			return new VbValue(VbVarType.VbString, "Error " + value.value);

		default:
			if (value.value instanceof Number) {
				if(value.varType.vbType == VbVarType.vbCurrency){
					return new VbValue(VbVarType.VbString, currencyToDouble((Long)value.value));
				} else {
					return new VbValue(VbVarType.VbString, value.value.toString());
				}
			}
			throw new ClassCastException("cannot cast to string");
		}
	}

	public static VbValue CByte(VbValue value) throws OverflowException {
		if(value.isNull()){
			throw new NullValueException();
		}
		if(value.varType.vbType == VbVarType.vbVariant){
			value = (VbValue) value.value;
		}
		if(value.varType.vbType == VbVarType.vbByte){
			return value.clone();
		}
		Integer i = null;
		if(value.value instanceof Integer){
			i = (Integer) value.value;
		} else {
			VbValue v = CInt(value);
			i = (Integer) v.value;
		}
		if (i < 0 || i > 255) {
			throw new OverflowException();
		} else {
			i = i & 0xff;
			return new VbValue(VbVarType.VbByte, i);
		}
	}

	public static VbValue CBool(VbValue value) {
		if(value.isNull()){
			throw new NullValueException();
		}
		if (value.varType.vbType == VbVarType.vbVariant) {
			value = (VbValue) value.value;
		}
		if (value.varType.vbType == VbVarType.vbBoolean) {
			return value.clone();
		}

		Object v = value.value;
		if (v instanceof Number) {		// include date
			return new VbValue(VbVarType.VbBoolean, ((Number) v).intValue() == 0 ? 0 : -1);
		} else if (value.varType.vbType == VbVarType.vbString) {
			String s = (String) v;
			if ("TRUE".equalsIgnoreCase(s)) {
				return new VbValue(VbVarType.VbBoolean, -1);
			} else if ("FALSE".equalsIgnoreCase(s)) {
				return new VbValue(VbVarType.VbBoolean, 0);
			} else {
				value = CDbl(value);
				return CBool(value);
			}
		} else if (value.varType.vbType == VbVarType.vbEmpty) {
			return new VbValue(VbVarType.VbBoolean, 0);
		} else {
			throw new ClassCastException("cannot cast to boolean");
		}
	}

	public static VbValue CDate(VbValue value) {
		if(value.isNull()){
			throw new NullValueException();
		}
		if (value.varType.vbType == VbVarType.vbVariant) {
			value = (VbValue) value.value;
		}
		
		Object v = value.value;
		if (v instanceof Number) {
			if(value.varType.vbType == VbVarType.vbCurrency){
				v = currencyToDouble((Long)v);
			}
			return new VbValue(VbVarType.VbDate, ((Number) v).doubleValue());
		} else if (value.varType.vbType == VbVarType.vbString) {
			try {
				String s = (String) v;
				Date date = parseDate(s);
				return new VbValue(VbVarType.VbDate, dateToDouble(date));
			} catch (Exception e) {
				value = CDbl(value);
				return CDate(value);
			}
		} else if (value.varType.vbType == VbVarType.vbEmpty) {
			return VbVarType.VbDate.crateDefaultValue();
		} else {
			value = CDbl(value);
			return CDate(value);
		}
	}

	public static Date parseDate(String s) {
		FormatStyle[] styles = new FormatStyle[] { FormatStyle.SHORT, FormatStyle.MEDIUM, FormatStyle.LONG, FormatStyle.FULL };
		for (int i = 0; i < styles.length; i++) {
			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(styles[i]);
				LocalDate lcd = LocalDate.parse(s, formatter);
				return Date.from(lcd.atStartOfDay(ZoneId.systemDefault()).toInstant());
			} catch (Exception ex) {

			}
		}
		SimpleDateFormat[] formats = new SimpleDateFormat[] { new SimpleDateFormat("HH:mm:ss") };
		for (int i = 0; i < formats.length; i++) {
			try {
				return formats[i].parse(s);
			} catch (Exception e) {
			}
		}
		throw new ClassCastException("cannot cast to date");
	}

	public static Date doubleToDate(double value) {
		long l = (long) (value * 86400000) + VbVarType.DATE_OFFSET;
		return new Date(l);
	}

	public static VbValue CDbl(VbValue value) {
		if(value.isNull()){
			throw new NullValueException();
		}
		if(value.varType.vbType == VbVarType.vbVariant){
			value = (VbValue) value.value;
		}
		if (value.value instanceof Number) {	// include date
			Number n = (Number) value.value;
			if(value.varType.vbType == VbVarType.vbCurrency){
				n = currencyToDouble((Long)value.value);
				return new VbValue(VbVarType.VbDouble, n);
			} else {
				return new VbValue(VbVarType.VbDouble, n.doubleValue());
			}
		} else if (value.varType.vbType == VbVarType.vbString) {
			String s = (String) value.value;
			String j = s.replace("&H", "0x").replace("&O", "0");
			return new VbValue(VbVarType.VbDouble, Double.parseDouble(j));

		} else if (value.varType.vbType == VbVarType.vbEmpty) {
			return new VbValue(VbVarType.VbDouble, 0.0);
		} else {
			throw new ClassCastException("cannot cast to double");
		}
	}

	public static VbValue CDec(VbValue value) {
		if(value.isNull()){
			throw new NullValueException();
		}
		if(value.varType.vbType == VbVarType.vbVariant){
			value = (VbValue) value.value;
		}
		if (value.value instanceof Number) {
			if (value.value instanceof BigDecimal) {
				return new VbValue(VbVarType.VbDecimal, value.value);
			} else if(value.varType.vbType == VbVarType.vbCurrency){
				double r = currencyToDouble((Long)value.value);
				return new VbValue(VbVarType.VbDecimal, new BigDecimal(r));
			} else {
				double r = ((Number) (value.value)).doubleValue();
				return new VbValue(VbVarType.VbDecimal, new BigDecimal(r));
			}
		} else if (value.varType.vbType == VbVarType.vbString) {
			String s = (String) value.value;
			String j = s.replace("&H", "0x").replace("&O", "0");
			return new VbValue(VbVarType.VbDecimal, new BigDecimal(j));

		} else {
			value = CDbl(value);
			return CDec(value);
		}
	}

	public static VbValue CCur(VbValue value) {
		if(value.isNull()){
			throw new NullValueException();
		}
		if(value.varType.vbType == VbVarType.vbVariant){
			value = (VbValue) value.value;
		}
		if(value.varType.vbType == VbVarType.vbCurrency){
			return value.clone();
		}
		if (value.value instanceof Number) {
			if (value.value instanceof Double) {
				return new VbValue(VbVarType.VbCurrency, doubleToCurrency((Double) value.value));
			} else if(value.value instanceof Integer){
				return new VbValue(VbVarType.VbCurrency, (Integer)(value.value) * 10000L);
			} else if(value.value instanceof Long){
				return new VbValue(VbVarType.VbCurrency, (Long)(value.value) * 10000L);
			} else {
				double r = ((Number) (value.value)).doubleValue();
				return new VbValue(VbVarType.VbCurrency, doubleToCurrency(r));
			}
		} else if (value.varType.vbType == VbVarType.vbString) {
			String s = (String) value.value;
			String j = s.replace("&H", "0x").replace("&O", "0");
			return new VbValue(VbVarType.VbCurrency, doubleToCurrency(Double.parseDouble(j) * 1000));
		} else {
			value = CDbl(value);
			return CCur(value);
		}
	}

	public static long doubleToCurrency(double value) {
		return (long)(value * 10000);
	}
	
	public static double currencyToDouble(long value) {
		return value / 10000.0;
	}

	public static VbValue CLng(VbValue value) {
		if(value.isNull()){
			throw new NullValueException();
		}
		if(value.varType.vbType == VbVarType.vbVariant){
			value = (VbValue) value.value;
		}
		if (value.varType.vbType == VbVarType.vbString) {
			value = CDbl(value);
		}
		if (value.value instanceof Number) {	// include date, boolean
			Number n = (Number) value.value;
			if (n instanceof Long) {
				if(value.varType.vbType == VbVarType.vbCurrency){
					return new VbValue(VbVarType.VbLong, (long)((Long)n / 10000));
				} else {
					return new VbValue(VbVarType.VbLong, n);
				}
			} else if (n instanceof Integer) {
				return new VbValue(VbVarType.VbLong, n.longValue());
			} else {
				double v = n.doubleValue();
				double remain = Math.abs(v % 1);
				long i = (long) v;
				// 当小数部分恰好为 0.5 时，Cint 和 CLng 函数会将它转换为最接近的偶数值。例如，0.5 转换为 0、1.5 转换为 2。Cint 和 CLng 函数不同于 Fix 和 Int 函数，Fix 和 Int 函数会将小数部分截断而不是四舍五入。并且 Fix 和 Int 函数总是返回与传入的数据类型相同的值。
				if (remain == 0.5) {
					if (Math.abs(i % 2) == 1) {
						v += Math.signum(v) * 0.1;
						i = (long) Math.round(v);
					}
				}
				return new VbValue(VbVarType.VbLong, i);
			}
		} else if (value.varType.vbType == VbVarType.vbEmpty) {
			return new VbValue(VbVarType.VbLong, 0L);
		} else {
			throw new ClassCastException("cannot cast to long");
		}
	}

	public static VbValue CInt(VbValue value) {
		if(value.isNull()){
			throw new NullValueException();
		}
		if(value.varType.vbType == VbVarType.vbVariant){
			value = (VbValue) value.value;
		}
		if (value.varType.vbType == VbVarType.vbString) {
			value = CDbl(value);
		}
		if (value.value instanceof Number) {	// include date, boolean
			Number n = (Number) value.value;
			if (n instanceof Integer) {
				return new VbValue(VbVarType.VbInteger, n);
			} else if (n instanceof Long) {
				if(value.varType.vbType == VbVarType.vbCurrency){
					return new VbValue(VbVarType.VbInteger, (int)((Long)n / 10000));
				} else {
					return new VbValue(VbVarType.VbInteger, n.intValue());
				}
			} else {
				double v = n.doubleValue();
				double remain = Math.abs(v % 1);
				int i = (int) v;
				// 当小数部分恰好为 0.5 时，Cint 和 CLng 函数会将它转换为最接近的偶数值。例如，0.5 转换为 0、1.5 转换为 2。Cint 和 CLng 函数不同于 Fix 和 Int 函数，Fix 和 Int 函数会将小数部分截断而不是四舍五入。并且 Fix 和 Int 函数总是返回与传入的数据类型相同的值。
				if (remain == 0.5) {
					if (Math.abs(i % 2) == 1) {
						v += Math.signum(v) * 0.1;
						i = (int) Math.round(v);
					}
				}
				return new VbValue(VbVarType.VbInteger, i);
			}
		} else if (value.varType.vbType == VbVarType.vbEmpty) {
			return new VbValue(VbVarType.VbInteger, 0);
		} else {
			throw new ClassCastException("cannot cast to int");
		}
	}

	static double dateToDouble(Date date) {
		double v = (date.getTime() - VbVarType.DATE_OFFSET) / 86400000.0;
		return v;
	}

	public static VbValue fromJava(int vbType, Object object) throws OverflowException {
		VbValue old = fromJava(object);
		if (old.varType.vbType == vbType)
			return old;
		return cast(old, vbType);
	}

	@Override
	public String toString() {
		if(this.varType.vbType == VbVarType.vbVariant){
			VbValue v = (VbValue) this.value;
			return String.format("(VbValue Variant/%s %s)", v.varType, v.value);
		} else if(this.varType.vbType == VbVarType.vbDate){
			return String.format("(VbValue %s %s)", this.varType, doubleToDate((Double)this.value));
		} else {
			return String.format("(VbValue %s %s)", this.varType, this.value);
		} 
	}
	public static VbValue fromJava(Object obj) {
		return fromJava(obj, true);
	}

	public static VbValue fromJava(Object obj, boolean autoCreateJavaModuleDecl) {
		if (obj instanceof VbValue)
			return (VbValue) obj;

		if (obj == null) {
			return null;
		}
		if (obj instanceof Integer) {
			return new VbValue(VbVarType.VbInteger, obj);
		} else if (obj instanceof Long) {
			return new VbValue(VbVarType.VbLong, obj);
		} else if (obj instanceof Float) {
			return new VbValue(VbVarType.VbSingle, obj);
		} else if (obj instanceof Double) {
			return new VbValue(VbVarType.VbDouble, obj);
		} else if (obj instanceof BigDecimal) {
			return new VbValue(VbVarType.VbDecimal, obj);
		} else if (obj instanceof Date) {
			return new VbValue(VbVarType.VbDate, dateToDouble((Date) obj));
		} else if (obj instanceof Byte) {
			return new VbValue(VbVarType.VbByte, Byte.toUnsignedInt((Byte) obj));
		} else if (obj instanceof String) {
			return new VbValue(VbVarType.VbString, obj);
		} else if (obj instanceof Boolean) {
			return new VbValue(VbVarType.VbBoolean, (Boolean)obj ? -1 : 0);

		} else {
			if(autoCreateJavaModuleDecl){
				JavaClassModuleDecl decl = new JavaClassModuleDecl(null, null, obj.getClass());
				ClassTypeDecl ct = new ClassTypeDecl(null, decl);
				VbVarType vt = new VbVarType(VbVarType.vbObject, ct, null, obj.getClass());
				JavaModuleInstance instance = new JavaModuleInstance(decl, obj);
				VbValue val = new VbValue(vt, instance);
				return val;
			} else {
				return new VbValue(new VbVarType(VbVarType.vbObject, ClassTypeDecl.JAVA_OBJECT_TYPE, null, obj.getClass()), obj);
			}
		}
	}

	public static boolean isTrue(VbValue value) {
		if(value.isNull()) return false;
		
		Object v = value.getExactValue();
		if(v instanceof Number){
			Number n = (Number) v;
			return MathExpr.eqZero(n) == false;
		} else {
			return isTrue(CBool(value));
		}
	}

	public Object toJava() {
		switch (this.varType.vbType) {
		case VbVarType.vbInteger:
		case VbVarType.vbLong:
		case VbVarType.vbString:
		case VbVarType.vbDouble:
		case VbVarType.vbSingle:
		case VbVarType.vbByte:
		case VbVarType.vbDecimal:
			return this.value;
		case VbVarType.vbCurrency:
			return currencyToDouble((Long)this.value);
		case VbVarType.vbBoolean:
			return (Integer)this.value != 0;
		case VbVarType.vbDate:
			return doubleToDate(((Double)this.value));
		case VbVarType.vbArray:
			VbArray arr = (VbArray) this;
			List<VbValue> ls = arr.toList();
			List ls2 = new ArrayList();
			for(VbValue obj : ls){
				ls2.add(obj.toJava());		// 无法获取泛型容器的元素类型
			}
			return ls2;
		case VbVarType.vbUserDefinedType:
			throw new UnsupportedOperationException();		
		case VbVarType.vbObject:
			if(this.varType.typeDecl == null) return null;
			if(this.value == null){
				return null;
			} 
			if(this.varType.typeDecl == ClassTypeDecl.JAVA_OBJECT_TYPE){
				return this.value;
			} else if(this.varType.getClassTypeDecl().classModule instanceof JavaClassModuleDecl){
				return this.value;
			} else {
				return this;
			}
		case VbVarType.vbNull:
		case VbVarType.vbEmpty:
		case VbVarType.vbError:
		case VbVarType.vbDataObject:
			return this.value;
		case VbVarType.vbVariant:
			VbValue v = (VbValue) this.value;
			return v.toJava();
		}
		throw new ImpossibleException();
	}

	public static Object vbValueToJava(Object object) {
		if (object instanceof VbValue) {
			return ((VbValue) object).toJava();
		} else {
			return object;
		}
	}

	public VbValue clone() {
		switch (this.varType.vbType) {
		case VbVarType.vbInteger:
			return new VbValue(this.varType, ((Integer) this.value).intValue());
		case VbVarType.vbLong:
			return new VbValue(this.varType, ((Long) this.value).longValue());
		case VbVarType.vbString:
			return new VbValue(this.varType, ((String) this.value).substring(0));
		case VbVarType.vbBoolean:
			return new VbValue(this.varType, ((Integer)this.value).intValue());
		case VbVarType.vbDouble:
			return new VbValue(this.varType, ((Double) this.value).doubleValue());
		case VbVarType.vbSingle:
			return new VbValue(this.varType, ((Float) this.value).floatValue());
		case VbVarType.vbByte:
			return new VbValue(this.varType, ((Integer) this.value).intValue());
		case VbVarType.vbDecimal:
		case VbVarType.vbCurrency:
			return new VbValue(this.varType, ((Long)this.value).longValue());
		case VbVarType.vbDate:
			return new VbValue(this.varType, ((Double)this.value).doubleValue());
		case VbVarType.vbArray:
			VbArray arr = (VbArray) this;
			if(arr.isInited()){
				return this;
			} else {
				return new VbArray(arr.varType);	// 对于未初始化的数组，生成一个新的数组
			}
		case VbVarType.vbObject:
		case VbVarType.vbNull:
		case VbVarType.vbEmpty:
		case VbVarType.vbError:
		case VbVarType.vbDataObject:
			return this;
		case VbVarType.vbVariant:
			VbValue v = (VbValue) this.value;
			if(v != null){
				v = v.clone();
			}
			return new VbValue(VbVarType.VbVariant, v);
		case VbVarType.vbUserDefinedType:
			UdtInstance inst = (UdtInstance) this.value;
			return new VbValue(this.varType, inst.clone());
		}
		throw new ImpossibleException();
	}

	public void updateValue(Object value) { // 基本上 value 是不会被修改值的，除了 vb 的对象，vb 的对象为懒惰初始化
		this.value = value;
	}

	public ModuleInstance ensureInstanceInited(Interpreter interpreter, CallFrame frame, SourceLocation sourceLocation)
			throws VbRuntimeException {
		ModuleInstance instance = (ModuleInstance) this.value;
		if (instance == ModuleInstance.WAIT_NEW) {
			ClassTypeDecl classDecl = (ClassTypeDecl) this.varType.typeDecl;
			if(classDecl.classModule instanceof JavaClassModuleDecl){
				JavaClassModuleDecl jcmd = (JavaClassModuleDecl) classDecl.classModule;
				this.value = (instance = new JavaModuleInstance(jcmd, jcmd.newInstance(interpreter, frame, sourceLocation)));
			} else {
				this.value = (instance = new ModuleInstance(classDecl.classModule));
				instance.initializeClass(interpreter, frame);
			}
			return instance;
		} else if (instance == null) {
			throw new VbRuntimeException(VbRuntimeException.尚未设置对象变量或With区块变量, sourceLocation);
		} else {
			return instance;
		}
	}

	public static VbValue fromJava(Object instance, VbVarType varType, JavaClassModuleDecl javaClassModuleDecl) {
		return new VbValue(varType, new JavaModuleInstance(javaClassModuleDecl, instance));
	}

	public boolean isVariant() {
		return this.varType.vbType == VbVarType.vbVariant;
	}
	
	public boolean isMissing(){
		if(this.varType.vbType == VbVarType.vbError && this.value.equals(448)) return true;
		
		if(this.varType.vbType == VbVarType.vbVariant){
			VbValue v = ((VbValue)this.value);
			return v.varType.vbType == VbVarType.vbError && v.value.equals(448);
		}
		return false;
	}

	public boolean isString() {
		if(this.varType.vbType == VbVarType.vbString) return true;
		if(this.varType.vbType == VbVarType.vbVariant){
			return ((VbValue)this.value).varType.vbType == VbVarType.vbString;
		}
		return false;
	}

	public Object getExactValue() {
		if(this.varType.vbType == VbVarType.vbVariant){
			return ((VbValue)this.value).value;
		} else {
			return this.value;
		}
	}
	
	public int getExactVbType() {
		if(this.varType.vbType == VbVarType.vbVariant){
			return ((VbValue)this.value).varType.vbType;
		} else {
			return this.varType.vbType;
		}
	}

	public boolean isEmpty() {
		return this.varType.vbType == VbVarType.vbEmpty 
				|| this.varType.vbType == VbVarType.vbVariant && (this.value == null || ((VbValue)this.value).varType.vbType == VbVarType.vbEmpty);
	}

	public boolean isNull() {
		return this.varType.vbType == VbVarType.vbNull 
				|| this.varType.vbType == VbVarType.vbVariant && ((VbValue)this.value).varType.vbType == VbVarType.vbNull ;
	}

	public boolean isError() {
		return this.varType.vbType == VbVarType.vbError 
				|| this.varType.vbType == VbVarType.vbVariant && ((VbValue)this.value).varType.vbType == VbVarType.vbError;
	}

	public boolean isObject() {
		return this.varType.vbType == VbVarType.vbObject 
				|| this.varType.vbType == VbVarType.vbVariant && ((VbValue)this.value).varType.vbType == VbVarType.vbObject;
	}

	public Object toJava(Class<?> type) {
		if(VbValue.class.isAssignableFrom(type)){
			return this;
		}
		if(CharSequence.class.isAssignableFrom(type)){
			return CStr(this).value;
		} else if(type == Object.class){
			return this.toJava();
		} 
		if(type.isArray() && this.varType.vbType != VbVarType.vbArray){
			throw new ClassCastException();
		}
		
		switch(this.varType.vbType){
		case VbVarType.vbInteger:
		case VbVarType.vbByte:
		case VbVarType.vbLong:
		case VbVarType.vbDecimal:
		case VbVarType.vbDouble:
		case VbVarType.vbSingle:
		case VbVarType.vbBoolean:
		case VbVarType.vbEmpty:
			if(ClassUtils.isAssignable(type, Number.class)){
				if(type == Integer.class || type == int.class){
					return ((Number)this.value).intValue();
				} else if(type == Long.class || type == long.class){
					return ((Number)this.value).longValue();
				} else if(type == Double.class || type == double.class){
					return ((Number)this.value).doubleValue();
				} else if(type == Float.class || type == float.class){
					return ((Number)this.value).floatValue();
				} else if(type == Short.class || type == short.class){
					return ((Number)this.value).shortValue();
				} else if(type == BigDecimal.class){
					if(this.value instanceof BigDecimal){
						return this.value;
					} else {
						return new BigDecimal(((Number)this.value).doubleValue());
					}
				} 
			} else if(type == Boolean.class || type == boolean.class){
				return ((Number)this.value).intValue() != 0;
			} 
			break;
		case VbVarType.vbDate:
			if(type == Date.class){
				return this.toJava();
			}
		case VbVarType.vbCurrency:
			return (CDbl(this)).toJava(type);
		case VbVarType.vbString:
			if(ClassUtils.isAssignable(type, Number.class)){
				return CDbl(this).toJava(type);
			} else if(type == Boolean.class || type == boolean.class){
				return CBool(this).toJava();
			} 
		case VbVarType.vbNull:
			return null;
		case VbVarType.vbObject:
			if(this.value == null){
				return null;
			} 
			if(this.varType.typeDecl == ClassTypeDecl.JAVA_OBJECT_TYPE){
				if(type.isAssignableFrom(this.value.getClass())){
					return this.value;
				} 
			} else if(this.varType.getClassTypeDecl().classModule instanceof JavaClassModuleDecl){
				if(type.isAssignableFrom(this.varType.javaClass)){
					return this.value;
				}
			} else {
				// throw new ClassCastException();
			}
			break;
		case VbVarType.vbArray:
			VbArray arr = (VbArray) this;
			List<VbValue> ls = arr.toList();
			if(type.isArray()){
				Class<?> ctype = type.getComponentType();
				Object a = Array.newInstance(ctype, ls.size());
				for(int i=0; i<ls.size(); i++){
					Array.set(a, i, ls.get(i).toJava(ctype));
				}
				return a;
			} else if(Iterable.class.isAssignableFrom(type)){
				List ls2 = new ArrayList();
				for(VbValue obj : ls){
					ls2.add(obj.toJava());		// 无法获取泛型容器的元素类型
				}
				return ls2;
			} else if(type == Iterator.class){
				return ls.stream().map(v -> v.toJava()).iterator();
			}
			break;
		case VbVarType.vbVariant:
			return ((VbValue)this.value).toJava(type);
		case VbVarType.vbUserDefinedType:
			// throw new ClassCastException();
		}
		throw new ClassCastException();
	}

	public int getSimilarity(Class<?> type) {
		if(this.varType.vbType == VbVarType.vbObject){
			if(this.value == null) return 90;
			ClassTypeDecl decl = this.varType.getClassTypeDecl();
			if(decl == ClassTypeDecl.JAVA_OBJECT_TYPE){
				Class<? extends Object> c = this.value.getClass();
				if(c == type){
					return 100;
				} else if(c.isAssignableFrom(type)){
					return 90;
				} else {
					return -50;
				}
			}
		}
		return this.varType.getSimilarity(type);
	}
	
}
