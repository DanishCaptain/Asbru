package com.danishcaptain.asbru.common.application;

public abstract class Application {
	
	public Application() {
		
	}
	
	protected final void init() {
		initApplication();
	}

	protected abstract void initApplication();

	protected final void start() {
		startApplication();
	}

	protected abstract void startApplication();

	protected final void join() {
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
