package com.danishcaptain.asbru.support.resources;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.danishcaptain.asbru.common.application.Application;
import com.danishcaptain.asbru.common.application.HealthHandler;
import com.danishcaptain.asbru.support.resources.handlers.CookieSyncHandler;
import com.danishcaptain.asbru.support.resources.model.ResourcesModel;
import com.sun.net.httpserver.HttpServer;

public class ResourcesSyncServer extends Application {

	private HttpServer server;

	public ResourcesSyncServer () {
		ResourcesModel model = new ResourcesModel();
	}
	
	@Override
	protected void initApplication() {
        try {
    		CookieSyncHandler csH = new CookieSyncHandler("CookieSync");
    		HealthHandler health = new HealthHandler();
    		
			server = HttpServer.create(new InetSocketAddress(8000), 0);
			
	        server.createContext(csH.getContextName(), csH);
	        server.createContext(health.getContextName(), health);
	        
	        server.setExecutor(null); // creates a default executor
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void startApplication() {
        server.start();
	}
	
	public static void main(String[] args) {
		ResourcesSyncServer server = new ResourcesSyncServer();
		server.init();
		server.start();
		server.join();
	}
	/*
public class Test {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = "This is the response";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

}	 */

}
