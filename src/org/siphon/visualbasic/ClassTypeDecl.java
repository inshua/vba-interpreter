package org.siphon.visualbasic;

import org.siphon.visualbasic.compile.JavaClassModuleDecl;

public class ClassTypeDecl extends VbTypeDecl {

	public static final VbTypeDecl JAVA_OBJECT_TYPE = new ClassTypeDecl(null, JavaClassModuleDecl.JAVA_OBJECT);
	public final ClassModuleDecl classModule;

	public ClassTypeDecl(Library library, ClassModuleDecl classModule) {
		super(library);
		this.classModule = classModule;
		this.name = classModule.name;
		this.visibility = classModule.visibility;
	}

	@Override
	public boolean hasMember(String name) {
		return classModule.members.containsKey(name.toUpperCase());
	}

	@Override
	public VbDecl getMember(String name) {
		return classModule.members.get(name.toUpperCase());
	}

	@Override
	public String toString() {
		if (this.library == null) {
			return this.name;
		} else {
			return this.library.name + "." + this.name;
		}
	}

	
}
