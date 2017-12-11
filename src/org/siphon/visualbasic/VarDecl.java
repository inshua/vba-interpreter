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

import org.antlr.v4.runtime.ParserRuleContext;
import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.VbVariable;

import vba.VbaParser.AmbiguousIdentifierContext;

public class VarDecl extends ModuleMemberDecl{

	public VarDecl(Library library, ModuleDecl module) {
		super(library, module);
	}

	public static final VarDecl AMBIGUOUS = new VarDecl(null, null);

	public boolean isStatic;

	public boolean withEvents;
	
	public VbVarType varType;

	public ParserRuleContext ast;
	
	public boolean isImplicit;	// 隐式声明的变量
	
	public AmbiguousIdentifierContext ambiguousIdentifier(){
		return ast.getChild(AmbiguousIdentifierContext.class, 0);
	}
	
	public MethodDecl methodDecl;

	public boolean withNew;		// vb 的对象即使声明为 new， 也只是在第一次使用时才真正 new

	@Override
	public String toString() {
		String s = "";
		if(visibility != Visibility.PRIVATE){
			s += visibility.toString() + " ";
		}
		if(isStatic) s += "static ";
		s += name + " ";
		if(withEvents){
			s += "WithEvents ";
		}
		if(withNew){
			s += "New ";
		}
		assert (varType != null);
		s += varType.toString();
		return s;
	}

	public VbVariable createVar() {
		if(!withNew)
			return new VbVariable(this, varType.crateDefaultValue());
		else 
			return new VbVariable(this, new VbValue(varType, ModuleInstance.WAIT_NEW));
	}
}
