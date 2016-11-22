package org.siphon.visualbasic.runtime.framework.vba;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.ErrObject;
import org.siphon.visualbasic.runtime.VbArray;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.VbVarType.TypeEnum;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.VbParam;
import org.siphon.visualbasic.runtime.statements.EvalAssignableStatement;

public class Information {

	@VbMethod(value = "Function Err() As ErrObject", withIntepreter = true)
	public static ErrObject Err(Interpreter interpreter, CallFrame frame){		
		return frame.error;
	}
	
}
