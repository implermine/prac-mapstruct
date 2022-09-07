package org.example.entity.polymorphism;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car extends Vehicle{

    private String carAttr;

    public Car() {
    }
}
