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
package org.siphon.visualbasic;

import java.util.SortedMap;
import java.util.TreeMap;

public class UdtDecl  extends VbTypeDecl{

	public UdtDecl(Library library) {
		super(library);
	}
	
	public SortedMap<String, VarDecl> members = new TreeMap<>();

	public void addMember(VarDecl var) {
		members.put(var.upperCaseName(), var);
	}

	@Override
	public boolean hasMember(String name) {
		return this.members.containsKey(name.toUpperCase());
	}
	

	@Override
	public String toString() {
		return String.format("(UDT %s.%s)", this.library.name, this.name);
	}

	@Override
	public VbDecl getMember(String name) {
		return members.get(name);
	}
}
