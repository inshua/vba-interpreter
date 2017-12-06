package org.siphon.visualbasic;

import org.siphon.visualbasic.runtime.VbRuntimeException;

public interface Callback {
	void run() throws VbRuntimeException, ArgumentException;
}
