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

	private ClassTypeDecl classTypeDecl;

	public NewStatement(SourceLocation sourceLocation, ClassTypeDecl classTypeDecl) {
		super(sourceLocation);
		this.classTypeDecl = classTypeDecl;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		ModuleInstance instance = null;
		if(classTypeDecl.classModule instanceof JavaClassModuleDecl){
			JavaClassModuleDecl jcmd = (JavaClassModuleDecl) classTypeDecl.classModule;
			instance = new JavaModuleInstance(jcmd, jcmd.newInstance(interpreter, frame, sourceLocation));
		} else {
			instance = new ModuleInstance(classTypeDecl.classModule);
			instance.initializeClass(interpreter, frame);
		} 
		return instance.asVbValue();
	}
	
	@Override
	public String toString() {
		return "New " + classTypeDecl;
	}

}
