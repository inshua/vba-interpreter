package org.siphon.visualbasic.runtime;

import java.util.ArrayList;
import java.util.List;

import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.EventDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.compile.JavaEventDecl;

public class JavaModuleInstance extends ModuleInstance {

	private final Object instance;

	public Object getInstance() {
		return instance;
	}

	public JavaModuleInstance(ModuleDecl module, Object instance) {
		super(module);
		this.instance = instance;

		if (module instanceof ClassModuleDecl) {
			ClassModuleDecl cmdcl = (ClassModuleDecl) module;
			mapJavaEvents(cmdcl);
		}
	}

	private void mapJavaEvents(ClassModuleDecl cmdcl) {
		for (String event : cmdcl.events.keySet()) {
			JavaEventDecl decl = (JavaEventDecl) cmdcl.events.get(event);

			final VbEventHandler handler = new VbEventHandler() {
				@Override
				public void handle(Interpreter interpreter, CallFrame callFrame,Object... arguments) throws VbRuntimeException, ArgumentException {
					List<VbValue> args = new ArrayList<>();
					for (int i = 0; i < arguments.length; i++) {
						args.add(VbValue.fromJava(arguments[i]));
					}
					JavaModuleInstance.this.raiseEvent(decl, args, interpreter, callFrame);
				}
			};
			try {
				if (decl.javaField.getType().isAssignableFrom(VbEventHandler.class)) {
					decl.javaField.set(this.instance, handler);
				} else {
					List<VbEventHandler> handlers = (List<VbEventHandler>) decl.javaField.get(this.instance);
					handlers.add(handler);
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				
			}

		}
	}

}
