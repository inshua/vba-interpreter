package org.siphon.visualbasic.runtime.interaction;

import java.util.Iterator;

import org.siphon.visualbasic.runtime.VbValue;

public class VbValueIterator implements Iterator<VbValue> {

	private Iterator iterator;

	public VbValueIterator(Iterator it) {
		this.iterator = it;
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public VbValue next() {
		return VbValue.fromJava(iterator.next());
	}

}
