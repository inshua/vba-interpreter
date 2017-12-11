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

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.compile.CompileException;
import org.siphon.visualbasic.runtime.Statement;

import com.sun.xml.internal.ws.config.metro.util.ParserUtil;

import vba.VbaParser.AmbiguousIdentifierContext;

// class, module, form
public class ModuleDecl extends VbDecl {

	public double version;
	public Map<String, Object> config = new HashMap<String, Object>();
	public Map<String, Object> attributes = new HashMap<String, Object>();
	public boolean isGlobalNameSpace;
	private boolean explicit = false;
	private int arrayBase = 0;
	private boolean privateModule;

	public ModuleType moduleType;

	public final List<CompileException> errors = new ArrayList<>();

	public void addCompileException(CompileException exception) {
		errors.add(exception);
	}

	public void addCompileException(ParserRuleContext parserRuleContext, String message, Object... args) {
		errors.add(new CompileException(new SourceLocation(this.srcFile, parserRuleContext), message, args));
	}

	public void addCompileException(TerminalNode node, String message, Object... args) {
		errors.add(new CompileException(new SourceLocation(this.srcFile, node.getSymbol()), message, args));
	}

	public CompileException newCompileException(ParserRuleContext parserRuleContext, String message, Object... args) {
		return new CompileException(new SourceLocation(this.srcFile, parserRuleContext), message, args);
	}

	public CompileException newCompileException(TerminalNode node, String message, Object... args) {
		return new CompileException(new SourceLocation(this.srcFile, node.getSymbol()), message, args);
	}

	private CompareMode compareMode = CompareMode.Binary;

	public Map<String, VbDecl> members = new HashMap<String, VbDecl>();

	public boolean addMember(VbDecl decl) {
		boolean isPropertyDecl = false;
		if (decl instanceof MethodDecl) {
			MethodDecl md = (MethodDecl) decl;
			isPropertyDecl = (md.methodType == MethodType.PropertyGet || md.methodType == MethodType.PropertyLet
					|| md.methodType == MethodType.PropertySet);
		}

		String u = decl.name.toUpperCase();
		if (isPropertyDecl) {
			MethodDecl md = (MethodDecl) decl;
			VbDecl exist = this.members.get(u);
			try {
				if (exist instanceof PropertyDecl) {
					((PropertyDecl) exist).addMember(md);
					return true;
				} else if (exist != null) {
					this.addCompileException(md.ast, CompileException.AMBIGUOUS_IDENTIFIER, md.ast);
				} else {
					PropertyDecl pd = new PropertyDecl(library, this);
					pd.addMember(md);
					this.members.put(u, pd);
					return true;
				}
			} catch (CompileException e) {
				this.errors.add(e);
			}
		} else {
			if (this.members.containsKey(u)) {
				AmbiguousIdentifierContext ast = ((VarDecl) decl).ambiguousIdentifier();
				this.addCompileException(ast, CompileException.AMBIGUOUS_IDENTIFIER, ast);
			} else {
				this.members.put(u, decl);
				return true;
			}
		}
		return false;
	}

	private boolean matchProperty(MethodDecl propertyMember, MethodDecl propertyMember2) { // TODO
		return true;
	}

	public List<Integer> breakpoints = new ArrayList<>();
	private File srcFile;
	public List<Statement> initialStatements = new ArrayList<>();

	public ModuleDecl(Library lib) {
		super(lib);
		this.moduleType = ModuleType.Module;
	}

	public File getSrcFile() {
		return srcFile;
	}

	public enum CompareMode {
		Binary, Text
	}

	public int getArrayBase() {
		return arrayBase;
	}

	public void setExplicit(boolean explicit) {
		this.explicit = explicit;
	}

	public boolean isExplicit() {
		return explicit;
	}

	public void setArrayBase(int base) {
		this.arrayBase = base;
	}

	public CompareMode getCompareMode() {
		return compareMode;
	}

	public void setCompareMode(CompareMode compareMode) {
		this.compareMode = compareMode;
	}

	public boolean isPrivateModule() {
		return privateModule;
	}

	public void setPrivateModule(boolean privateModule) {
		this.privateModule = privateModule;
	}

	@Override
	public String toString() {
		String s = "Module ";
		if(this.library != null) s += this.library.name + ".";
		s += this.name + "\r\n";
		for (VbDecl member : members.values()) {
			if(member instanceof MethodDecl){
				s += ((MethodDecl) member).toDeclString() + "\r\n";
			} else {
				s += member.toString() + "\r\n";
			}
		}
		if (!this.errors.isEmpty()) {
			s += "ERRORS:\r\n" + StringUtils.join(this.errors, "\r\n") + "\r\n";
		}
		s += "End Module " + this.name + " \r\n";
		return s;
	}

	public void setSrcFile(File file) {
		this.srcFile = file;
	}

	public SourceLocation sourceLocation(ParserRuleContext ast) {
		return new SourceLocation(this.srcFile, ast);
	}

	public SourceLocation sourceLocation(TerminalNode node) {
		return new SourceLocation(this.srcFile, node.getSymbol());
	}

	public SourceLocation sourceLocation(Token start, Token end) {
		return new SourceLocation(this.srcFile, start.getLine(), start.getCharPositionInLine(),
				end.getStopIndex() - start.getStartIndex());
	}

}
