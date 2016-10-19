package org.siphon.visualbasic;

import java.util.SortedMap;
import java.util.TreeMap;

public class UdtDecl  extends VbTypeDecl{

	public UdtDecl(Library library) {
		super(library);
	}
	
	public SortedMap<String, VarDecl> members = new TreeMap<>();

	public void addMember(VarDecl var) {
		members.put(var.upperCaseName(), var);
	}

	@Override
	public boolean hasMember(String name) {
		return this.members.containsKey(name.toUpperCase());
	}
	

	@Override
	public String toString() {
		return String.format("(UDT %s.%s)", this.library.name, this.name);
	}

	@Override
	public VbDecl getMember(String name) {
		return members.get(name);
	}
}
