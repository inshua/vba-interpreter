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
		super(SourceLocation.Unkown);
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
