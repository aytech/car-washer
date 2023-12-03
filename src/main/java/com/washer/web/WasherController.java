package com.washer.web;

import com.washer.dao.jpa.WasherRepository;
import com.washer.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/washer")
public class WasherController {

    private final WasherRepository repository;

    public WasherController(WasherRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/cars")
    public List<Car> getCars() {
        return repository.getCars();
    }

    @RequestMapping(value = "/cache-bust")
    public ModelAndView cacheBustingTest() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("cache-bust");

        return modelAndView;
    }

    @RequestMapping(value = "/cars/{id}")
    public ResponseEntity<Car> getCar(@PathVariable(value = "id") int id) {
        return ResponseEntity.ok(repository.getCar(id));
    }
}
