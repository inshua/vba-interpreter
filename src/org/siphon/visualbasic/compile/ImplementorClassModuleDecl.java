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
