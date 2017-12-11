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
		this.addModule(new JavaModuleDecl(this, compiler, Conversion.class));
//		this.addModule(new JavaModuleDecl(this, compiler, Math.class));
		this.addModule(new JavaModuleDecl(this, compiler, DateTime.class));
//		this.addModule(new JavaModuleDecl(this, compiler, Strings.class));
		this.addModule(new JavaModuleDecl(this, compiler, Interaction.class));
		this.addModule(new JavaModuleDecl(this, compiler, Information.class));

		this.addModule(new JavaClassModuleDecl(this, compiler, Collection.class));
	}

	public VbVarType getErrorVarType() {
		return errorVarType;
	}


	
}
