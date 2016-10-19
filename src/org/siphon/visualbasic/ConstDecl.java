package org.siphon.visualbasic;

import org.siphon.visualbasic.runtime.VbValue;

public class ConstDecl extends VarDecl{
	
	public final VbValue constValue;

	public ConstDecl(Library library, ModuleDecl module, VbValue constValue){
		super(library, module);
		this.constValue = constValue;
	}
	
	
	@Override
	public String toString() {
		String s = "";
		s += visibility.toString() + " Const ";
		s += name + " ";
		assert (varType != null);
		s += varType.toString();
		s += " = " + this.constValue;
		return s;
	}
}