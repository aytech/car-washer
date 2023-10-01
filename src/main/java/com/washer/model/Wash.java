package com.washer.model;

import java.util.Date;
import java.util.Objects;

public class Wash {
    private Driver driver;
    private Car car;
    private Date date;
    private int price;

    public Wash() {
    }

    public Wash(Driver driver, Car car, Date date, int price) {
        this.driver = driver;
        this.car = car;
        this.date = date;
        this.price = price;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wash wash = (Wash) o;
        return price == wash.price && Objects.equals(driver, wash.driver) && Objects.equals(car, wash.car) && Objects.equals(date, wash.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driver, car, date, price);
    }
}
