package com.danishcaptain.asbru.sim.publisher;

import com.danishcaptain.asbru.common.application.Application;
import com.danishcaptain.asbru.sim.publisher.model.PublisherModel;

public class PublisherSim extends Application {
	
	private PublisherModel model;

	public PublisherSim() {
		model = new PublisherModel();
	}
	
	@Override
	protected void initApplication() {
	}

	@Override
	protected void startApplication() {
	}

	public static void main(String[] args) {
		PublisherSim sim = new PublisherSim();
		sim.init();
		sim.start();
		sim.join();
	}

	/*
static HttpClient getHTTPSClient(final SSLSocketFactory sslSocketFactory,
								 final URL url,
								 final HostnameVerifier hostNameVerifier,
								 final String proxyHost,final int proxyPort,
								 final boolean useCache) throws IOException {
	HttpsClient httpsClient = null;
	if (useCache) {
		httpsClient = (HttpsClient) HttpClient.kac.get(url, sslSocketFactory);
		if (httpsClient != null) {
			httpsClient.cachedHttpClient = true;
		}
	}
	if (httpsClient == null) {
		httpsClient = new HttpsClient(sslSocketFactory,
									  url,
									  proxyHost, proxyPort);
	} else {
		SecurityManager securitymanager = System.getSecurityManager();
		if (securitymanager != null) {
			securitymanager.checkConnect(url.getHost(), url.getPort());
		}
		httpsClient.url = url;
	}
	httpsClient.setHostNameVerifier(hostNameVerifier);
	return httpsClient;
}
	 */
}
