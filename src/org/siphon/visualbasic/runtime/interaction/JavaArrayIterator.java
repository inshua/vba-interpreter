package org.siphon.visualbasic.runtime.interaction;

import java.util.Iterator;

import org.apache.commons.collections.iterators.ArrayIterator;
import org.siphon.visualbasic.runtime.VbValue;

public class JavaArrayIterator extends ArrayIterator {

	public JavaArrayIterator(Object array) {
		super(array);
	}

	@Override
	public VbValue next() {
		return VbValue.fromJava(super.next());
	}

}
