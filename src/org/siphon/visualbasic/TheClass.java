package org.siphon.visualbasic;

// VB 类模块中 Class_Initialize 对应的事件源对象
public class TheClass extends ClassModuleDecl {

	public final EventDecl initializeEvent;
	public final EventDecl terminateEvent;

	public TheClass(Library lib, org.siphon.visualbasic.compile.Compiler compiler) {
		super(lib, compiler);
		
		EventDecl initialize = new EventDecl(lib, this);
		initialize.name = "Initialize";
		this.addEvent(null, initialize);
		this.initializeEvent = initialize;
		
		EventDecl terminate = new EventDecl(lib, this);
		terminate.name = "Terminate";
		this.addEvent(null, terminate);
		this.terminateEvent = terminate;
	}

}
