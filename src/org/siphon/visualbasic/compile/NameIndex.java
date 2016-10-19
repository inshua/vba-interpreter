package org.siphon.visualbasic.compile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.ConstDecl;
import org.siphon.visualbasic.EnumDecl;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.ModuleMemberDecl;
import org.siphon.visualbasic.UdtDecl;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.VbDecl;
import org.siphon.visualbasic.VbTypeDecl;
import org.siphon.visualbasic.Visibility;
import org.siphon.visualbasic.runtime.VbVariable;

/*
 * 对所有可引用成员（类型、常量、函数）列出所有可能的名字。不分是不是 public 都建立索引。
 * 对于模块，列出
 * 	Name
 * 	Lib.Name
 * 模块级函数常量变量，列出如下命名：
 * 	Lib.Module.Name
 * 	Module.Name
 * 	Name
 * 枚举，列出如下命名：
 * 	Name
 * 	Lib.Name
 * 	Const
 *  Name.Const
 *  Lib.Const
 *  Lib.Name.Const
 * UDT，列出如下命名：
 * 	Name
 * 	Lib.Name
 * 
 */
public class NameIndex {

	public Map<String, List<VbDecl>> indexes = new HashMap<>();

	public void addDecl(VbDecl decl) {
		if (decl instanceof Library) {
			append(decl, decl.upperCaseName());

		} else if (decl instanceof ClassTypeDecl) {
			/*
			 * VB 里 MODULE 仅能用于本项目，DLL LIB中只有 Class 可以导出。
			 * 其中，
			 * Instancing = GlobalMultiUse 的会在进程空间创建一个全局实例，导出 Class, Member, Lib.Member, Lib.Class，不包括 Class.Member，但支持 New 和 instance.Member
			 * Instancing = PublicNotCreatable, 适合存放常量、UDT等导出符号，名字以 Name, Lib.Name 导出，不包括 Lib.Class.Name，这种类在类型库可见，但是不能 New
			 * Instancing = Private
			 * Instancing = MultiUse
			 * */
			// TODO
			ClassTypeDecl c = (ClassTypeDecl) decl;
			append(c, c.upperCaseName());
			append(c, c.library.upperCaseName() + "." + c.upperCaseName());
			
		} else if (decl instanceof ModuleDecl) {
			append(decl, decl.upperCaseName());
			append(decl, ((ModuleDecl) decl).library.upperCaseName() + "." + decl.upperCaseName());
			for (VbDecl member : ((ModuleDecl) decl).members.values()) {
				this.addDecl(member);
			}

		} else if (decl instanceof MethodDecl) {	// 含 RuleDecl
			MethodDecl m = (MethodDecl) decl;
			append(m, m.upperCaseName());
			append(m, m.module.upperCaseName() + "." + decl.upperCaseName());
			append(m, m.library.upperCaseName() + "." + m.module.upperCaseName() + "." + decl.upperCaseName());

		} else if (decl instanceof VarDecl) { // 含 ConstDecl
			VarDecl v = (VarDecl) decl;
			append(v, v.upperCaseName());
			if(v.module != null) append(v, v.module.upperCaseName() + "." + v.upperCaseName());
			if(v.library != null && v.module != null) append(v, v.library.upperCaseName() + "." + v.module.upperCaseName() + "." + v.upperCaseName());

		} else if (decl instanceof EnumDecl) {
			EnumDecl e = (EnumDecl) decl;
			append(e, e.upperCaseName());
			append(e, e.library.upperCaseName() + "." + e.upperCaseName());

			for (ConstDecl c : e.constDecls) {
				append(c, c.upperCaseName());

				append(c, e.upperCaseName() + "." + c.upperCaseName());
				append(c, c.library.upperCaseName() + "." + e.upperCaseName() + "." + c.upperCaseName());
			}
		} else if(decl instanceof UdtDecl){
			append(decl, decl.upperCaseName());
			append(decl, decl.library.upperCaseName() + "." + decl.upperCaseName());
		}
	}
	
	private void append(VbDecl decl, String name) {
		List<VbDecl> ls = indexes.get(name);
		if (ls == null) {
			indexes.put(name,ls = new ArrayList<>());
		}
		ls.add(decl);
	}

	public Library findLibrary(String name) {
		List<VbDecl> l = indexes.get(name);
		if (l != null) {
			for (VbDecl vbDecl : l) {
				if (vbDecl instanceof Library)
					return (Library) vbDecl;
			}
		}
		return null;
	}

