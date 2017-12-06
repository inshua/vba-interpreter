package org.siphon.visualbasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.siphon.visualbasic.compile.CompileException;
import org.siphon.visualbasic.compile.Compiler;
import org.siphon.visualbasic.compile.ImplementorClassModuleDecl;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.statements.AssignStatement;
import org.siphon.visualbasic.runtime.statements.EvalAssignableStatement;
import org.siphon.visualbasic.runtime.statements.NewStatement;

import vba.VbaParser.EventStmtContext;
import vba.VbaParser.ImplementsStmtContext;

public class ClassModuleDecl extends ModuleDecl {

	protected MeDecl _me;
	public Map<String, EventDecl> events = new HashMap<>();
	protected VarDecl baseObject;

	private ModuleMemberDecl defaultMember;
	private ModuleMemberDecl iteratorMember;
	private ModuleMemberDecl dictionaryMember;
	public List<ClassTypeDecl> implementClasses = new ArrayList<>();
	
	private Map<ClassModuleDecl, ClassTypeDecl> implementors = new HashMap<>();
	protected Compiler compiler;
	
	public VarDecl getBaseObject() {
		return baseObject;
	}

	public ClassModuleDecl(Library lib, Compiler compiler) {
		super(lib);
		this.compiler = compiler;
		this.moduleType = ModuleType.ClassModule;

		MeDecl me = new MeDecl(lib, this);
		me.varType = new VbVarType(VbVarType.vbObject, new ClassTypeDecl(lib, this), null, null);
		this._me = me;

		addTheBaseObjDecl(); // 增加一个成员 Class，用于 Class_Initialize, Class_Terminate
	}

	public ClassModuleDecl() {
		super(null);
	}

	protected void addTheBaseObjDecl() {
		if (this instanceof TheClass)
			return;

		VarDecl c = new VarDecl(this.library, this);
		c.name = "Class";
		c.withEvents = true;
		c.visibility = Visibility.PRIVATE;	// TODO HIDDEN
		c.withNew = true;

		ClassTypeDecl classTypeDecl = new ClassTypeDecl(library, new TheClass(library, compiler));
		c.varType = new VbVarType(VbVarType.vbObject, classTypeDecl, null, null);

		this.addMember(c);

		this.baseObject = c;
	}

	public MeDecl me() {
		return _me;
	}

	public void addEvent(EventStmtContext eventStmt, EventDecl eventDecl) {
		if (this.events.containsKey(eventDecl.upperCaseName())) {
			this.errors.add(this.newCompileException(eventStmt.ambiguousIdentifier(), CompileException.AMBIGUOUS_IDENTIFIER,
					eventStmt.ambiguousIdentifier()));
		} else {
			this.events.put(eventDecl.upperCaseName(), eventDecl);
		}
	}

	public void setDefaultMember(String memberName) {
		this.defaultMember = (ModuleMemberDecl) this.members.get(memberName.toUpperCase());
	}

	public ModuleMemberDecl getDefaultMember() {
		return this.defaultMember;
	}

	public void setIteratorMember(String memberName) {
		this.iteratorMember = (ModuleMemberDecl) this.members.get(memberName.toUpperCase());
	}

	public ModuleMemberDecl getIteratorMember() {
		return this.iteratorMember;
	}

	public void setDictionaryMember(String memberName) {
		this.dictionaryMember = (ModuleMemberDecl) this.members.get(memberName.toUpperCase());
	}

	public ModuleMemberDecl getDictionaryMember() {
		return this.dictionaryMember;
	}

	public boolean isImplementFrom(ClassModuleDecl classModuleDecl) {
		for (ClassTypeDecl impl : this.implementClasses) {
			if (impl.classModule == classModuleDecl)
				return true;
			else if (impl.classModule.isImplementFrom(classModuleDecl)){
				return true;
			}
		}
		return false;
	}

	public void buildImplements(List<ImplementsStmtContext> referenceAsts) {
		for(ClassTypeDecl impl : implementClasses){
			for(ImplementsStmtContext ast : referenceAsts){
				if(ast.ambiguousIdentifier().getText().equalsIgnoreCase(impl.name)){
					try {
						buildImplements(impl, ast);
					} catch (CompileException e) {
						this.addCompileException(e);
					}
				}
			}
		}
	}
	
	public ClassTypeDecl getImplementorTypeDecl(ClassModuleDecl base){
		return this.implementors.get(base);
	}

	private void buildImplements(ClassTypeDecl implement, ImplementsStmtContext ast) throws CompileException {
		ClassModuleDecl implCls = implement.classModule;
		ImplementorClassModuleDecl implementor = new ImplementorClassModuleDecl(this.library, this.compiler);
		implementor.name = implement.name;
		implementor.visibility = implement.visibility;
		for(VbDecl implDecl : implCls.members.values()){
			if(implDecl.visibility == Visibility.PUBLIC){	// public 成员都需要实现
				String mirrorName = implCls.upperCaseName() + "_" + implDecl.upperCaseName();
				VbDecl myOverrider = this.members.get(mirrorName);
				if(myOverrider == null){
					throw this.newCompileException(ast, CompileException.IMPLEMENT_NOT_FOUND, implDecl.name, implCls.name);
				}
				boolean match = true;
				if(implDecl instanceof VarDecl){
					if(myOverrider instanceof PropertyDecl){
						PropertyDecl pd = (PropertyDecl) myOverrider;
						if(pd.get == null || (pd.let == null && pd.let == null)){
							match = false;
						}
						if(pd.getArguments().size() > 0){
							match = false;
						}
					} else {
						match = false;
					}
				} else if(implDecl instanceof RuleDecl){
					if(myOverrider instanceof RuleDecl == false){
						match = false;
					} else {
						match = Compiler.isArgumentDeclsMatch(((MethodDecl) implDecl).arguments, ((MethodDecl)myOverrider).arguments);
					}
				} else if(implDecl instanceof MethodDecl){
					if(myOverrider instanceof MethodDecl == false  || myOverrider instanceof RuleDecl){
						match = false;
					} else {
						match = Compiler.isArgumentDeclsMatch(((MethodDecl) implDecl).arguments, ((MethodDecl)myOverrider).arguments);
					}
				} else if(implDecl instanceof PropertyDecl){
					if(myOverrider instanceof PropertyDecl == false){
						match = false;
					} else {
						match = Compiler.isArgumentDeclsMatch(((PropertyDecl) implDecl).getArguments(), ((PropertyDecl)myOverrider).getArguments());
					}
				}
				if(!match){
					throw this.newCompileException(ast, CompileException.IMPLEMENT_NOT_MATCH, implDecl.name, implCls.name);
				}
				implementor.members.put(implDecl.upperCaseName(), myOverrider);
				implementor.mirrors.put(implDecl, myOverrider);
			}
		}
		this.implementors.put(implCls, new ClassTypeDecl(library, implementor));
	}
}
