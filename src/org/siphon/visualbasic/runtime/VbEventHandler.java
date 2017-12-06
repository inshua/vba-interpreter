package org.siphon.visualbasic.runtime;

import java.util.List;

import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.Interpreter;

public interface VbEventHandler {
	void handle(Interpreter interpreter, CallFrame callFrame, Object... arguments) throws VbRuntimeException, ArgumentException;
}
