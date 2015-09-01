package com.mkyong.user;

import com.mkyong.properties.AppPropeetiesImpl;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.log4j.Logger;
public class SimplePage extends WebPage {

	Logger logger = Logger.getLogger(SimplePage.class);

	@SpringBean
	private HelloService helloService;
	
	public SimplePage(final PageParameters parameters) {
		logger.info("SimplePage");
		add(new Label("msg", helloService.getHelloWorldMsg()));
		add(new Label("appname", AppPropeetiesImpl.appName));
		add(new Label("ver", AppPropeetiesImpl.version));
		AppPropeetiesImpl.appName = "CHange nowa nazwa";
		add(new Label("appname2", AppPropeetiesImpl.appName));
	}

}
