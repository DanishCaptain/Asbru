package com.danishcaptain.asbru.common.domain;

public class HtmlPage {

	public HtmlPage(String id, String url) {
	}

	public BannerSlot createBannerSlot(String name) {
		BannerSlot slot = new BannerSlot(name);
		return slot;
	}

}
