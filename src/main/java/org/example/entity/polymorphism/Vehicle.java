package org.example.entity.polymorphism;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Vehicle {

    private Long id;
    private String name;

    public Vehicle(){

    }
}
