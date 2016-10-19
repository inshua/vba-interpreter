package org.siphon.visualbasic;

import java.util.ArrayList;
import java.util.List;

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
}
