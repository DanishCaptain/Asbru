package com.danishcaptain.asbru.common.server;

public abstract class ServiceServer {

	public ServiceServer() {
		
	}
	
	protected final void init() {
		// TODO Auto-generated method stub
		
	}

	protected final void start() {
		// TODO Auto-generated method stub
		
	}

	protected final void join() {
		// TODO Auto-generated method stub
		
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
