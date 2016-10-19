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
