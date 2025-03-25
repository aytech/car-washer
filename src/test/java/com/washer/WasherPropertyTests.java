package com.washer;

import com.washer.configuration.WasherConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(properties = {"spring.profiles.active=dev"})
@RunWith(SpringRunner.class)
public class WasherPropertyTests {

    @Autowired
    private WasherConfiguration configuration;

    public WasherPropertyTests() {
    }

    @Test
    public void getPropertyTest() {
        System.out.println("Load test data: " + configuration);
    }
}
