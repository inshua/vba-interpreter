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

		// new Interpreter().executeVbProject("vba\\Prj1\\Prj1.vbp");

		// new Interpreter().executeVbProject("vba\\ErrHandle\\ErrHandle.vbp");

		// new Interpreter().executeVbProject("vba\\ClassTest\\ClassTest.vbp");

		// new Interpreter().executeVbProject("vba\\EventTest\\EventTest.vbp");

		// new Interpreter().executeVbProject("vba\\EventTest\\EventTest.vbp");

		//new Interpreter().executeVbProject("vba\\CallTest\\CallTest.vbp");
		
		// new Interpreter().executeVbProject("vba\\AddTest\\AddTest.vbp");
		
		// new Interpreter().executeVbProject("vba\\SubtractTest\\SubtractTest.vbp");
		
		// new Interpreter().executeVbProject("vba\\MultiTest\\MultiTest.vbp");
		
		// new Interpreter().executeVbProject("vba\\DivTest\\DivTest.vbp");
		
		// new Interpreter().executeVbProject("vba\\CurrencyTest\\CurrencyTest.vbp");
		
		//new Interpreter().executeVbProject("vba\\IDivMod\\IDivModTest.vbp");
		
//		new Interpreter().executeVbProject("vba\\PosNegTest\\PosNegTest.vbp");
		
		// new Interpreter().executeVbProject("vba\\LogicOp\\LogicOp.vbp");
		
		// new Interpreter().executeVbProject("vba\\CompareTest\\CompareTest.vbp");
		
//		new Interpreter().executeVbProject("vba\\MissingTest\\MissingTest.vbp");
		
		//new Interpreter().executeVbProject("vba\\CollectionTest\\CollectionTest.vbp");
		
		// new Interpreter().executeVbProject("vba\\RuleTest\\RuleTest.vbp");
		
//		new Interpreter().executeVbProject("vba\\RedimTest\\RedimTest.vbp");
		
		// new Interpreter().executeVbProject("vba\\LikeTest\\LikeTest.vbp");
		
		//new Interpreter().executeVbProject("vba\\ConstByRef\\Test.vbp");
		
		// new Interpreter().executeVbProject("vba\\Implements\\Test.vbp");
		
		// new Interpreter().executeVbProject("vba\\Mid\\Test.vbp");
		
		//new Interpreter().executeVbProject("vba\\CreateObject\\Test.vbp");
		
		new Interpreter().executeVbProject("vba\\Interactive\\Test.vbp");
	}

}
