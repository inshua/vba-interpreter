package org.siphon.visualbasic.compile;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

import org.siphon.visualbasic.ArgumentMode;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.MethodType;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.Visibility;
import org.siphon.visualbasic.runtime.ArgumentDecl;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.VbParam;

public class JavaMethod extends MethodDecl {

	public final Method javaMethod;

	public JavaMethod(Library library, ModuleDecl module, Method method) {
		super(library, module, method.getReturnType() == Void.class ? MethodType.Sub : MethodType.Function);

		this.javaMethod = method;
		this.name = method.getName();
		this.visibility = Visibility.PUBLIC;

		if (method.getParameters().length > 0) {
			this.arguments = new ArrayList<>();

			for (Parameter param : method.getParameters()) {
				VbParam[] vbParams = param.getAnnotationsByType(VbParam.class);
				VbParam vbParam = null;
				if(vbParams.length > 0) vbParam = vbParams[0];
				
				ArgumentDecl arg = new ArgumentDecl();
				arg.methodDecl = this;
				if(vbParam != null){
					arg.name = vbParam.name();
					arg.mode = vbParam.mode();
					arg.isParamArray = vbParam.paramArray();
					arg.optional = vbParam.optional();
					arg.varType =  new VbVarType(vbParam.type().getNumVal());	//TODO 如果没有赋值，应当取Java类型转换的类型
					switch(arg.varType.vbType){
					case VbVarType.vbInteger:
						arg.defaultValue = VbValue.fromJava(arg.varType.vbType, vbParam.defaultInt());
						break;
					case VbVarType.vbLong:
						arg.defaultValue = VbValue.fromJava(arg.varType.vbType, vbParam.defaultLong());
						break;
					case VbVarType.vbString:
						arg.defaultValue = VbValue.fromJava(arg.varType.vbType, vbParam.defaultString());
						break;
					case VbVarType.vbDouble:
					case VbVarType.vbDecimal:
					case VbVarType.vbCurrency:
						arg.defaultValue = VbValue.fromJava(arg.varType.vbType, vbParam.defaultDouble());
						break;
					case VbVarType.vbBoolean:
						arg.defaultValue = VbValue.fromJava(VbVarType.vbBoolean, (Object)vbParam.defaultBoolean());
						break;
					case VbVarType.vbSingle:
						arg.defaultValue = VbValue.fromJava(arg.varType.vbType, vbParam.defaultFloat());
						break;
					case VbVarType.vbVariant:
						arg.defaultValue = VbValue.Missing;		// TODO Variant 也应取到默认值
						break;
					default:
						throw new UnsupportedOperationException("TODO");	//TODO 其它类型 Date
					}
				} else{
					arg.name = param.getName();
					arg.mode = ArgumentMode.ByVal;
					arg.isParamArray = param.isVarArgs();
					arg.varType = VbVarType.javaTypeToVb(param.getType());
				}

				this.arguments.add(arg);
			}
		}
		
		this.returnType = VbVarType.javaTypeToVb(method.getReturnType());
	}

	public JavaMethod(Library lib, ModuleDecl module, Method method, boolean isProperty) {
		this(lib, module, method);
		if(isProperty){
			if(method.getName().startsWith("get")){
				this.methodType = MethodType.PropertyGet;
			} else {
				if(this.arguments.get(this.arguments.size() -1).varType.vbType == VbVarType.vbObject){ 
					this.methodType = MethodType.PropertySet;
				} else {
					this.methodType = MethodType.PropertyLet;
				}
			}
			this.name = method.getName().substring(3);
		}
	}

}
