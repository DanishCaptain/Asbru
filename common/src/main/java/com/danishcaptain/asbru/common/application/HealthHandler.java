package com.danishcaptain.asbru.common.application;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public final class HealthHandler implements HttpHandler {

	public String getContextName() {
		return "/health";
	}

	@Override
	public final void handle(HttpExchange arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
