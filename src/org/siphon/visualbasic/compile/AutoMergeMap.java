package org.siphon.visualbasic.compile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AutoMergeMap implements Map<String, Object> {

	private final Map<String, Object> global = new HashMap<>(); 
	
	public Object put(String name, Object decl) {
		name = name.toUpperCase();
		Object existed = global.get(name);
		if (existed == null) {
			global.put(name, decl);
		} else if (existed instanceof List) {
			List<Object> ls = (List<Object>) existed;
			ls.add(decl);
		} else {
			List<Object> ls = new ArrayList<>();
			ls.add(existed);
			ls.add(decl);
			global.put(name, ls);
		}
		return decl;
	}
	

	@Override
	public Object get(Object key) {
		return this.global.get(key);
	}

	@Override
	public int size() {
		return this.global.size();
	}

	@Override
	public boolean isEmpty() {
		return this.global.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return this.global.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return this.global.containsValue(value);
	}

	@Override
	public Object remove(Object key) {
		return this.global.remove(key);
	}

	@Override
	public void putAll(Map m) {
		this.global.putAll(m);
	}

	@Override
	public void clear() {
		this.global.clear();
	}

	@Override
	public Set keySet() {
		return this.global.keySet();
	}

	@Override
	public Collection values() {
		return this.global.values();
	}

	@Override
	public Set entrySet() {
		return this.global.entrySet();
	}

}
