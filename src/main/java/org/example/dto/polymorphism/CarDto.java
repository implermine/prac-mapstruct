package org.example.dto.polymorphism;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto extends VehicleDto{


    private String carAttr;
}
