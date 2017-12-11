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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import vba.VbaLexer;
import vba.VbaParser;



public class ShowTree {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		main1(args);
		
		// main2(args);
	}
	
	public static void main1(String[] args) throws FileNotFoundException, IOException {
		//File file = new File("vba/decls.bas");
		//File file = new File("vba/test.vba");
		//File file = new File("vba/Class1.cls");
		//File file = new File("vba/NewMacros.bas");
		//File file = new File("vba/select-case.bas");
		// File file = new File("vba/call.bas");
		
		//File file = new File("vba/test.bas");
		//File file = new File("vba/udt.bas");
		
		//File file = new File("vba/class-test.bas");
		
		//File file = new File("vba/MissingTest/Module1.bas");
		
		// File file = new File("vba/call_test.bas");
		File file = new File("vba/Mid/Module1.bas");
		
		// File file = new File("vba/func-call.bas");
		
		VbaLexer lexer = new VbaLexer(new org.antlr.v4.runtime.ANTLRInputStream(new FileInputStream(file)));
//		CommonTokenStream tokenStream = new CommonTokenStream();
		CommonTokenStream tokenStream  =new CommonTokenStream(lexer);
		VbaParser parser = new VbaParser(tokenStream);
		parser.setBuildParseTree(true);
		ParseTree moduleNode = parser.module();
		ParserRuleContext c = (ParserRuleContext) moduleNode;
		
        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),moduleNode);
        viewr.open();
		
	}
	
//	public static void main2(String[] args) throws FileNotFoundException, IOException {
//		// File file = new File("vba/test.vba");
//		//File file = new File("vba/Class1.cls");
//		File file = new File("vba/NewMacros.bas");
//		VisualBasic6Lexer lexer = new VisualBasic6Lexer(new org.antlr.v4.runtime.ANTLRInputStream(new FileInputStream(file)));
////		CommonTokenStream tokenStream = new CommonTokenStream();
//		CommonTokenStream tokenStream  =new CommonTokenStream(lexer);
//		VisualBasic6Parser parser = new VisualBasic6Parser(tokenStream);
//		parser.setBuildParseTree(true);
//		ParseTree moduleNode = parser.module();
//		ParserRuleContext c = (ParserRuleContext) moduleNode;
//		
//		JFrame frame = new JFrame("Antlr AST");
//        JPanel panel = new JPanel();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(
//                parser.getRuleNames()),moduleNode);
//        viewr.setScale(1.5);//scale a little
//        panel.add(viewr);
//        frame.add(panel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(200,200);
//        frame.setVisible(true);
//		
//	}
}
