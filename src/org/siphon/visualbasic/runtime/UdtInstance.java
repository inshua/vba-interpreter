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
package org.siphon.visualbasic.runtime;

import java.util.HashMap;
import java.util.Map;

import org.siphon.visualbasic.UdtDecl;
import org.siphon.visualbasic.VarDecl;

public class UdtInstance {
	
	public final UdtDecl decl;


	public UdtInstance(UdtDecl udtDecl) {
		this.decl = udtDecl;
		for(VarDecl vd : udtDecl.members.values()){
			members.put(vd.name.toUpperCase(), vd.createVar());
		}
	}

	private Map<String, VbVariable> members = new HashMap<>();
	
	
	public VbVariable getVar(String name){
		return members.get(name.toUpperCase());
	}
	
	public VbValue getValue(String name){
		return members.get(name.toUpperCase()).value;
	}
	
	public void setValue(String name, VbValue value){
		members.get(name.toUpperCase()).value = value;
	}
	
	public UdtInstance clone(){
		UdtInstance inst = new UdtInstance(this.decl);
		for(VarDecl vd : decl.members.values()){
			String name = vd.name.toUpperCase();
			inst.members.get(name).value = this.members.get(name).value.clone();
		}
		return inst;
	}
	
}
