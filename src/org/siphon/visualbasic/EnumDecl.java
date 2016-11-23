package org.siphon.visualbasic;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.siphon.visualbasic.compile.ImpossibleException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;

public class EnumDecl extends VbTypeDecl {
	
	public EnumDecl(Library library) {
		super(library);
	}

	public final VbVarType type = VbVarType.VbLong;		// vba 枚举类型总为 Long
	
	public final List<ConstDecl> constDecls = new ArrayList<>();

	@Override
	public String toString() {
		return String.format("(Enum %s)", this.name);
	}

	@Override
	public boolean hasMember(String name) {
		return this.getMember(name) != null;
	}

	@Override
	public VbDecl getMember(String name) {
		for(ConstDecl c : constDecls){
			if(c.name.equalsIgnoreCase(name)) return c;
		}
		return null;
	}

	public static EnumDecl fromJava(Library lib, Class clazz) {
		EnumDecl enumDecl = new EnumDecl(lib);
		// enumDecl.module = moduleDecl;
		enumDecl.name = clazz.getSimpleName();
		enumDecl.visibility = Visibility.PUBLIC;
		for(Field fld : clazz.getFields()){
			int m = fld.getModifiers();
			if(Modifier.isStatic(m) && Modifier.isFinal(m) && Modifier.isPublic(m) && Number.class.isAssignableFrom(fld.getType())){
				ConstDecl constDecl;
				try {
					constDecl = new ConstDecl(lib, null, new VbValue(VbVarType.VbLong, fld.getLong(null)));
					constDecl.visibility = enumDecl.visibility;
					//constDecl.ast = ;
					constDecl.varType = VbVarType.VbLong;
					constDecl.name = fld.getName();
					enumDecl.constDecls.add(constDecl);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new ImpossibleException();
				}
			}
		}
		return enumDecl;
	}
}
