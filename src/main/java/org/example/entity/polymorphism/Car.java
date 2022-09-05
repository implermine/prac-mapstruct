package org.example.entity.polymorphism;


public class Car extends Vehicle{

    private String carAttr;

    public String getCarAttr() {
        return carAttr;
    }

    public void setCarAttr(String carAttr) {
        this.carAttr = carAttr;
    }

    public Car() {
    }
}
