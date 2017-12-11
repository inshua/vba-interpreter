/*******************************************************************************
 * Copyright (C) 2017 Inshua<inshua@gmail.com>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
import java.nio.charset.Charset;

import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.compile.Compiler;
import org.siphon.visualbasic.compile.JavaModuleDecl;
import org.siphon.visualbasic.compile.VbErrorsException;
import org.siphon.visualbasic.runtime.ErrObject;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.framework.Debug;
import org.siphon.visualbasic.runtime.framework.vba.Math;

public class ExecuteVb {
	public static void main(String[] args) throws VbErrorsException, VbRuntimeException, ArgumentException {
		normalTest();
		
		//classTest();
	}
	
	


	private static void normalTest() throws VbErrorsException, VbRuntimeException, ArgumentException {
		// Compiler compiler = new Compiler();
		// Library lib = compiler.compile("Project1", new String[] { "vba/test.bas" });
		// // System.out.println(lib);
		//
		// Interpreter interpreter = new Interpreter().load(compiler.generateStatements());
		//
		// Object v = interpreter.invoke("Project1", "test", "add", 1, 2);
		//
		// System.out.println(v);

		// String filename = "vba/gosub.bas";
		// String filename = "vba/if-then-else.bas";
		// String filename = "vba/select-case.bas";
		// String filename = "vba/func-call.bas";
		// String filename = "vba/base-type.bas";
		// String filename = "vba/array-dim.bas";
		// String filename = "vba/for-next.bas";
		// String filename = "vba/do-while.bas";
		String filename = "vba/const-enum.bas";
		// String filename = "vba/udt.bas";
		
		Compiler compiler = new Compiler();
		compiler.bindObject("DEBUG", VbValue.fromJava(new Debug()));		// TODO 考虑如何复用 JavaClassModule

		
		Library lib = compiler.compile("Project1", new String[] { filename });
		System.out.println(lib);

		Interpreter interpreter = new Interpreter().load(compiler.generateStatements());
		interpreter.getDebugger().setCompiler(compiler);
		
		Object v = interpreter.invoke("Project1", lib.modules.values().iterator().next().name, "Main", 1, 2);

		System.out.println(v);
	}
	
	private static void classTest() throws VbErrorsException, VbRuntimeException, ArgumentException {
		Compiler compiler = new Compiler();
		compiler.bindObject("DEBUG", VbValue.fromJava(new Debug()));

		Library lib = compiler.compile("Project1", new String[] { "vba/class-test.bas", "vba/Class1.cls"});
		System.out.println(lib);

		Interpreter interpreter = new Interpreter().load(compiler.generateStatements());
		interpreter.getDebugger().setCompiler(compiler);

		Object v = interpreter.invoke("Project1", lib.modules.values().iterator().next().name, "Main", 1, 2);

		System.out.println(v);
	}
	
}
