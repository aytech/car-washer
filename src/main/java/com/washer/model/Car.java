package com.washer.model;


import jakarta.persistence.*;

import java.util.Objects;

@SuppressWarnings("unused")
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String color;

    @ManyToOne
    @JoinColumn(name = "driver")
    private Driver driver;

    private int production;

    public Car() {
    }

    public Car(int id, String model, String color, Driver driver, int production) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.driver = driver;
        this.production = production;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && production == car.production && Objects.equals(model, car.model)
                && Objects.equals(color, car.color) && Objects.equals(driver, car.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, driver, production);
    }
}
