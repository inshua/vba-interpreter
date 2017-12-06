package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.MethodType;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.compile.ImpossibleException;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVariable;

public class ShowFormStatement extends Statement {

	private VbVariable form;

	public ShowFormStatement(VbVariable form) {
		super(null);
		this.form = form;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		ClassModuleDecl formDecl = form.varType.getClassTypeDecl().classModule;
		ModuleInstance instance = (ModuleInstance) form.value.value;
		MethodDecl show = (MethodDecl) formDecl.members.get("SHOW");
		try {
			interpreter.ensureFormLoaded(instance);
			interpreter.callMethod(instance, show);
		} catch (ArgumentException e) {
			throw new ImpossibleException();
		}
		return null;
	}

}
