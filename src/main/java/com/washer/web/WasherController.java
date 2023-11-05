package com.washer.web;

import com.washer.model.Car;
import com.washer.model.Driver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/washer")
public class WasherController {

    @RequestMapping(value = "/cars")
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        Driver driver1 = new Driver(1, "John", "Smith", "Phone 1", "Address 1");
        Driver driver2 = new Driver(2, "John", "Carter", "Phone 2", "Address 2");
        Driver driver3 = new Driver(3, "Walter", "White", "Phone 3", "Address 3");

        Car car1 = new Car(1, "Fiat", "Red", driver1, 2018);
        Car car2 = new Car(2, "Opel", "Blue", driver2, 2019);
        Car car3 = new Car(3, "Citroen", "Gray", driver3, 2020);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        return cars;
    }

    @RequestMapping(value = "/cache-bust")
    public ModelAndView cacheBustingTest() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("cache-bust");

        return modelAndView;
    }
}
