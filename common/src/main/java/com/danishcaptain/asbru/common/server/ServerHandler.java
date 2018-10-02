package com.danishcaptain.asbru.common.server;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public abstract class ServerHandler implements HttpHandler {

	private String contextName;

	public ServerHandler(String contextName) {
		this.contextName = contextName;
	}
	
	public final String getContextName() {
		return contextName;
	}

	@Override
	public final void handle(HttpExchange ex) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
