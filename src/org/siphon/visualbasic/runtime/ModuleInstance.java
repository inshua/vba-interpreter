package org.siphon.visualbasic.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.EventDecl;
import org.siphon.visualbasic.Interpreter;
import org.apache.commons.lang3.ObjectUtils;
import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.TheClass;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.VbDecl;
import org.siphon.visualbasic.compile.ImpossibleException;

public class ModuleInstance {

	public static final Object WAIT_NEW = new ModuleInstance(); // 用于 VbValue.value，指示对象是否有待创建

	private final ModuleDecl moduleDecl;

	public final Map<VarDecl, VbVariable> variables = new HashMap<>();

	public final VbValue _asVbValue;

	private List<EventSubscriber> eventSubscribers = new ArrayList<>();

	public VbValue asVbValue() {
		return this._asVbValue;
	}

	private ModuleInstance() {
		moduleDecl = null;
		this._asVbValue = null;
	}

	public ModuleInstance(ModuleDecl module) {
		this.moduleDecl = module;

		for (String name : module.members.keySet()) {
			VbDecl member = module.members.get(name);
			if (member instanceof VarDecl) {
				VarDecl varDecl = (VarDecl) member;
				this.variables.put(varDecl, varDecl.createVar());

			} else if (member instanceof MethodDecl) {
				MethodDecl methodDecl = (MethodDecl) member;
				for (VarDecl var : methodDecl.variables.values()) {
					if (var.isStatic) {
						this.variables.put(var, var.createVar());
					}
				}
			}
		}

		if (module instanceof ClassModuleDecl) {
			ClassModuleDecl classModule = (ClassModuleDecl) module;
			VbVarType t = new VbVarType(VbVarType.vbObject, new ClassTypeDecl(module.library, classModule), null, null);
			this._asVbValue = new VbValue(t, this);

		} else {
			this._asVbValue = null;
		}
	}

	public ModuleDecl getModuleDecl() {
		return this.moduleDecl;
	}

	public VbValue getFieldValue(String name) {
		return variables.get(name.toUpperCase()).value;
	}

	public Object getMember(String name) {
		name = name.toUpperCase();
		if (this.variables.containsKey(name)) {
			return this.variables.get(name);
		} else {
			return this.moduleDecl.members.get(name);
		}
	}

	public Object getMember(String name, ClassModuleDecl requestClassModule) {
		if(requestClassModule == null){
			return this.getMember(name);
		}
		name = name.toUpperCase();
		if(requestClassModule.members.containsKey(name)){
			return requestClassModule.members.get(name);
		} else {
			return this.variables.get(name);
		}
	}
	
	public void initializeClass(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		ClassModuleDecl classModule = (ClassModuleDecl) this.moduleDecl;
		VbVariable baseObjVar = this.variables.get(classModule.getBaseObject());
		if (baseObjVar == null)
			return;
		try {
			baseObjVar.value.ensureInstanceInited(interpreter, frame, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ModuleInstance instance = (ModuleInstance) baseObjVar.value.value;

		instance.bindEventHandlers(baseObjVar.varDecl, this, interpreter, frame);

		ClassTypeDecl decl = (ClassTypeDecl) baseObjVar.varType.typeDecl;
		TheClass theClass = (TheClass) decl.classModule;
		instance.raiseEvent(theClass.initializeEvent, null, null, interpreter, frame);
	}

	public void addEventListener(ModuleInstance subscriber, EventDecl eventDecl, MethodDecl listener) {
		EventSubscriber es = new EventSubscriber(subscriber, eventDecl, listener);
		this.eventSubscribers.add(es);
	}

	public void removeEventListener(final ModuleInstance subscriber) {
		this.eventSubscribers.removeIf(new Predicate<EventSubscriber>() {

			@Override
			public boolean test(EventSubscriber t) {
				return ObjectUtils.equals(t.getSubscriber(), subscriber);
			}
		});
	}

	public void bindEventHandlers(VarDecl varDeclInSubscriber, ModuleInstance subscriber, Interpreter interpreter,
			CallFrame frame) {
		// bind events
		ClassModuleDecl classDecl = (ClassModuleDecl) this.getModuleDecl();
		for (EventDecl event : classDecl.events.values()) {
			String handlerName = varDeclInSubscriber.name + "_" + event.name;
			MethodDecl handler = (MethodDecl) subscriber.getMember(handlerName.toUpperCase());
			if (handler != null) {
				this.addEventListener(subscriber, event, handler);
			}
		}
	}

	public void raiseEvent(EventDecl eventDecl, List<VbValue> arguments, Interpreter interpreter, CallFrame frame)
			throws VbRuntimeException, ArgumentException {
		for (EventSubscriber subscriber : this.eventSubscribers) {
			if (subscriber.getEventDecl() == eventDecl) {
				if (arguments == null) {
					interpreter.callMethod(subscriber.getSubscriber(), subscriber.getListener());
				} else {
					interpreter.callMethod(subscriber.getSubscriber(), subscriber.getListener(), arguments.toArray());
				}
			}
		}
	}

	public void raiseEvent(EventDecl eventDecl, List<Statement> argumentStatements, List<VbValue> arguments,
			Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		for (EventSubscriber subscriber : this.eventSubscribers) {
			if (subscriber.getEventDecl() == eventDecl) {
				if (arguments == null) {
					interpreter.callMethod(subscriber.getSubscriber(), argumentStatements, subscriber.getListener());
				} else {
					interpreter.callMethod(subscriber.getSubscriber(), argumentStatements, subscriber.getListener(),
							arguments.toArray());
				}
			}
		}
	}

}
