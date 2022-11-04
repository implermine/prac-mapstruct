package org.example.manual._3_.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String make;
    private String numberOfSeats;
    private Integer price;

    private String a; // @BeanMapping에 의해 implicit하게 매핑되지 않아야 하는 값.
}
