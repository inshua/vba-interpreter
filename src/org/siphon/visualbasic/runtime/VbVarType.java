package org.siphon.visualbasic.runtime;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.ModuleMemberDecl;
import org.siphon.visualbasic.NumberRange;
import org.siphon.visualbasic.PropertyDecl;
import org.siphon.visualbasic.UdtDecl;
import org.siphon.visualbasic.VbDecl;
import org.siphon.visualbasic.VbTypeDecl;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.stringtemplate.v4.compiler.STParser.singleElement_return;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

public class VbVarType {

	public static long DATE_OFFSET;
	static {
		try {
			// 取决于时区
			DATE_OFFSET = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("1899-12-30 00:00:00").getTime();
		} catch (ParseException e) {
		}
	}

	public static final int vbEmpty = 0; // 未初始化（缺省值）
	public static final int vbNull = 1; // 不含任何有效数据 A variant of VarType 1 (vbNull) that means "no valid data" and generally indicates a database field with no value. Don't confuse this with a C NULL,
										// which indicates zero. Test whether it is "nil" using the IsNull function.

	public static final int vbInteger = 2; // Integer
	public static final int vbLong = 3; // 长整数, 枚举默认为长整数
	public static final int vbSingle = 4; // 单精度浮点数
	public static final int vbDouble = 5; // 双精度浮点数
	public static final int vbCurrency = 6; // Currency Currency 变量存储为 64 位（8 个字节）整型的数值形式，然后除以 10,000 给出一个定点数，其小数点左边有 15 位数字，右边有 4 位数字。这种表示法的范围可以从 -922,337,203,685,477.5808 到 922,337,203,685,477.5807。

	public static final int vbDate = 7; // Date
	public static final int vbString = 8; // String

	public static final int vbObject = 9; // 对象
	public static final int vbError = 10; // 错误

	public static final int vbBoolean = 11; // 布尔

	public static final int vbVariant = 12; // Variant（只用于变体的数组类型） Variant 的 value 是一个 VbValue

	public static final int vbDataObject = 13; // 数据访问对象

	public static final int vbDecimal = 14; // Decimal, use BigDecimal
	public static final int vbByte = 17; // Byte

	public static final int vbUserDefinedType = 36; // 包含用户定义类型的变量
	public static final int vbArray = 8192; // 数组 0x2000

	public enum TypeEnum {
		vbEmpty(0), vbNull(1), vbInteger(2), vbLong(3), vbSingle(4), vbDouble(5), vbCurrency(6), vbDate(7), vbString(
				8), vbObject(9), vbError(10), vbBoolean(
						11), vbVariant(12), vbDataObject(13), vbDecimal(14), vbByte(17), vbUserDefinedType(36), vbArray(8192);

		private int numVal;

		TypeEnum(int numVal) {
			this.numVal = numVal;
		}

		public int getNumVal() {
			return numVal;
		}
	}

	private static final String[] TypeNames = { "Empty", "Null", "Integer", "Long", "Single", "Double", "Currency", "Date",
			"String", "Object", "Error", "Boolean", "Variant", "DataObject", "Decimal", "Unknown15", "Unknown16", "Byte" };

	public static final NumberRange[] NumberRange = { null, null,
			// new NumberRange(Integer.MIN_VALUE, Integer.MAX_VALUE),
			new NumberRange(-32768, 32767), new NumberRange(Long.MIN_VALUE, Long.MAX_VALUE),
			new NumberRange(-Float.MAX_VALUE, Float.MAX_VALUE), new NumberRange(-Double.MAX_VALUE, Double.MAX_VALUE),
			new NumberRange(-Double.MAX_VALUE, Double.MAX_VALUE), // currency
			new NumberRange(-657434, 2958465), // 从 100 年 1 月 1 日到 9999 年 12 月 31 日
			null, null, null, null, // boolean
			null, null, null, // BigDecimal has no range
			null, null, new NumberRange(0, 255) };

	public boolean isBaseType() {
		int t = this.vbType;
		return t >= 0 && t <= 8 || t > 9 && t <= 12 || t == 14 || t == 17;
	}

	/*
	 * vb 数据类型代码
	 */
	public final int vbType;

	/*
	 * 类模块
	 */
	public final VbTypeDecl typeDecl; // 类模块, UDT, Enum

	/*
	 * Java 类型
	 */
	public final Class javaClass;

