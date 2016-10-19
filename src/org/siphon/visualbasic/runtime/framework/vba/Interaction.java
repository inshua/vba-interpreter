package org.siphon.visualbasic.runtime.framework.vba;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.siphon.visualbasic.runtime.VbArray;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.VbVarType.TypeEnum;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.VbParam;
import org.siphon.visualbasic.runtime.statements.EvalAssignableStatement;

public class Interaction {

	private static class FindMatchConstructorResult {

		private Constructor<?> constructor;
		
		int similarity;
		
		public FindMatchConstructorResult(Constructor<?> constructor, int similarity) {
			this.constructor = constructor;
			this.similarity = similarity;
		}

	}

	@VbMethod
	public static VbValue CreateObject(
			@VbParam(name="Class", type = TypeEnum.vbString)
			VbValue clazz, 
			@VbParam(name="Arguments", type=TypeEnum.vbVariant, paramArray = true)
			VbValue arguments) throws VbRuntimeException{
		
		String className = (String) clazz.toJava();
		Class<?> cls = null;
		try {
			cls = Class.forName(className);
		} catch (ClassNotFoundException e) {
			throw new VbRuntimeException(VbRuntimeException.ActiveX部件不能建立对象或返回对此对象的引用);
		}
		
		Constructor constructor = null;
		Object obj = null;
		try {
			if(arguments.isMissing()){
				constructor = cls.getConstructor();
				obj = constructor.newInstance();
			} else {
				List<VbValue> lsArgsCall = ((VbArray) arguments).toList();
				constructor = findMatchConstructor(cls.getConstructors(), lsArgsCall);
				if(constructor == null){
					throw new NoSuchMethodException("<Constructor>");
				}
				obj = constructor.newInstance(toJavaArguments(lsArgsCall, constructor.getParameters()));
			}
		} catch (Exception e) {
			throw new VbRuntimeException(VbRuntimeException.ActiveX部件不能建立对象或返回对此对象的引用, e);
		}
		
		
		return VbValue.fromJava(obj, false);
	}

	private static Object[] toJavaArguments(List<VbValue> argCalls, Parameter[] params) {
		List<Object> lsArgs = new ArrayList<>();
		for (int i = 0; i < params.length; i++) {
			Parameter param = params[i];
			if (param.isVarArgs()) {
				Object[] objects = new Object[argCalls.size() - i];
				Class<?> ctype = param.getType().getComponentType();
				for (int j = i; j < argCalls.size(); j++) {
					objects[j - i] = argCalls.get(j).toJava(ctype);
				}
				lsArgs.add(objects);
			} else {
				lsArgs.add(argCalls.get(i).toJava(param.getType()));
			}
		}
		Object[] args = lsArgs.toArray();
		return args;
	}

	private static Constructor findMatchConstructor(Constructor<?>[] constructors, List<VbValue> argCalls) throws NoSuchMethodException {
		int argCallCount = argCalls.size();
		List<FindMatchConstructorResult> maybe = new ArrayList<>();
		for(Constructor<?> constructor : constructors){
			Parameter[] params = constructor.getParameters();
			if (params.length == argCallCount) {
				int s = EvalAssignableStatement.getSimilarity(params, argCalls);
				maybe.add(new FindMatchConstructorResult(constructor, s));
			} else if (params.length < argCallCount && params.length > 0) {
				if (params[params.length - 1].isVarArgs()) {
					int s = EvalAssignableStatement.getSimilarity(params, argCalls);
					maybe.add(new FindMatchConstructorResult(constructor, s));
				}
			}
		}
		if(maybe.size() == 0){
			return null;
		} else if(maybe.size()==1){
			if(maybe.get(0).similarity <= 0) return null;
			
			return maybe.get(0).constructor;
		}

		maybe.sort(new Comparator<FindMatchConstructorResult>() {
			public int compare(FindMatchConstructorResult o1, FindMatchConstructorResult o2) {
				return o2.similarity - o1.similarity;
			}
		});
		if (maybe.get(0).similarity > 0) {
			if (maybe.get(1).similarity > 0  && maybe.get(0).similarity >= maybe.get(1).similarity * 1.2) {	// 匹配的方法区分度够大 
				return maybe.get(0).constructor;
			}
		}

		return null;
	}
	
}
