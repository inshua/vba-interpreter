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
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

import org.apache.commons.collections.bag.HashBag;
import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.UnspportedActiveXReferenceException;
import org.siphon.visualbasic.compile.NotFoundException;
import org.siphon.visualbasic.compile.VbErrorsException;
import org.siphon.visualbasic.runtime.ErrObject;
import org.siphon.visualbasic.runtime.VbRuntimeException;

public class Test {
	public static void main(String[] args) throws IOException, UnspportedActiveXReferenceException, VbErrorsException,
			NotFoundException, VbRuntimeException, ParseException, ArgumentException {

		// DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		// System.out.println( LocalDate.parse("22:33:00", formatter));

		// new Interpreter().executeVbProject("vba/Prj1/Prj1.vbp");

		// new Interpreter().executeVbProject("vba/ErrHandle/ErrHandle.vbp");

		// new Interpreter().executeVbProject("vba/ClassTest/ClassTest.vbp");

		// new Interpreter().executeVbProject("vba/EventTest/EventTest.vbp");

		// new Interpreter().executeVbProject("vba/EventTest/EventTest.vbp");

		//new Interpreter().executeVbProject("vba/CallTest/CallTest.vbp");
		
		// new Interpreter().executeVbProject("vba/AddTest/AddTest.vbp");
		
		// new Interpreter().executeVbProject("vba/SubtractTest/SubtractTest.vbp");
		
		// new Interpreter().executeVbProject("vba/MultiTest/MultiTest.vbp");
		
		// new Interpreter().executeVbProject("vba/DivTest/DivTest.vbp");
		
		// new Interpreter().executeVbProject("vba/CurrencyTest/CurrencyTest.vbp");
		
		//new Interpreter().executeVbProject("vba/IDivMod/IDivModTest.vbp");
		
//		new Interpreter().executeVbProject("vba/PosNegTest/PosNegTest.vbp");
		
		// new Interpreter().executeVbProject("vba/LogicOp/LogicOp.vbp");
		
		// new Interpreter().executeVbProject("vba/CompareTest/CompareTest.vbp");
		
//		new Interpreter().executeVbProject("vba/MissingTest/MissingTest.vbp");
		
		//new Interpreter().executeVbProject("vba/CollectionTest/CollectionTest.vbp");
		
		// new Interpreter().executeVbProject("vba/RuleTest/RuleTest.vbp");
		
//		new Interpreter().executeVbProject("vba/RedimTest/RedimTest.vbp");
		
		// new Interpreter().executeVbProject("vba/LikeTest/LikeTest.vbp");
		
		//new Interpreter().executeVbProject("vba/ConstByRef/Test.vbp");
		
		// new Interpreter().executeVbProject("vba/Implements/Test.vbp");
		
		// new Interpreter().executeVbProject("vba/Mid/Test.vbp");
		
		//new Interpreter().executeVbProject("vba/CreateObject/Test.vbp");
		
		//new Interpreter().executeVbProject("vba/Interactive/Test.vbp");
		
		//new Interpreter().executeVbProject("vba/Random/Test.vbp");
		
		// new Interpreter().executeVbProject("vba/FormFromSubMain/Test.vbp");
		// new Interpreter().executeVbProject("vba/FormTwoControls/Test.vbp", "gbk");
		
		// new Interpreter().executeVbProject("vba/ControlArray/Test.vbp", "gbk");
		
		// new Interpreter().executeVbProject("vba/Frame/Test.vbp", "gbk");
		
		new Interpreter().executeVbProject("vba/Calculator/Calc.vbp", "gbk");
	}

}
