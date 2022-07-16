package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Car {

    private String make;
    private int numberOfSeats;
    private CarType type;

    public static enum CarType{
        HYUNDAI,
        KIA
    }
}
