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
package org.siphon.visualbasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.compile.CompileException;
import org.siphon.visualbasic.runtime.ArgumentDecl;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.statements.UndeterminedLabelGotoStatement;

public class MethodDecl extends ModuleMemberDecl {
	public boolean isStatic;
	public List<ArgumentDecl> arguments = new ArrayList<>();
	public final List<Statement> statements = new ArrayList<>();

	// 仅用来判断是否声明过变量，真正声明变量使用 VariableStatement
	public final Map<String, VarDecl> variables = new HashMap<>();

	public VbVarType returnType;

	public ParserRuleContext ast;

	public MethodType methodType;
	public VarDecl result;

	public MethodDecl(Library library, ModuleDecl module, MethodType methodType) {
		super(library, module);
		this.methodType = methodType;
	}

	@Override
	public String toString() {
		String s = "";
		s += visibility + " ";
		if (isStatic)
			s += " static ";
		s += name + " ";
		s += "(" + StringUtils.join(arguments, ", ") + ")";
		s += " As " + returnType;
		return s;
	}
	
	public String toDeclString() {
		String s = "";
		s += visibility + " ";
		if (isStatic)
			s += " static ";
		s += name + " ";
		s += "(" + StringUtils.join(arguments, ", ") + ")";
		s += " As " + returnType;
		
		String sts= "\r\n";
		for(int i = 0; i< statements.size(); i++){
			Statement statement = statements.get(i);
			sts += i + ":\t" + statement + "\r\n";
		}
		s += sts;
		s += "End " + this.name + " \r\n";
		return s;
	}

	public void addVariable(VarDecl decl) {
		String u = decl.name.toUpperCase();
		if (this.variables.containsKey(u)) {
			this.module.addCompileException(decl.ambiguousIdentifier(), CompileException.AMBIGUOUS_IDENTIFIER, decl.ambiguousIdentifier());
		} else {
			this.variables.put(u, decl);
		}
	}
}
