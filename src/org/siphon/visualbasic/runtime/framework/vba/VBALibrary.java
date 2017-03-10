package org.siphon.visualbasic.runtime.framework.vba;

import org.siphon.visualbasic.EnumDecl;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.VbTypeDecl;
import org.siphon.visualbasic.compile.Compiler;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.siphon.visualbasic.compile.JavaModuleDecl;
import org.siphon.visualbasic.runtime.ErrObject;
import org.siphon.visualbasic.runtime.JavaModuleInstance;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.framework.Enums;


public class VBALibrary extends Library {

	private final VbVarType errorVarType;

	public VBALibrary(Compiler compiler) {
		super("VBA");

		JavaClassModuleDecl errClass = new JavaClassModuleDecl(this, compiler, ErrObject.class);
		this.addModule(errClass);
		this.errorVarType = new VbVarType(VbVarType.vbObject, this.types.get("ERROBJECT"), null, null);

		this.addType(EnumDecl.fromJava(this, VbVarType.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbCalendar.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbIMEStatus.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbStrConv.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbAppWinStyle.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbCallType.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbCompareMethod.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbDateTimeFormat.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbDayOfWeek.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbFileAttribute.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbFirstWeekOfYear.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbMsgBoxResult.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbMsgBoxStyle.class));
		this.addType(EnumDecl.fromJava(this, Enums.VbTriState.class));
		
//		this.addModule(new JavaModuleDecl(this, compiler, Constants.class));
//		this.addModule(new JavaModuleDecl(this, compiler, Conversion.class));
//		this.addModule(new JavaModuleDecl(this, compiler, Math.class));
//		this.addModule(new JavaModuleDecl(this, compiler, DateTime.class));
//		this.addModule(new JavaModuleDecl(this, compiler, Strings.class));
		this.addModule(new JavaModuleDecl(this, compiler, Interaction.class));
		this.addModule(new JavaModuleDecl(this, compiler, Information.class));

		this.addModule(new JavaClassModuleDecl(this, compiler, Collection.class));
	}

	public VbVarType getErrorVarType() {
		return errorVarType;
	}


	
}
