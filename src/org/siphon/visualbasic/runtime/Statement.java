package org.siphon.visualbasic.runtime;

import java.util.List;

import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.ModuleMemberDecl;
import org.siphon.visualbasic.PropertyDecl;
import org.siphon.visualbasic.SourceLocation;

public abstract class Statement {

	protected final SourceLocation sourceLocation;

	public SourceLocation getSourceLocation() {
		return sourceLocation;
	}

	public abstract VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException;
	
	public Statement(SourceLocation sourceLocation){
		if(sourceLocation == null) 
			System.err.println("sourceLocation is null");
		this.sourceLocation = sourceLocation;
	}
}