	/*
	 * 数组类型
	 */
	public final ArrayDef arrayDef;

	public VbVarType(int vbType, VbTypeDecl vbTypeDecl, ArrayDef arrayDef, Class javaClass) {
		super();
		this.vbType = vbType;
		this.javaClass = javaClass;
		this.typeDecl = vbTypeDecl;
		this.arrayDef = arrayDef;
	}

	public VbVarType(int vbType) {
		this(vbType, null, null, null);
	}

	@Override
	public String toString() {
		String s = getTypeName(this.vbType);
		if (this.typeDecl != null) {
			s += " " + this.typeDecl.toString();
		}
		if (this.vbType == vbArray) {
			s += "[" + this.arrayDef.toString() + "]";
		}
		return s;
	}

	private static String getTypeName(int vbType) {
		if (vbType >= 0 && vbType < TypeNames.length) {
			return TypeNames[vbType];
		} else if (vbType == VbVarType.vbArray) {
			return "Array";
		} else if (vbType == VbVarType.vbUserDefinedType) {
			return "UDT";
		} else {
			return "Unknown " + vbType;
		}
	}
	
	public String getTypeName(){
		if (vbType >= 0 && vbType < TypeNames.length) {
			return TypeNames[vbType];
		} else if (vbType == VbVarType.vbArray) {
			return this.arrayDef.baseType.toString() + "()";
		} else if (vbType == VbVarType.vbUserDefinedType 
				|| vbType == VbVarType.vbObject) {
			return this.typeDecl.toString();
		} else {
			throw new UnsupportedOperationException("unknown type");
		}
	}
	
	public final static VbVarType VbEmpty = new VbVarType(vbEmpty);
	public final static VbVarType VbNull = new VbVarType(vbNull);
	public final static VbVarType VbInteger = new VbVarType(VbVarType.vbInteger);
	public static final VbVarType VbLong = new VbVarType(VbVarType.vbLong);
	public final static VbVarType VbSingle = new VbVarType(vbSingle);
	public static final VbVarType VbDouble = new VbVarType(VbVarType.vbDouble);
	public static final VbVarType VbCurrency = new VbVarType(VbVarType.vbCurrency);
	public static final VbVarType VbDate = new VbVarType(VbVarType.vbDate);
	public final static VbVarType VbString = new VbVarType(VbVarType.vbString);
	public static final VbVarType VbBoolean = new VbVarType(VbVarType.vbBoolean);
	public final static VbVarType VbVariant = new VbVarType(VbVarType.vbVariant);
	public static final VbVarType VbDecimal = new VbVarType(VbVarType.vbDecimal);
	public static final VbVarType VbByte = new VbVarType(VbVarType.vbByte);
	public static final VbVarType VbError = new VbVarType(VbVarType.vbError);
	public static final VbVarType VbObject = new VbVarType(VbVarType.vbObject); // TODO 对象基类类型

	/**
	 * 创建基于当前数据类型的数组。
	 * 
	 * @param ranks
	 *            秩。参数声明可以为空。
	 * @return
	 */
	public VbVarType toArrayType(ArrayDef.Rank ranks[]) {
		return new VbVarType(VbVarType.vbArray, this.typeDecl, new ArrayDef(this, ranks), this.javaClass);
	}

	public static VbVarType javaTypeToVb(Class<?> type) {
		if (type.equals(Void.TYPE)) {
			return null;
		} else if (type == Integer.class) {
			return VbVarType.VbInteger;
		} else if (type == Long.class || type.isPrimitive() && type.getSimpleName().equals("long")) {
			return VbVarType.VbLong;
		} else if (type == Float.class) {
			return VbVarType.VbSingle;
		} else if (type == Double.class) {
			return VbVarType.VbDouble;
		} else if (type == String.class) {
			return VbVarType.VbString;
		} else if (type == BigDecimal.class) {
			return VbVarType.VbDecimal;
		} else if (type == Date.class) {
			return VbVarType.VbDate;
		} else if (type == Boolean.class) {
			return VbVarType.VbBoolean;
		} else if (type == Byte.class) {
			return VbVarType.VbByte;
		} else if (type == Object.class) {
			return VbVarType.VbVariant;
		} else if (type == VbValue.class) {
			return VbVarType.VbVariant;
		} else {
			// TODO java array to vb array
			throw new UnsupportedOperationException(type + " still not unsupport");
		}
	}

