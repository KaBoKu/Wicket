package com.mkyong.properties;

/**
 * Created by Bolo on 2015-09-01.
 */
public interface AppProperties {
    String getProperties(String key);
    void loadProperties();

}
