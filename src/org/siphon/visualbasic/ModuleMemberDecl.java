package org.siphon.visualbasic;

public class ModuleMemberDecl extends VbDecl {

	public ModuleDecl module;
	
	public static final VarDecl AMBIGUOUS = new VarDecl(null, null);
	
	public ModuleMemberDecl(Library library, ModuleDecl module) {
		super(library);
		this.module = module;
	}
	
}