	public VbValue crateDefaultValue() {
		switch (this.vbType) {
		case VbVarType.vbInteger:
			return new VbValue(this, 0);
		case VbVarType.vbLong:
			return new VbValue(this, 0L);
		case VbVarType.vbSingle:
			return new VbValue(this, 0f);
		case VbVarType.vbDouble:
			return new VbValue(this, 0.0);
		case VbVarType.vbCurrency:
			return new VbValue(this, 0L);
		case VbVarType.vbDecimal:
			return new VbValue(this, new BigDecimal(0));

		case VbVarType.vbDate:
			return new VbValue(this, 0.0); // VB 里 Date 存放的是一个 Double，日期部分是整数，时间部分是小数，一天为 1， 其整数从 1899-12-30 开始，比 1970 开始的 ISO 时间小 DATE_OFFSET
		case VbVarType.vbString:
			return new VbValue(this, "");
		case VbVarType.vbVariant:
			return VbValue.Empty; // 类型为 variant 时 null 即 empty
		case VbVarType.vbBoolean:
			return new VbValue(this, 0);
		case VbVarType.vbByte:
			return new VbValue(this, 0);
		case VbVarType.vbArray:
			return new VbArray(this);

		case VbVarType.vbUserDefinedType:
			return new VbValue(this, new UdtInstance((UdtDecl) this.typeDecl));

		case VbVarType.vbObject:
			return new VbValue(this, null); // object 除非主动 new，默认值为 nothing

		default:
			throw new UnsupportedOperationException("wait"); // TODO
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof VbVarType == false)
			return false;
		VbVarType t2 = (VbVarType) obj;
		if (t2.vbType == this.vbType) {
			if (this.vbType == VbVarType.vbUserDefinedType) {
				return this.typeDecl == t2.typeDecl;
			} else if (this.vbType == VbVarType.vbObject) {
				ClassTypeDecl cd1 = (ClassTypeDecl) this.typeDecl;
				ClassTypeDecl cd2 = (ClassTypeDecl) t2.typeDecl;
				if (cd1 == null)
					return cd2 == null;
				if (cd2 == null)
					return false;
				return cd1.classModule == cd2.classModule;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean isDictionary() {
		if (this.vbType == VbVarType.vbObject && this.typeDecl != null) {
			ClassTypeDecl td = (ClassTypeDecl) typeDecl;
			return td.classModule.getDictionaryMember() != null;
		}
		return false;
	}

	public ModuleMemberDecl getDictionaryMember() {
		if (this.vbType == VbVarType.vbObject) {
			ClassTypeDecl td = (ClassTypeDecl) typeDecl;
			return td.classModule.getDictionaryMember();
		}
		return null;
	}

	public VbVarType getDictionaryType() {
		if (this.vbType == VbVarType.vbObject && this.typeDecl != null) {
			ClassTypeDecl td = (ClassTypeDecl) typeDecl;
			ModuleMemberDecl dm = td.classModule.getDictionaryMember();
			if (dm instanceof MethodDecl) {
				return ((MethodDecl) dm).returnType;
			} else if (dm instanceof PropertyDecl) {
				return ((PropertyDecl) dm).getReturnType();
			}
		}
		return null;
	}

	public boolean hasDefaultMember() {
		if (this.vbType == VbVarType.vbObject && this.typeDecl != null) {
			ClassTypeDecl td = (ClassTypeDecl) typeDecl;
			return td.classModule.getDefaultMember() != null;
		}
		return false;
	}

	public VbDecl getDefaultMember() {
		if (this.vbType == VbVarType.vbObject) {
			ClassTypeDecl td = (ClassTypeDecl) typeDecl;
			return td.classModule.getDefaultMember();
		}
		return null;
	}
	
	public VbDecl getDefaultMember(int vbCallType) {
		if (this.vbType == VbVarType.vbObject) {
			ClassTypeDecl td = (ClassTypeDecl) typeDecl;
			return td.classModule.getDefaultMember(vbCallType);
		}
		return null;
	}


	public boolean maybeObject() {
		return this.vbType == VbVarType.vbObject || this.vbType == VbVarType.vbVariant;
	}

	public ClassModuleDecl getClassModuleDecl() {
		if (this.vbType == VbVarType.vbObject) {
			if (this.typeDecl != null) {
				return ((ClassTypeDecl) this.typeDecl).classModule;
			}
		}
		return null;
	}

	public ClassTypeDecl getClassTypeDecl() {
		if (this.vbType == VbVarType.vbObject) {
			if (this.typeDecl != null) {
				return (ClassTypeDecl) this.typeDecl;
			}
		}
		return null;
	}

	public int getSimilarity(Class<?> type) {
		if (VbValue.class.isAssignableFrom(type)) {
			return 100;
		}
		switch (this.vbType) {
		case VbVarType.vbInteger:
		case VbVarType.vbByte:
		case VbVarType.vbLong:
		case VbVarType.vbDecimal:
		case VbVarType.vbDouble:
		case VbVarType.vbSingle:
		case VbVarType.vbCurrency:
			if (Number.class.isAssignableFrom(type)) {
				if (type == vbNumberTypeToJavaType(this.vbType)) {
					return 100;
				} else {
					return 70;
				}
			} else if (CharSequence.class.isAssignableFrom(type)) {
				return 25;
			} else if (type == Object.class) {
				return 50;
			}
		case VbVarType.vbDate:
			if (type == Date.class) {
				return 100;
			} else if (Number.class.isAssignableFrom(type)) {
				return 20;
			} else if (CharSequence.class.isAssignableFrom(type)) {
				return 35;
			} else if (type == Object.class) {
				return 50;
			}
		case VbVarType.vbBoolean:
			if (type == Boolean.class || type == boolean.class) {
				return 100;
			} else if (Number.class.isAssignableFrom(type)) {
				return 30;
			} else if (CharSequence.class.isAssignableFrom(type)) {
				return 25;
			} else if (type == Object.class) {
				return 50;
			}
		case VbVarType.vbString:
			if (CharSequence.class.isAssignableFrom(type)) {
				return 100;
			} else if (Number.class.isAssignableFrom(type)) {
				return 20;
			} else if (type == Object.class) {
				return 50;
			}
		case VbVarType.vbEmpty:
		case VbVarType.vbNull:
			return 60;
		case VbVarType.vbObject:
			ClassTypeDecl decl = this.getClassTypeDecl();
			if (decl == ClassTypeDecl.JAVA_OBJECT_TYPE) {
				return 10; // should return by VbValue.getSimilarity
			} else if (decl.classModule instanceof JavaClassModuleDecl) {
				if (this.javaClass == type) {
					return 100;
				} else if (type.isAssignableFrom(this.javaClass)) {
					return 90;
				} else {
					return -50;
				}
			}
		case VbVarType.vbArray:
			if (type.isArray()) {
				return (this.arrayDef.baseType).getSimilarity(type.getComponentType());
			} else if (Iterable.class.isAssignableFrom(type) || List.class.isAssignableFrom(type)) {
				return this.arrayDef.baseType.getSimilarity(Object.class);
			}
		case VbVarType.vbVariant:
			return 5;
		case VbVarType.vbUserDefinedType:
			return -50;
		}
		return 0;
	}

	private static Class<?> vbNumberTypeToJavaType(int vbType) {
		switch (vbType) {
		case VbVarType.vbInteger:
			return int.class;
		case VbVarType.vbByte:
			return byte.class;
		case VbVarType.vbLong:
			return long.class;
		case VbVarType.vbDecimal:
			return BigDecimal.class;
		case VbVarType.vbDouble:
			return double.class;
		case VbVarType.vbSingle:
			return Single.class;
		case VbVarType.vbCurrency:
			return double.class;
		}
		throw new UnsupportedOperationException();
	}

	public boolean isJavaObject() {
		ClassTypeDecl decl = this.getClassTypeDecl();
		if(decl == null) return false;
		if (decl == ClassTypeDecl.JAVA_OBJECT_TYPE) {
			return true;
		} else if (decl.classModule instanceof JavaClassModuleDecl) {
			return true;
		} else {
			return false;
		}
	}
	
	public Class getWrappedJavaClass(){
		ClassTypeDecl decl = this.getClassTypeDecl();
		if(decl == null) return null;
		return ((JavaClassModuleDecl)decl.classModule).getJavaClass();
	}

	public String getProgId() {
		String n = this.getTypeName();
		if("OBJECT".equalsIgnoreCase(n)) {
			ClassModuleDecl cmdcl = this.getClassModuleDecl();
			return cmdcl.getLibrary().name + "." + cmdcl.name; 
		} else {
			return n;
		}
			
	}

	public boolean isArray() {
		return this.vbType == VbVarType.vbArray;
	}

}
