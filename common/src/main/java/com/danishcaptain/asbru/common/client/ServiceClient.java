package com.danishcaptain.asbru.common.client;

public abstract class ServiceClient {
	
	public ServiceClient() {
		
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
