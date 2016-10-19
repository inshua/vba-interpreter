package org.siphon.visualbasic.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.antlr.v4.parse.ANTLRParser.exceptionGroup_return;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.compile.Compiler;

public class Debugger {

	private Interpreter interpreter;
	private boolean debugging;
	private Compiler compiler;

	public Debugger(Interpreter interpreter) {
		this.interpreter = interpreter;
	}

	public void stop() {
		debugging = true;
		startDebugger();
		synchronized (interpreter) {
			try {
				interpreter.wait();
			} catch (InterruptedException e) {
			}
		}
	}

	private void startDebugger() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (debugging) {
					printCurrentFrame();
					System.out.print("DEBUG > ");
					//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					Scanner scanner = new Scanner(System.in);
					String line = scanner.nextLine();
					try{
						processCommand(line);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}, "VBA Debugger").start();
	}

	protected void printCurrentFrame() {
		List<CallFrame> frames = interpreter.getCallFrames();
		CallFrame frame = frames.get(frames.size() -1);
		System.out.println(frame.method);
		System.out.println(String.format("* %s\t%s", frame.statementIndex , frame.method.statements.get(frame.statementIndex)));
	}

	private void processCommand(String line) throws Exception{
		line = line.trim().toLowerCase();
		if (StringUtils.isEmpty(line) || line.equals("help")) {
			System.out.println("stack\t\t-\tShow Call Stack");
			System.out.println("local i\t\t-\tShow Local Variable of Frame i");
			System.out.println("goto i\t\t-\tGoto Statement of Current Frame");
			System.out.println("resume\t\t-\tResume");
			System.out.println("step over\t-\tStep Next Statement");
			System.out.println("step in\t\t-\tStep In Next Call");
			System.out.println("step out\t-\tStep Until Exit Procedure");
			System.out.println("eval\t\t-\tEval Expression");
		} else {
			String[] arr = line.split("\\s+");
			String command = arr[0];
			if (command.equals("local")) {
				List<CallFrame> frames = interpreter.getCallFrames();
				int i = 0;
				if (arr.length > 1) i = Integer.parseInt(arr[1]);
				i = arr.length - 1 - i;
				CallFrame frame = frames.get(i);
				Map<VarDecl, VbVariable> vars = frame.getVariables();
				for (VarDecl decl : vars.keySet()) {
					System.out.println(String.format("%s\t\t= %s", decl.name, vars.get(decl).value));
				}
			} else if (command.equals("resume")) {
				resume();
			} else if(command.equals("step")){
				String action = "in";
				if(arr.length>1) action = arr[1];
				if("in".equals(action)){
					interpreter.setDebuggerAction(DebuggerAction.STEP_INTO);
				} else if("over".equals(action)){
					interpreter.setDebuggerAction(DebuggerAction.STEP_OVER);
				} else {
					interpreter.setDebuggerAction(DebuggerAction.STEP_RETURN);
				}
				resume();
			} else if(command.equals("stack")){
				List<CallFrame> frames = interpreter.getCallFrames();
				for(int i=frames.size() -1; i>=0; i--){
					System.out.println(frames.get(i));
					System.out.println("--");
				}
			} else if(command.equals("goto")){
				int i = 0;
				if (arr.length > 1) i = Integer.parseInt(arr[1]);
				CallFrame frame = interpreter.getCurrentFrame();
				if(i < 0 || i >= frame.method.statements.size()){
					System.out.println(String.format("Please input number between 0 and %s", frame.method.statements.size()-1));
				} else {
					frame.nextStatement = i;
					resume();
				}
			} else if(command.equals("eval")){
				CallFrame frame = interpreter.getCurrentFrame();
				String expr = line.substring(4).trim();
				if(StringUtils.isEmpty(expr)){
					System.out.println("Empty Statement");
				} else {
					Statement statement = compiler.compileExpression(expr,frame.method, frame.module);
					VbValue value = statement.eval(interpreter, frame);
					if(value != null){
						System.out.println(value);
					} else {
						System.out.println("Applied");
					}
				}
			}
		}
	}

	public void resume() {
		debugging = false;
		synchronized (interpreter) {
			interpreter.notify();
		}
	}

	public void setCompiler(Compiler compiler) {
		this.compiler = compiler;
	}
}
