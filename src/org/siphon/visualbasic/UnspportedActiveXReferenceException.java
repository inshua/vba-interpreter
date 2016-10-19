package org.siphon.visualbasic;

public class UnspportedActiveXReferenceException extends Exception {

	public UnspportedActiveXReferenceException(String activeXLibName) {
		super(String.format("dont support activex reference: ref %s", activeXLibName));
	}

}
