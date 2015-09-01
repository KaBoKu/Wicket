package com.mkyong.servletContex;

/**
 * Created by Bolo on 2015-09-01.
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.mkyong.properties.AppPropeetiesImpl;
import org.apache.log4j.Logger;

@WebListener
public class InitServlet implements ServletContextListener{
    Logger logger = Logger.getLogger(InitServlet.class);
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("Context INIT");
        new AppPropeetiesImpl().loadProperties();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("Context Destroy");
    }
}
