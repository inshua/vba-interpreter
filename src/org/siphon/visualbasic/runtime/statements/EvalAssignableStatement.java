package org.siphon.visualbasic.runtime.statements;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.ConstDecl;
import org.siphon.visualbasic.FormModuleDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.ModuleMemberDecl;
import org.siphon.visualbasic.OverflowException;
import org.siphon.visualbasic.PropertyDecl;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.VbDecl;
import org.siphon.visualbasic.VbTypeDecl;
import org.siphon.visualbasic.compile.ImplementorClassModuleDecl;
import org.siphon.visualbasic.compile.ImpossibleException;
import org.siphon.visualbasic.runtime.ArgumentDecl;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.JavaModuleInstance;
import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.UdtInstance;
import org.siphon.visualbasic.runtime.VbArray;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.VbVariable;
import org.siphon.visualbasic.runtime.framework.vb.Form;
/**
 * 生成 EvalAssignable 对象，支持 apply 和 assign 操作，对应用于求值和赋值
 * 
 * @author Inshua
 */
public class EvalAssignableStatement extends Statement {

	private static class JavaMapCaller extends EvalAssignableObject{

		private Map map;
		private String key;
		private SourceLocation sourceLocation;

		public JavaMapCaller(Map map, String key, SourceLocation sourceLocation) {
			this.map = map;
			this.key = key;
			this.sourceLocation = sourceLocation;
		}

