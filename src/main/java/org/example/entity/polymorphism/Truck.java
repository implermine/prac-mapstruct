package org.example.entity.polymorphism;

public class Truck extends Vehicle{

    private String truckAttr;

    public String getTruckAttr() {
        return truckAttr;
    }

    public void setTruckAttr(String truckAttr) {
        this.truckAttr = truckAttr;
    }

    public Truck() {
    }
}
