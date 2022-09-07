package org.example.dto.polymorphism;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
//@Setter
@SuperBuilder
public class CarDto extends VehicleDto{


    private String carAttr;
}