		@Override
		public VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			try {
				Object o = map.get(key);
				if(o == null){
					return VbValue.Null.clone();
				} else {
					return VbValue.fromJava(o);
				}
			} catch(ClassCastException e){
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation, e);
			} catch (Exception e) {
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation, e);
			}
		}

		@Override
		public void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			try {
				map.put(key, value.toJava());
			} catch(ClassCastException e){
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation, e);
			} catch (Exception e) {
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation, e);
			}
		}

	}

	private static class JavaArrayCaller extends EvalAssignableObject{

		private Object javaArray;
		private Statement index;
		private SourceLocation sourceLocation;

		public JavaArrayCaller(Object javaArray, Statement index, SourceLocation sourceLocation) {
			this.javaArray = javaArray;
			this.index = index;
			this.sourceLocation = sourceLocation;
		}

		@Override
		public VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			try {
				VbValue v = index.eval(interpreter, frame);
				Integer i = (Integer) VbValue.CInt(v).value;
				Object o = Array.get(javaArray, i);
				return VbValue.fromJava(o);
			} catch (ArrayIndexOutOfBoundsException e) {
				throw new VbRuntimeException(VbRuntimeException.下标越界, sourceLocation, e);
			} catch(ClassCastException e){
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation, e);
			} catch (Exception e) {
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation, e);
			}
		}

		@Override
		public void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			try {
				VbValue v = index.eval(interpreter, frame);
				Integer i = (Integer) VbValue.CInt(v).value;
				Array.set(javaArray, i, value.toJava(javaArray.getClass().getComponentType()));
			} catch (ArrayIndexOutOfBoundsException e) {
				throw new VbRuntimeException(VbRuntimeException.下标越界, sourceLocation, e);
			} catch(ClassCastException e){
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation, e);
			} catch (Exception e) {
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation, e);
			}
		}
		
		

	}

	private static class JavaListCaller extends EvalAssignableObject {

		private List list;
		private SourceLocation sourceLocation;
		private Statement index;

		public JavaListCaller(List list, Statement index, SourceLocation sourceLocation) {
			this.list = list;
			this.index = index;
			this.sourceLocation = sourceLocation;
		}

		@Override
		public VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			try {
				VbValue value = index.eval(interpreter, frame);
				Integer i = (Integer) VbValue.CInt(value).value;
				return VbValue.fromJava(list.get(i), false);
			} catch (IndexOutOfBoundsException e) {
				throw new VbRuntimeException(VbRuntimeException.下标越界, sourceLocation, e);
			} catch(ClassCastException e){
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation, e);
			} catch (Exception e) {
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation, e);
			}
		}

		@Override
		public void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			try {
				VbValue v = index.eval(interpreter, frame);
				Integer i = (Integer) VbValue.CInt(v).value;
				list.set(i, value.toJava());
			} catch (IndexOutOfBoundsException e) {
				throw new VbRuntimeException(VbRuntimeException.下标越界, sourceLocation, e);
			} catch(ClassCastException e){
				throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation, e);
			} catch (Exception e) {
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation, e);
			}
		}
		
		

	}

	private static class JavaPropertyCaller extends EvalAssignableObject {

		private Object instance;
		private JavaBeanProperty property;
		private SourceLocation sourceLocation;
		private List<Statement> arguments;

		public JavaPropertyCaller(Object instance, JavaBeanProperty property, SourceLocation currSourceLocation,
				List<Statement> arguments) {
			this.instance = instance;
			this.property = property;
			sourceLocation = currSourceLocation;
			this.arguments = arguments;
		}

		@Override
		public VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			Method method = this.property.get;
			if(method == null){
				throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, sourceLocation);
			}
			try {
				Object result = method.invoke(instance);
				return VbValue.fromJava(result, false);
			} catch (Exception e) {
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation, e);
			}
		}

		@Override
		public void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			Method method = this.property.set;
			if(method == null){
				throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, sourceLocation);
			}
			Parameter[] params = method.getParameters();
			Object[] args = new Object[params.length];
			assert params.length  == 1;
			args[0] = value.toJava(params[0].getType());
			try {
				method.invoke(instance, args);
			} catch (Exception e) {
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation, e);
			}
		}

	}

	private static class JavaMethodCaller extends EvalAssignableObject {

		private Object instance;
		private Method method;
		private SourceLocation sourceLocation;
		private List<VbValue> argCalls;

		public JavaMethodCaller(Object instance, Method method, SourceLocation currSourceLocation, List<VbValue> argCalls) {
			this.instance = instance;
			this.method = method;
			sourceLocation = currSourceLocation;
			this.argCalls = argCalls;
		}

		@Override
		public VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			try {
				List<Object> lsArgs = new ArrayList<>();
				Parameter[] params = method.getParameters();
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
				Object result = method.invoke(instance, args);
				return VbValue.fromJava(result, false);
			} catch (Exception e) {
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation, e);
			}
		}

		@Override
		public void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation);
		}

	}

	private static class JavaFieldCaller extends EvalAssignableObject {

		private Object instance;
		private Field field;
		private SourceLocation sourceLocation;

		public JavaFieldCaller(Object instance, Field field, SourceLocation sourceLocation) {
			this.instance = instance;
			this.field = field;
			this.sourceLocation = sourceLocation;
		}

		@Override
		public VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			try {
				Object result = field.get(instance);
				return VbValue.fromJava(result, false);
			} catch (Exception e) {
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation, e);
			}
		}

		@Override
		public void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			try {
				field.set(instance, value.toJava(field.getClass()));
			} catch (Exception e) {
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation, e);
			}
		}

	}

	public static class JavaBeanProperty {

		public Method get;
		public Method set;

		public Parameter[] getParameters() {
			if (get != null) {
				return get.getParameters();
			} else {
				assert set != null;
				Parameter[] params = set.getParameters();
				Parameter[] result = new Parameter[params.length - 1];
				for (int i = 0; i < params.length - 1; i++) {
					result[i] = params[i];
				}
				return result;
			}
		}

		public Class<?> getReturnType() {
			if (get != null) {
				return get.getReturnType();
			} else {
				assert set != null;
				Parameter[] params = set.getParameters();
				return params[params.length - 1].getType();
			}
		}

	}

	public static class MemberAtLocation {

		public SourceLocation sourceLocation;
		public Object member;

		public MemberAtLocation(Object member, SourceLocation sourceLocation) {
			assert member != null;
			this.member = member;
			this.sourceLocation = sourceLocation;
		}

		@Override
		public String toString() {
			return member.toString();
		}

	}

	public static class DictionaryCall {

		private String key;

		public DictionaryCall(String key) {
			this.key = key;
		}

		@Override
		public String toString() {
			return "!" + key;
		}

	}

	public static class ArrayElement extends EvalAssignableObject {

		public final VbArray array;
		public final List<Statement> subscripts;
		private SourceLocation sourceLocation;

		public ArrayElement(VbArray value, MemberAtLocation ml) {
			this.array = value;
			this.subscripts = (List<Statement>) ml.member;
			this.sourceLocation = ml.sourceLocation;
		}

		public VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			Integer[] indexes = new Integer[subscripts.size()];
			int i = 0;
			for (Statement arg : subscripts) {
				VbValue v = arg.eval(interpreter, frame);
				try {
					v = VbValue.cast((VbValue) v, VbVarType.vbInteger);
				} catch (OverflowException e) {
					throw new VbRuntimeException(VbRuntimeException.溢出, arg.getSourceLocation());
				}
				indexes[i++] = (Integer) v.value;
			}
			return array.get(indexes, sourceLocation);
		}

		@Override
		public void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			Integer[] indexes = new Integer[subscripts.size()];
			int i = 0;
			for (Statement arg : subscripts) {
				Object v;
				try {
					v = VbValue.cast((VbValue) (arg.eval(interpreter, frame)), VbVarType.vbInteger).value;
				} catch (OverflowException e) {
					throw new VbRuntimeException(VbRuntimeException.溢出, arg.getSourceLocation());
				}
				indexes[i++] = (Integer) v;
			}
			array.set(indexes, value.clone(), sourceLocation);			
		}

		@Override
		public String toString() {
			return String.format("(%)", this.subscripts);
		}

	}

	public static class DictionaryElement extends EvalAssignableObject {

		public final VbValue object;
		public final String key;
		private SourceLocation sourceLocation;

		public DictionaryElement(VbValue object, String key, SourceLocation sourceLocation) {
			this.object = object;
			this.key = key;
			this.sourceLocation = sourceLocation;
		}

		public VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			if (object.varType.vbType != VbVarType.vbObject) {
				throw new VbRuntimeException(VbRuntimeException.要求对象);
			}
			if (object.varType.isDictionary() == false) {
				throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, sourceLocation);
			}
			ClassTypeDecl ctd = (ClassTypeDecl) object.varType.typeDecl;
			ClassModuleDecl cm = ctd.classModule;
			ModuleMemberDecl mmd = cm.getDictionaryMember();
			MethodDecl md = null;
			if (mmd instanceof MethodDecl) {
				md = (MethodDecl) mmd;
			} else {
				md = ((PropertyDecl) mmd).get;
				if (md == null) {
					throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, sourceLocation);
				}
			}
			try {
				return interpreter.callMethod((ModuleInstance) object.value, md, new VbValue(VbVarType.VbString, key));
			} catch (ArgumentException e) {
				throw new ImpossibleException();
			}
		}

		@Override
		public void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			if (object.varType.vbType != VbVarType.vbObject) {
				throw new VbRuntimeException(VbRuntimeException.要求对象);
			}
			if (object.varType.isDictionary() == false) {
				throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, sourceLocation);
			}
			ClassTypeDecl ctd = (ClassTypeDecl) object.varType.typeDecl;
			ClassModuleDecl cm = ctd.classModule;
			ModuleMemberDecl mmd = cm.getDictionaryMember();
			MethodDecl md = null;
			if (mmd instanceof PropertyDecl) {
				if (value.isObject()) {
					md = ((PropertyDecl) mmd).set;
				} else {
					md = ((PropertyDecl) mmd).let;
				}
			}
			if (md == null) {
				throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, sourceLocation);
			}
			try {
				interpreter.callMethod((ModuleInstance) object.value, md, new VbValue(VbVarType.VbString, key), value);
			} catch (ArgumentException e) {
				throw new ImpossibleException();
			}
		}

		@Override
		public String toString() {
			return String.format("!%", this.key);
		}

	}

	public static class Member {

		final String name;

		public Member(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "." + name;
		}

	}

	private static class MethodCaller extends EvalAssignableObject {

		public final MethodDecl method;
		public final List<Statement> args;
		private ModuleInstance moduleInstance;
		private SourceLocation sourceLocation;

		public MethodCaller(ModuleInstance moduleInstance, MethodDecl method, SourceLocation sourceLocation,
				List<Statement> next) {
			this.moduleInstance = moduleInstance;
			this.method = method;
			this.args = next;
			this.sourceLocation = sourceLocation;
		}

		public MethodCaller(ModuleInstance moduleInstance, MethodDecl method, SourceLocation sourceLocation) {
			this.moduleInstance = moduleInstance;
			this.method = method;
			this.args = null;
			this.sourceLocation = sourceLocation;
		}

		public VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			if (args != null) {
				interpreter.processNamedArguments(method.arguments, args);

				Object[] arr = new Object[args.size()];
				for (int i = 0; i < args.size(); i++) {
					if (args.get(i) == null)
						continue; // optional
					arr[i] = args.get(i).eval(interpreter, frame);
				}
				VbValue r = interpreter.callMethod(moduleInstance, args, method, arr);
				return r;
			} else {
				return interpreter.callMethod(moduleInstance, args, method);
			}
		}

		@Override
		public void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, sourceLocation);
		}

	}

	private static class PropertyCaller extends EvalAssignableObject {

		public final PropertyDecl property;
		public final List<Statement> args;
		private ModuleInstance moduleInstance;
		private SourceLocation sourceLocation;

		public PropertyCaller(ModuleInstance moduleInstance, PropertyDecl property, SourceLocation sourceLocation,
				List<Statement> next) {
			this.moduleInstance = moduleInstance;
			this.property = property;
			this.args = next;
			this.sourceLocation = sourceLocation;
		}

		public PropertyCaller(ModuleInstance moduleInstance, PropertyDecl property, SourceLocation sourceLocation) {
			this.moduleInstance = moduleInstance;
			this.property = property;
			this.args = null;
			this.sourceLocation = sourceLocation;
		}

		public VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			if (args != null) {
				interpreter.processNamedArguments(property.get.arguments, args);
				Object[] arr = new Object[args.size()];
				for (int i = 0; i < args.size(); i++) {
					arr[i] = args.get(i).eval(interpreter, frame);
				}
				return interpreter.callMethod(moduleInstance, args, property.get, arr);
			} else {
				return interpreter.callMethod(moduleInstance, args, property.get);
			}
		}

		@Override
		public void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			MethodDecl method = this.property.let;
			if (value.varType.vbType == VbVarType.vbObject) {
				method = this.property.set;
			}
			if (method == null) {
				throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, sourceLocation);
			}
			if (args != null) {
				interpreter.processNamedArguments(method.arguments, args);

				Object[] arr = new Object[args.size() + 1];
				for (int i = 0; i < args.size(); i++) {
					arr[i] = args.get(i).eval(interpreter, frame);
				}
				arr[arr.length - 1] = value;
				interpreter.callMethod(moduleInstance, args, method, arr);
			} else {
				interpreter.callMethod(moduleInstance, args, method, value);
			}
		}

	}

	public static class VariableEA extends EvalAssignableObject {

		private VbVariable variable;
		private SourceLocation sourceLocation;

		public VariableEA(VbVariable var, SourceLocation sourceLocation) {
			assert var != null;
			this.variable = var;
			this.sourceLocation = sourceLocation;
		}

		public VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			if (variable == VbVariable.ME) {
				return frame.module.asVbValue();
			}
			return variable.value;
		}

		@Override
		public void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			variable.assign(value, interpreter, frame, sourceLocation);
		}

	}

	public static class With extends EvalAssignableObject {

		@Override
		public VbValue apply(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			return frame.withObject;
		}

		@Override
		public void assign(VbValue value, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			throw new ImpossibleException();
		}

		@Override
		public String toString() {
			return "(CURR WITH)";
		}
	}

	public static class ApplyStatement extends Statement {

		final EvalAssignableStatement base;

		private ApplyStatement(EvalAssignableStatement base) {
			super(base.sourceLocation);
			this.base = base;
		}

		@Override
		public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
			Object o = base.evalIt(interpreter, frame);
			return base.apply(o, interpreter, frame);
		}

		@Override
		public String toString() {
			return String.format("%s.Apply", base);
		}
	}

	private final List<MemberAtLocation> thrumb = new ArrayList<>();
	private SourceLocation currSourceLocation;

	public EvalAssignableStatement(SourceLocation sourceLocation, Object start) {
		super(sourceLocation);
		thrumb.add(new MemberAtLocation(start, sourceLocation));
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		throw new ImpossibleException(); // 如果求值会调用 apply，如果不求值需要得到 EvalAssignableObject 则调用 evalIt
	}

	public Object evalIt(Interpreter interpreter, CallFrame frame) throws VbRuntimeException { // return EvalAssignObject|VbValue

		Iterator<MemberAtLocation> it = thrumb.iterator();
		MemberAtLocation ml = it.next();
		Object base = ml.member;

		MemberAtLocation next = it.hasNext() ? it.next() : null;
		this.currSourceLocation = ml.sourceLocation;

		if (base instanceof ConstDecl) {
			base = ((ConstDecl) base).constValue;

		}
		if (base instanceof VarDecl) {
			base = frame.locateVbVariable((VarDecl) base);
			base = new VariableEA((VbVariable) base, this.currSourceLocation);
		} else if (base instanceof MethodDecl) {
			if (next != null && next.member instanceof List<?>) {
				base = new MethodCaller(frame.module, (MethodDecl) base, this.currSourceLocation,
						(List<Statement>) next.member);
				next = processToNext(it, next);
			} else {
				base = new MethodCaller(frame.module, (MethodDecl) base, this.currSourceLocation);
			}
		} else if (base instanceof PropertyCaller) {
			if (next != null && next.member instanceof List<?>) {
				base = new PropertyCaller(frame.module, (PropertyDecl) base, this.currSourceLocation,
						(List<Statement>) next.member);
				next = processToNext(it, next);
			} else {
				base = new PropertyCaller(frame.module, (PropertyDecl) base, this.currSourceLocation);
			}

		} else if (base instanceof VbValue) {
			// nothing todo
		} else if (base instanceof EvalAssignableObject) {
			// nothing todo
		} else {
			throw new ImpossibleException();
		}

		int i = 0;
		while (next != null) {
			if (i++ > 10000) {
				System.out.println("dead loop.......");
			}
			// apply it
			Object prevBase = base;
			base = apply(base, interpreter, frame);
			assert base instanceof VbValue;

			// new start, must be a VbValue
			VbValue b = (VbValue) base;
			if (b.isVariant())
				b = (VbValue) b.value;

			if (b instanceof VbArray) {
				if (next != null && next.member instanceof List) {
					base = new ArrayElement((VbArray) b, next);
					next = processToNext(it, next);
				} else {
					throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, next.sourceLocation);
				}
			} else if (b.varType.vbType == VbVarType.vbUserDefinedType) {
				UdtInstance udt = (UdtInstance) b.value;
				if (next != null && next.member instanceof VarDecl) {
					base = udt.getVar(((VarDecl) next.member).upperCaseName());
					if (base == null)
						throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, next.sourceLocation);
					next = processToNext(it, next);

				} else if (next != null && next.member instanceof Member) {
					base = udt.getVar(((Member) next.member).name);
					if (base == null)
						throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, next.sourceLocation);
					next = processToNext(it, next);
				} else if (next != null) {
					throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, next.sourceLocation);
				}
				base = new VariableEA((VbVariable) base, this.currSourceLocation);

			} else if (b.varType.vbType == VbVarType.vbObject) {
				if (b.value instanceof ModuleInstance) {
					ModuleInstance instance = b.ensureInstanceInited(interpreter, frame, this.currSourceLocation);
					if(instance.getModuleDecl() instanceof FormModuleDecl) {
						try {
							interpreter.ensureFormLoaded(instance);
						} catch (ArgumentException e) {
							throw new VbRuntimeException(VbRuntimeException.无效的过程调用, next.sourceLocation, e);
						}
					}

					boolean stay = false;
					Object member = next.member;
					ClassModuleDecl instanceClass = (ClassModuleDecl) instance.getModuleDecl();
					ClassModuleDecl requestClass = b.varType.getClassModuleDecl();
					boolean overrided = requestClass != instanceClass;
					if (member instanceof Member) {
						Member m = (Member) next.member;
						member = instance.getMember(m.name, overrided ? requestClass : null); // 对于 implement 其它接口的 module instance，varType.typeDecl 绑定到其它 module
						if (member == null)
							throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, next.sourceLocation);
					} else if (member instanceof List<?>) {
						member = b.varType.getDefaultMember();
						if (member == null)
							throw new VbRuntimeException(VbRuntimeException.无效的过程调用, next.sourceLocation);
						stay = true;
					} else if (next != null && next.member instanceof DictionaryCall) {
						base = new DictionaryElement(b, ((DictionaryCall) next.member).key, next.sourceLocation);
						next = processToNext(it, next);
						continue;
					} else if (overrided && member instanceof VbDecl) { // include vardecl and method decl and ...
						member = ((ImplementorClassModuleDecl) requestClass).getMirrorMember((VbDecl) member);
						if (member == null)
							throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, next.sourceLocation);
					}

					if (member instanceof MethodDecl) { // TODO 测试一下返回对象的函数
						MethodDecl method = (MethodDecl) member;
						if (!stay)
							next = processToNext(it, next);
						if (nextIsArgs(method.arguments, method.returnType, next)) {
							base = new MethodCaller(instance, method, currSourceLocation, (List<Statement>) next.member);
							next = processToNext(it, next);
						} else {
							base = new MethodCaller(instance, method, currSourceLocation);
						}

					} else if (member instanceof VbVariable) {
						base = new VariableEA((VbVariable) member, currSourceLocation);
						next = processToNext(it, next);

					} else if (member instanceof VarDecl) {
						VbVariable var = frame.locateVbVariable((VarDecl) member, instance);
						base = new VariableEA(var, this.currSourceLocation);
						next = processToNext(it, next);

					} else if (member instanceof PropertyDecl) {
						PropertyDecl property = (PropertyDecl) member;
						if (!stay)
							next = processToNext(it, next);
						if (nextIsArgs(property.getArguments(), property.getReturnType(), ml)) {
							base = new PropertyCaller(instance, property, currSourceLocation, (List<Statement>) next.member);
							next = processToNext(it, next);
						} else {
							base = new PropertyCaller(instance, property, currSourceLocation);
						}

					} else { // maybe Nothing
						throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, next.sourceLocation);
					}
				} else if (b.varType.typeDecl == ClassTypeDecl.JAVA_OBJECT_TYPE) {
					Object instance = b.value;

					boolean stay = false;
					Object member = next.member;
					Class<? extends Object> clazz = instance.getClass();
					int argCount = 0;
					if (member instanceof Member) {
						Member m = (Member) next.member;
						next = processToNext(it, next);
						if (next != null && next.member instanceof List) {
							argCount = ((List) next.member).size();
						}
						member = findNearestJavaMember(clazz, m.name, argCount); // 对于 implement 其它接口的 module instance，varType.typeDecl 绑定到其它 module
						if (member == null)
							throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, next.sourceLocation);
					} else if (member instanceof List<?>) {
						 if(b.value instanceof List){
							 List<Statement> ls = (List<Statement>)member;
							 if(ls.size() != 1){
								 throw new VbRuntimeException(VbRuntimeException.无效的过程调用, next.sourceLocation);
							 }
							 base = new JavaListCaller((List)b.value, ls.get(0), next.sourceLocation);
							 next = processToNext(it, next);
							 continue;
						 } else if(b.value.getClass().isArray()){
							 List<Statement> ls = (List<Statement>)member;
							 if(ls.size() != 1){
								 throw new VbRuntimeException(VbRuntimeException.无效的过程调用, next.sourceLocation);
							 }
							 base = new JavaArrayCaller(b.value, ls.get(0), next.sourceLocation);
							 next = processToNext(it, next);
							 continue;
						 } else{
							 throw new VbRuntimeException(VbRuntimeException.无效的过程调用, next.sourceLocation);
						 }
					} else if (next != null && next.member instanceof DictionaryCall) {
						if(b.value instanceof Map){
							base = new JavaMapCaller((Map)b.value, ((DictionaryCall) next.member).key, next.sourceLocation);
							next = processToNext(it, next);
							continue;
						 } else{
							 throw new VbRuntimeException(VbRuntimeException.无效的过程调用, next.sourceLocation);
						 }
					}

					boolean nextIsArgs = false;
					List<VbValue> argCalls = null;
					if (member instanceof List) { // matched many methods
						if (argCount == 0) {
							throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, next.sourceLocation);
						}
						List<FindNearestJavaMemberResult> ls = (List<FindNearestJavaMemberResult>) member;
						boolean evalArgsFirst = CollectionUtils.exists(ls, new Predicate() {
							public boolean evaluate(Object arg0) {
								FindNearestJavaMemberResult r = (FindNearestJavaMemberResult) arg0;
								return r.isArg;
							}
						});
						if (evalArgsFirst) {
							argCalls = new ArrayList<VbValue>();
							for (Statement stmt : (List<Statement>) next.member) {
								argCalls.add(stmt.eval(interpreter, frame));
							}
						}
						for (FindNearestJavaMemberResult n : ls) {
							Parameter[] params = ((Method) n.result).getParameters();
							n.similarity = getSimilarity(params, argCalls);
						}
						ls.sort(new Comparator<FindNearestJavaMemberResult>() {
							public int compare(FindNearestJavaMemberResult o1, FindNearestJavaMemberResult o2) {
								return o2.similarity - o1.similarity;
							}
						});
						if (ls.get(0).similarity > 0) {
							if (ls.get(1).similarity > 0  && ls.get(0).similarity >= ls.get(1).similarity * 1.2) {	// 匹配的方法区分度够大 
								member = ls.get(0).result;
								nextIsArgs = ls.get(0).isArg && (next != null && next.member instanceof List);
							} else {
								throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, next.sourceLocation); // TODO 应抛出二义性名称之类
							}
						}
					} else if (member instanceof FindNearestJavaMemberResult) {
						FindNearestJavaMemberResult r = (FindNearestJavaMemberResult) member;
						nextIsArgs = r.isArg && (next != null && next.member instanceof List);
						member = r.result;
						if (nextIsArgs) {
							argCalls = new ArrayList<VbValue>();
							for (Statement stmt : (List<Statement>) next.member) {
								argCalls.add(stmt.eval(interpreter, frame));
							}
						}
					} else {
						throw new ImpossibleException();
					}

					if (member instanceof Method) {
						Method method = (Method) member;
						if (nextIsArgs) {
							base = new JavaMethodCaller(instance, method, currSourceLocation, (List<VbValue>) argCalls);
							next = processToNext(it, next);
						} else {
							base = new JavaMethodCaller(instance, method, currSourceLocation, Collections.emptyList());
						}

					} else if (member instanceof Field) {
						base = new JavaFieldCaller(instance, (Field) member, currSourceLocation);

					} else if (member instanceof JavaBeanProperty) {
						JavaBeanProperty property = (JavaBeanProperty) member;
						if (nextIsArgs(property.getParameters(), property.getReturnType(), next)) {
							base = new JavaPropertyCaller(instance, property, currSourceLocation,
									(List<Statement>) next.member);
							next = processToNext(it, next);
						} else {
							base = new JavaPropertyCaller(instance, property, currSourceLocation, Collections.emptyList());
						}
					} else { // no match
						throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, next.sourceLocation);
					}
				} else {
					throw new ImpossibleException();
				}
			} else {
				throw new ImpossibleException();
			}
		}

		return base;
	}

	private MemberAtLocation processToNext(Iterator<MemberAtLocation> it, MemberAtLocation next) {
		if (next == null)
			return next;
		currSourceLocation = next.sourceLocation;
		next = it.hasNext() ? it.next() : null;
		return next;
	}

	private boolean nextIsArgs(List<ArgumentDecl> arguments, VbVarType returnType, MemberAtLocation ml) {
		boolean result = true;
		Object next = (ml == null ? null : ml.member);
		if (next instanceof List) {
			int sz = ((List) next).size();
			if (arguments.size() == 0) {
				if (sz == 0) {
					//
				} else if (returnType.vbType == VbVarType.vbArray || returnType.vbType == VbVarType.vbVariant) {
					result = false;
				} else { // TODO wrong arguments check soon
					//
				}
			}
		} else {
			result = false;
		}
		return result;
	}

	private boolean nextIsArgs(Parameter[] parameters, Class<?> returnType, MemberAtLocation ml) {
		boolean result = true;
		Object next = (ml == null ? null : ml.member);
		if (next instanceof List) {
			int sz = ((List) next).size();
			if (parameters.length == 0) {
				if (sz == 0) {
					//
				} else if (returnType.isArray() || returnType.isAssignableFrom(List.class)) {
					result = false;
				} else { // TODO wrong arguments check soon
					//
				}
			}
		} else {
			result = false;
		}
		return result;
	}

	private static class FindNearestJavaMemberResult {
		boolean isArg;
		Object result;
		int similarity;

		public FindNearestJavaMemberResult(boolean isArg, Object result) {
			this.isArg = isArg;
			this.result = result;
		}
	}

	private Object findNearestJavaMember(Class<? extends Object> clazz, String member, int argCallCount)
			throws VbRuntimeException {
		try {
			for (Field fld : clazz.getFields()) {
				if (fld.getName().equalsIgnoreCase(member)) {
					return new FindNearestJavaMemberResult(false, fld);
				}
			}
			List<FindNearestJavaMemberResult> maybe = new ArrayList<>();
			for (Method method : clazz.getMethods()) {
				if (method.getName().equalsIgnoreCase(member)) {
					Parameter[] params = method.getParameters();
					if (params.length == argCallCount) {
						maybe.add(new FindNearestJavaMemberResult(true, method));
					} else if (params.length < argCallCount && params.length > 0) {
						if (params[params.length - 1].isVarArgs()) {
							maybe.add(new FindNearestJavaMemberResult(true, method));
						} else if (method.getReturnType().isArray() || List.class.isAssignableFrom(method.getReturnType())) {
							if (argCallCount == 1) {
								maybe.add(new FindNearestJavaMemberResult(false, method));
							}
						}
					}
				}
			}
			if (maybe.size() == 1)
				return maybe.get(0);
			else if (maybe.size() > 1) {
				return maybe;
			}

			JavaBeanProperty pd = null; // 先不管 getXxx(param1, param2, param3, ...) 的情形
			String get = "get" + member;
			String set = "set" + member;
			for (Method method : clazz.getMethods()) {
				if (method.getName().equalsIgnoreCase(get)) {
					if (pd == null)
						pd = new JavaBeanProperty();
					pd.get = method;
				} else if (method.getName().equalsIgnoreCase(set)) {
					if (pd == null)
						pd = new JavaBeanProperty();
					pd.set = method;
				}
			}
			return new FindNearestJavaMemberResult(false, pd);
		} catch (SecurityException | IllegalArgumentException e) {
			throw new VbRuntimeException(VbRuntimeException.对象不支持此属性或方法, sourceLocation, e);
		}
	}

	public static int getSimilarity(Parameter[] params, List<VbValue> argCalls) {
		int result = 0;
		if (params.length == argCalls.size()) {
			result += 100;
		} else if (params.length < argCalls.size()) {
			if (params[params.length - 1].isVarArgs()) {
				result += 80;
			}
		}
		if (result > 0) {
			int i = 0;
			for (Parameter param : params) {
				if(param.isVarArgs() == false){
					VbValue v = argCalls.get(i++);
					result += v.getSimilarity(param.getType());
				}
			}
		}

		return result;
	}

	private VbValue apply(Object base, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		if (base instanceof VbValue)
			return (VbValue) base;

		if (base instanceof VbVariable) {
			return ((VbVariable) base).value;
		}

		if (base instanceof EvalAssignableObject) {
			return ((EvalAssignableObject) base).apply(interpreter, frame);
		}

		return null;
	}

	/**
	 * 终结, 求值。终结总是要求值。
	 * 
	 * @param lsSubscripts
	 * @return
	 */
	public Statement apply() {
		return new ApplyStatement(this);
	}

	public EvalAssignableStatement bind(SourceLocation sourceLocation, Object member) {
		this.thrumb.add(new MemberAtLocation(member, sourceLocation));
		return this;
	}

	public MemberAtLocation peek() {
		return thrumb.get(thrumb.size() - 1);
	}

	@Override
	public String toString() {
		String s = "(EA ";
		s += this.thrumb.get(0);
		for (int i = 1; i < this.thrumb.size(); i++) {
			Object t = this.thrumb.get(i);
			s += " " + t;
		}
		s += ")";
		return s;
	}

}
