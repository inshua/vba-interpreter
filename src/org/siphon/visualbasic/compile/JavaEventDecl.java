package org.siphon.visualbasic.compile;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

import org.siphon.visualbasic.ArgumentMode;
import org.siphon.visualbasic.EventDecl;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.MethodType;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.Visibility;
import org.siphon.visualbasic.runtime.ArgumentDecl;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.VbParam;

public class JavaEventDecl extends EventDecl {

	public final Field javaField;
	private boolean withIntepreter;

	public JavaEventDecl setWithIntepreter(boolean withIntepreter) {
		this.withIntepreter = withIntepreter;
		return this;
	}

	public boolean isWithIntepreter() {
		return withIntepreter;
	}

	// java field must be List<VbEventHandler>
	public JavaEventDecl(Library library, ModuleDecl module, Field javaField) {
		super(library, module);

		this.javaField = javaField;
		this.name = javaField.getName();

	}

	

}
