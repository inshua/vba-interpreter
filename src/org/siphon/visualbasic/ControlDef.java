package org.siphon.visualbasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;

public class ControlDef {
	private VbVarType type;

	public VbVarType getType() {
		return type;
	}

	public void setType(VbVarType vbVarType) {
		this.type = vbVarType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ControlDef> getChildren() {
		return children;
	}

	public void setChildren(List<ControlDef> children) {
		this.children = children;
	}

	public Map<String, VbValue> getAttributes() {
		return attributes;
	}
	
	public Map<String, ControlDef> getComplexAttributes() {
		return complexAttributes;
	}

	private String name;
	private Map<String, VbValue> attributes = new TreeMap<>();
	private Map<String, ControlDef> complexAttributes = new TreeMap<>();
	private List<ControlDef> children = new ArrayList<>();
}
