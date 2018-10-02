package com.danishcaptain.asbru.ssp.server;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.danishcaptain.asbru.common.application.Application;
import com.danishcaptain.asbru.common.application.HealthHandler;
import com.danishcaptain.asbru.common.domain.DemandSidePlatform;
import com.danishcaptain.asbru.ssp.server.handlers.BannerHandler;
import com.danishcaptain.asbru.ssp.server.handlers.HeaderBiddingHandler;
import com.danishcaptain.asbru.ssp.server.handlers.NativeHandler;
import com.danishcaptain.asbru.ssp.server.handlers.SupplyBiddingHandler;
import com.danishcaptain.asbru.ssp.server.handlers.VideoHandler;
import com.danishcaptain.asbru.ssp.server.model.AuctionModel;
import com.sun.net.httpserver.HttpServer;

public class SspServer extends Application {

	public SspServer () {
		AuctionModel model = new AuctionModel();

		// init from ssp-services
		DemandSidePlatform dsp = new DemandSidePlatform();
		
		
		SupplyBiddingHandler hbH = new HeaderBiddingHandler("HeaderBidding");
		SupplyBiddingHandler bH = new BannerHandler("Banner");
		SupplyBiddingHandler vH = new VideoHandler("Video");
		SupplyBiddingHandler nH = new NativeHandler("Native");
		HealthHandler health = new HealthHandler();

        try {
			HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
			
	        server.createContext(hbH.getContextName(), hbH);
	        server.createContext(bH.getContextName(), hbH);
	        server.createContext(vH.getContextName(), hbH);
	        server.createContext(nH.getContextName(), hbH);
	        server.createContext(health.getContextName(), health);
	        
	        server.setExecutor(null); // creates a default executor
	        server.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		SspServer server = new SspServer();
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
