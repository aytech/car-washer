package com.washer.configuration;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WasherConfiguration {

    private final WasherProperties washerProperties;

    @Autowired
    public WasherConfiguration(WasherProperties washerProperties) {
        this.washerProperties = washerProperties;
    }

    @PostConstruct
    public void init() {
        System.out.println("Load test data: " + washerProperties.getLoadTestData());
    }
}
