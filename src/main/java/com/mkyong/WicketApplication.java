package com.mkyong;

import org.apache.log4j.Logger;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import com.mkyong.user.SimplePage;

public class WicketApplication extends WebApplication {

	private static final Logger logger = Logger.getLogger(WebApplication.class);

	@Override
	public Class<SimplePage> getHomePage() {
		logger.info("getHomePage");
		return SimplePage.class; // return default page
	}
	
	@Override
	protected void init() {
		logger.info("init");
		super.init();
		addComponentInstantiationListener(new SpringComponentInjector(this));
		 
	}

}
