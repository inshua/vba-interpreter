package org.siphon.visualbasic;

import java.util.ArrayList;
import java.util.List;

import org.siphon.visualbasic.runtime.ArgumentDecl;

public class EventDecl extends VbDecl {

	public List<ArgumentDecl> arguments = null;

	public EventDecl(Library library, ModuleDecl module) {
		super(library);
	}

	@Override
	public String toString() {
		return String.format("(Event %s)", this.name); 
	}
}
