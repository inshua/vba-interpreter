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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.siphon.visualbasic.compile.NameIndex;
import org.siphon.visualbasic.runtime.ModuleInstance;

/**
 * 库，每个VB工程编译为一个库，也就是 TypeLib。
 * 
 * @author Inshua
 *
 */
public class Library extends VbDecl {
	
	public final Map<String, ModuleDecl> modules = new HashMap<>();
	
	public Map<String, VbTypeDecl> types = new HashMap<>();
	
	public final NameIndex names = new NameIndex();
	
	public Library(String name){
		super(null);
		this.name = name;
		this.names.addDecl(this);
	}
	
	public void addModule(ModuleDecl moduleDecl){
		this.modules.put(moduleDecl.name.toUpperCase(), moduleDecl);
		if(moduleDecl instanceof ClassModuleDecl){
			this.addType(new ClassTypeDecl(this, (ClassModuleDecl) moduleDecl));
		} else {
			this.names.addDecl(moduleDecl);
		}
	}
	
	public void addType(VbTypeDecl typeDecl) {
		this.types.put(typeDecl.upperCaseName(), typeDecl);
		this.names.addDecl(typeDecl);
	}

	@Override
	public String toString() {
		String s = "LIB " + name + "\r\n";
		for(ModuleDecl moduleDecl : modules.values()){
			s += "MODULE " + moduleDecl.name + "\r\n" + moduleDecl.toString() + "\r\n";
		}
		return s;
	}

	public boolean hasError() {
		for(ModuleDecl module : modules.values()){
			if(module.errors != null && module.errors.isEmpty() == false){
				return true;
			}
		}
		return false;
	}
	
	public List<Exception> getErrors(){
		List<Exception> result = new ArrayList<>();
		for(ModuleDecl module : modules.values()){
			if(module.errors != null && module.errors.isEmpty() == false){
				result.addAll(module.errors);
			}
		}
		return result;
	}

	public MethodDecl findSubMain() {
		for(ModuleDecl module : this.modules.values()){
			if(module instanceof ClassModuleDecl == false){
				if(module.members.containsKey("MAIN")){
					VbDecl m = module.members.get("MAIN");
					if(m instanceof MethodDecl){
						return (MethodDecl) m;
					}
				}
			}
		}
		
		return null;
	}

}
