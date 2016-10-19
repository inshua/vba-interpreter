package org.siphon.visualbasic.compile;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.siphon.visualbasic.ConstDecl;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.runtime.VbValue;

/**
 * Java 模块。只取其中的 static 成员(含final static常量)。
 * 类模块应使用 JavaClassModule
 */
public class JavaModuleDecl extends ModuleDecl{

	private Class javaClass;

	public JavaModuleDecl(Library lib, Class javaClass) {
		super(lib);
		
		this.name = javaClass.getName();
		
		this.javaClass = javaClass;
		
		for(Method method : this.javaClass.getMethods()){
			int modifier = method.getModifiers();
			if(Modifier.isStatic(modifier) && Modifier.isPublic(modifier)){
				this.addMember(new JavaMethod(lib, this, method));
			}
		}
		
		for(Field fld: this.javaClass.getFields()){
			int modifier = fld.getModifiers();
			if(Modifier.isStatic(modifier) && Modifier.isPublic(modifier) && Modifier.isFinal(modifier)){
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
