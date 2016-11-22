package org.siphon.visualbasic.compile;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.ConstDecl;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.framework.VbMethod;

import vba.VbaLexer;
import vba.VbaParser;
import vba.VbaParser.FunctionStmtContext;
import vba.VbaParser.SubStmtContext;

/**
 * Java 模块。只取其中的 static 成员(含final static常量)。
 * 类模块应使用 JavaClassModule
 */
public class JavaModuleDecl extends ModuleDecl {

	private Class javaClass;

	public JavaModuleDecl(Library lib, Compiler compiler, Class javaClass) {
		super(lib);

		this.name = javaClass.getName();

		this.javaClass = javaClass;

		for (Method method : this.javaClass.getMethods()) {
			int modifier = method.getModifiers();
			if (Modifier.isStatic(modifier) && Modifier.isPublic(modifier)) {
				VbMethod[] vbMethods = method.getAnnotationsByType(VbMethod.class);
				VbMethod vbMethod = null;
				if (vbMethods.length > 0) {
					vbMethod = vbMethods[0];
				}
				if (vbMethod != null) {
					if (StringUtils.isEmpty(vbMethod.value())) {
						this.addMember(new JavaMethod(lib, this, method).setWithIntepreter(vbMethod.withIntepreter()));
					} else {
						String decl = vbMethod.value();
						String methodType = decl.substring(0, decl.indexOf(' '));
						decl = decl + "\r\n" + "End " + methodType;
						VbaLexer lexer = new VbaLexer(new org.antlr.v4.runtime.ANTLRInputStream(decl));
						CommonTokenStream tokenStream = new CommonTokenStream(lexer);
						VbaParser parser = new VbaParser(tokenStream);
						ParseTree element = parser.moduleBodyElement().getChild(0);
						if (element instanceof FunctionStmtContext) {
							MethodDecl methodDecl = compiler.compileMethodBaseInfo((FunctionStmtContext) element, this);
							JavaMethod m = new JavaMethod(lib, this, methodDecl, method, vbMethod.withIntepreter());
							this.addMember(m);
						} else if (element instanceof SubStmtContext) {
							MethodDecl methodDecl = compiler.compileMethodBaseInfo((SubStmtContext) element, this);
							JavaMethod m = new JavaMethod(lib, this, methodDecl, method, vbMethod.withIntepreter());
							this.addMember(m);
						} else {
							throw new UnsupportedOperationException("cannot be " + element);
						}
					}
				}
			}
		}

		for (Field fld : this.javaClass.getFields()) {
			int modifier = fld.getModifiers();
			if (Modifier.isStatic(modifier) && Modifier.isPublic(modifier) && Modifier.isFinal(modifier)) {
				try {
					VbValue value = VbValue.fromJava(fld.get(null));
					ConstDecl constDecl = new ConstDecl(lib, this, value);
					constDecl.varType = value.varType;
					this.addMember(constDecl);
				} catch (IllegalArgumentException e) {
				} catch (IllegalAccessException e) {
				}
			}
		}
	}

}
