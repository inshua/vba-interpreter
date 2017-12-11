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
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Comparision;
import org.siphon.visualbasic.runtime.LogicalExpr;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;

import vba.VbaParser.ValueStmtContext;

public class RuleDecl extends MethodDecl{

	public final List<Statement> entrances = new ArrayList<>();
	
	public final List<ValueStmtContext> entranceAstes = new ArrayList<>();

	public final List<MethodDecl> methods = new ArrayList<>();

	private Statement lastTestEntrance;
	
	public Statement getLastTestEntrance() {
		return lastTestEntrance;
	}

	public RuleDecl(Library library, ModuleDecl module) {
		super(library, module, MethodType.Rule);
	}

	public MethodDecl findMatchMethod(Interpreter interpreter, CallFrame callFrame) throws VbRuntimeException{
		for(int i=entrances.size() -1; i >= 0; i--){
			Statement entrance = entrances.get(i);
			this.lastTestEntrance = entrance;
			if(entrance == null || VbValue.isTrue(entrance.eval(interpreter, callFrame))){
				return methods.get(i);
			}
		}
		return null;
	}
	
	public String toDeclString() {
		String s = "";
		s += visibility + " ";
		if (isStatic)
			s += " static ";
		s += name + " ";
		s += "(" + StringUtils.join(arguments, ", ") + ")";
		s += " As " + returnType;
		
		for(int t = 0; t < this.entrances.size(); t++){
			s += "\r\nWhen " + this.entrances.get(t) + " :";
			
			List<Statement> statements = this.methods.get(t).statements;
			String sts= "\r\n";
			for(int i = 0; i< statements.size(); i++){
				Statement statement = statements.get(i);
				sts += i + ":\t" + statement + "\r\n";
			}
			s += sts;
		}
		s += "End " + this.name + " \r\n";
		return s;
	}
	
}
