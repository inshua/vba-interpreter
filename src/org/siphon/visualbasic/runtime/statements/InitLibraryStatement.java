package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.ModuleType;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class InitLibraryStatement extends Statement {

	private Library lib;

	public InitLibraryStatement(Library lib) {
		super(SourceLocation.Unkown);
		this.lib = lib;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {

//		for (ModuleDecl moduleDecl : lib.modules.values()) {
//			if (moduleDecl.moduleType == ModuleType.Module) {
//				for (ModuleDecl module : lib.modules.values()) {
//					
//				}
//			}
//		}
		return null;
	}
}
