package com.danishcaptain.asbru.sim.publisher.model;

import com.danishcaptain.asbru.common.domain.BannerSlot;
import com.danishcaptain.asbru.common.domain.HtmlPage;
import com.danishcaptain.asbru.common.domain.SupplySidePlatform;
import com.danishcaptain.asbru.common.domain.User;

public class PublisherModel {
	public PublisherModel() {
		HtmlPage page = new HtmlPage("page1", "url");
		BannerSlot slot1 = page.createBannerSlot("ad1");
		SupplySidePlatform ssp1 = new SupplySidePlatform();
		User user = new User();
	}

}