	public ConstDecl findAccessibleConst(String constName, Library library) throws AmbiguousIdentifierException, NotMatchException, NotFoundException {
		ConstDecl result = null;
		List<VbDecl> l = indexes.get(constName.toUpperCase());
		if (l != null) {
			for (VbDecl vbDecl : l) {
				if (vbDecl.library == library || vbDecl.visibility == Visibility.PUBLIC) {
					if (vbDecl instanceof ConstDecl) {
						if(vbDecl.library == library){	// 本工程优先
							return (ConstDecl) vbDecl;
						}
						ConstDecl c = (ConstDecl) vbDecl;
						if (result != null) {
							throw new AmbiguousIdentifierException();
						} else {
							result = c;
						}
					} else {
						throw new NotMatchException();
					}
				}
			}
		}
		if(result == null) throw new NotFoundException();
		return result;
	}

	public VbTypeDecl findAccessibleType(String complexName, Library library) throws AmbiguousIdentifierException, NotMatchException, NotFoundException {
		VbTypeDecl result = null;
		List<VbDecl> l = indexes.get(complexName.toUpperCase());
		if (l != null) {
			for (VbDecl vbDecl : l) {
				if (vbDecl.library == library || vbDecl.visibility == Visibility.PUBLIC) {
					if (vbDecl instanceof VbTypeDecl) {
						if(vbDecl.library == library){	// 本工程优先
							return (VbTypeDecl) vbDecl;
						}
						VbTypeDecl t = (VbTypeDecl) vbDecl;
						if (result != null) {
							throw new AmbiguousIdentifierException();
						} else {
							result = t;
						}
					} else {
						throw new NotMatchException();
					}
				}
			}
		}
		if(result == null) throw new NotFoundException();
		return result;
	}

	public VarDecl findAccessibleVar(String varName, ModuleDecl module, Library library, boolean includeConst) throws AmbiguousIdentifierException, NotMatchException, NotFoundException {
		return (VarDecl)this.findAccessibleMemberDecl(varName, module, library, includeConst, VarDecl.class);
	}
	public ModuleMemberDecl findAccessibleMemberDecl(String varName, ModuleDecl module, Library library, boolean includeConst, Class<? extends ModuleMemberDecl> declType) throws AmbiguousIdentifierException, NotMatchException, NotFoundException {
		if(varName.equals("SQR")){
			System.out.println();
		}
		ModuleMemberDecl result = null;
		ModuleMemberDecl sameModuleResult= null;
		ModuleMemberDecl sameLibResult = null;
		VbDecl maybe = null;
		List<VbDecl> l = indexes.get(varName.toUpperCase());
		if (l != null) {
			for (VbDecl vbDecl : l) {
				if (vbDecl.library == library || vbDecl.visibility == Visibility.PUBLIC) {
					if (declType.isInstance(vbDecl) && (!includeConst || vbDecl instanceof ConstDecl == false)) {
						ModuleMemberDecl v = (ModuleMemberDecl) vbDecl;
						if(v.module == module){
							if(sameModuleResult != null){
								sameModuleResult = ModuleMemberDecl.AMBIGUOUS;
							}
							sameModuleResult = v;
						} else if(vbDecl.library == library){	// 本工程优先
							if(sameLibResult != null){
								sameLibResult  = ModuleMemberDecl.AMBIGUOUS;
							} 
							sameLibResult = (ModuleMemberDecl) vbDecl;
						} else {
							if (result != null) {
								result = ModuleMemberDecl.AMBIGUOUS;
							} else {
								result = v;
							}
						}
					} else {
						maybe = vbDecl;
					}
				} else {
					maybe = vbDecl;
				}
			}
		}
		if(sameModuleResult != null) {
			if(sameModuleResult == VbDecl.AMBIGUOUS) throw new AmbiguousIdentifierException();
			return sameModuleResult;
		}
		if(sameLibResult != null){
			if(sameLibResult == VbDecl.AMBIGUOUS) throw new AmbiguousIdentifierException();
			return sameLibResult;
		} 
		if(result == VbDecl.AMBIGUOUS) throw new AmbiguousIdentifierException();
		if(result == null){
			if(maybe != null) {
				throw new NotMatchException();
			} else {
				throw new NotFoundException();
			}
		}		
		return result;
	}

	public VbDecl[] findAccessibleDecls(String complexName, Library library) {
		List<VbDecl> result = new ArrayList<>();
		List<VbDecl> l = indexes.get(complexName.toUpperCase());
		if (l != null) {
			for (VbDecl vbDecl : l) {
				if (vbDecl.library == library || vbDecl.visibility == Visibility.PUBLIC) {
					if (vbDecl instanceof VbDecl) {
						result.add(vbDecl);
						if(vbDecl.library == library){	// 本工程优先
							break;
						}
					}
				}
			}
		}
		return (VbDecl[]) result.toArray(new VbDecl[result.size()]);
	}

}
