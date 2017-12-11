/*******************************************************************************
 * Copyright (C) 2017 Inshua<inshua@gmail.com>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
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
