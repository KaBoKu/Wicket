package com.mkyong.properties;

import org.apache.log4j.Logger;

/**
 * Created by Bolo on 2015-09-01.
 */
public class AppPropeetiesImpl implements AppProperties{

    Logger logger = Logger.getLogger(AppPropeetiesImpl.class);

    public static String appName;
    public static String version;
    @Override
    public String getProperties(String key) {
        return null;
    }

    @Override
    public void loadProperties() {
        logger.info("Begin loading properties");
        logger.info("Appname: "+appName);
        logger.info("Version: "+version);
        appName = "My wypasiona app";
        version = "10.00.02A";
        logger.info("Appname: "+appName);
        logger.info("Version: "+version);
    }
}
