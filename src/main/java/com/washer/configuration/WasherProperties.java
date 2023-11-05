package com.washer.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "washer")
public class WasherProperties {

    private String loadTestData = "no";

    public String getLoadTestData() {
        return loadTestData;
    }

    public void setLoadTestData(String loadTestData) {
        this.loadTestData = loadTestData;
    }
}
