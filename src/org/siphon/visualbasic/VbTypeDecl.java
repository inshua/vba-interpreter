package org.siphon.visualbasic;

public abstract class VbTypeDecl extends VbDecl {

	public VbTypeDecl(Library library) {
		super(library);
	}
	

	public abstract boolean hasMember(String name);
	
	public abstract VbDecl getMember(String name);
	

}
