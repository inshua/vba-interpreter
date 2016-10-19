package org.siphon.visualbasic.runtime;

import org.siphon.visualbasic.EventDecl;
import org.siphon.visualbasic.MethodDecl;

public class EventSubscriber {

	private ModuleInstance subscriber;
	private MethodDecl listener;
	private EventDecl eventDecl;

	public EventSubscriber(ModuleInstance subscriber, EventDecl eventDecl, MethodDecl listener) {
		this.subscriber = subscriber;
		this.eventDecl = eventDecl;
		this.listener = listener;
	}
	
	public ModuleInstance getSubscriber() {
		return subscriber;
	}

	public MethodDecl getListener() {
		return listener;
	}

	public EventDecl getEventDecl() {
		return eventDecl;
	}

}
