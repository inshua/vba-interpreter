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

import java.util.HashMap;
import java.util.Map;

import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.VbDecl;

// 派生类实现接口，对于每个要实现的接口，生成一个 Implementor，记录实现与接口声明之间的映射。用于 VbValue.varType.typeDecl。见 ClassModuleDecl.buildImplements
public class ImplementorClassModuleDecl extends ClassModuleDecl {

	public Map<VbDecl, VbDecl> mirrors = new HashMap<>();

	public ImplementorClassModuleDecl(Library lib, Compiler compiler) {
		super(lib, compiler);
	}

	public VbDecl getMirrorMember(VbDecl decl) {
		assert mirrors.get(decl) != null;		// TODO remove this line
		return mirrors.get(decl);
	}

}
