package com.washer;

import com.washer.model.Car;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;
import java.util.List;
import java.util.Objects;

public class WasherControllerTest {
    private RestTemplate restTemplate;

    private final String uriBase = "http://localhost:8081";

    @Before
    public void init() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void getCarsTest() {
        List<Car> cars = exchangeAsCarList(new ParameterizedTypeReference<>() {
        });
        System.out.println("Size of the car list: " + cars.size());
    }

    @Test
    public void getCarTest() throws NullPointerException {
        Car car = restTemplate.getForObject(uriBase + "/washer/cars/0", Car.class);
        assert car != null;
        System.out.println("Car model is: " + car.getModel());

        ResponseEntity<Car> rCar = restTemplate.getForEntity(uriBase + "/washer/cars/1", Car.class);
        System.out.println(MessageFormat.format("Car model is: {0}", Objects.requireNonNull(rCar.getBody()).getModel()));
        System.out.println(MessageFormat.format("Status code is: {0}", rCar.getStatusCode()));
    }

    private <T> List<T> exchangeAsCarList(ParameterizedTypeReference<List<T>> responseType) {
        return restTemplate.exchange(uriBase + "/washer/cars", HttpMethod.GET, null, responseType).getBody();
    }
}
