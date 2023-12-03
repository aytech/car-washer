package com.washer.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@SuppressWarnings("unused")
@Entity
public class Wash {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "car")
    private Car car;

    private Date wash_date;
    private int price;

    public Wash() {
    }

    public Wash(Car car, Date wash_date, int price) {
        this.car = car;
        this.wash_date = wash_date;
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getWash_date() {
        return wash_date;
    }

    public void setWash_date(Date wash_date) {
        this.wash_date = wash_date;
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
        return price == wash.price && Objects.equals(car, wash.car) && Objects.equals(wash_date, wash.wash_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, wash_date, price);
    }
}
