package org.siphon.visualbasic.compile;

import java.beans.Beans;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.ConstDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.MethodType;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.PropertyDecl;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.Visibility;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.framework.VbMethod;

/**
 * Java 模块。只取导出的成员。
 * 类模块应使用 JavaClassModule
 */
public class JavaClassModuleDecl extends ClassModuleDecl{

	public static final ClassModuleDecl JAVA_OBJECT = new JavaClassModuleDecl();
	
	private Class javaClass;

	public JavaClassModuleDecl(Library lib, Class javaClass) {
		super(lib);
		
		this.name = javaClass.getSimpleName();
		
		this.javaClass = javaClass;
		
		int classModifiers = this.javaClass.getModifiers();
		if(Modifier.isPublic(classModifiers)){
			this.visibility = Visibility.PUBLIC;
		} else if(!Modifier.isPrivate(classModifiers)){
			this.visibility = Visibility.FRIEND;
		}
		
		for(Method method : this.javaClass.getMethods()){
			int modifier = method.getModifiers();
			if(Modifier.isStatic(modifier) == false && Modifier.isPublic(modifier) && method.getDeclaringClass() != Object.class){
				VbMethod[] vbMethods = method.getAnnotationsByType(VbMethod.class);
				if(vbMethods.length > 0){
					VbMethod vbMethod = vbMethods[0];
					
					String name = method.getName();
					if((name.startsWith("get") || name.startsWith("set")) && name.length() > 3 && Character.isLowerCase(name.charAt(3)) == false){
						JavaMethod m = new JavaMethod(lib, this, method, true);
						this.addMember(m);
						name = m.name;
					} else{
						this.addMember(new JavaMethod(lib, this, method));
					}
					if(vbMethod.isDefault()){
						this.setDefaultMember(name);
					}
					if(vbMethod.isDictionary()){
						this.setDictionaryMember(name);
					}
					if(vbMethod.isIterator()){
						this.setIteratorMember(name);
					}
				}
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

	private JavaClassModuleDecl() {
		super();
	}

	public Object newInstance(Interpreter interpreter, CallFrame frame, SourceLocation sourceLocation) throws VbRuntimeException {
		try {
			return this.javaClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new VbRuntimeException(VbRuntimeException.ActiveX部件不能建立对象或返回对此对象的引用, sourceLocation, e);
		}
	}

	
}
