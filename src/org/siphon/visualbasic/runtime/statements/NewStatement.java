package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.JavaModuleInstance;
import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

public class NewStatement extends Statement {

	private ClassTypeDecl classDecl;

	public NewStatement(SourceLocation sourceLocation, ClassTypeDecl classDecl) {
		super(sourceLocation);
		this.classDecl = classDecl;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		ModuleInstance instance = null;
		if(classDecl.classModule instanceof JavaClassModuleDecl){
			JavaClassModuleDecl jcmd = (JavaClassModuleDecl) classDecl.classModule;
			instance = new JavaModuleInstance(jcmd, jcmd.newInstance(interpreter, frame, sourceLocation));
		} else {
			instance = new ModuleInstance(classDecl.classModule);
			instance.initializeClass(interpreter, frame);
		}
		return instance.asVbValue();
	}
	
	@Override
	public String toString() {
		return "New " + classDecl;
	}

}
