package org.example.manual._3_.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto {
    private String manufacturer;
    private String seatCount;
    private String price;

    private String a; // @BeanMapping에 의해 implicit 하게 매핑되지 않아야 하는 값.
}
