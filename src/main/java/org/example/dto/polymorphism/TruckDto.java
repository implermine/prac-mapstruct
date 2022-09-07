package org.example.dto.polymorphism;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
//@Setter
@SuperBuilder
public class TruckDto extends VehicleDto{

    private String truckAttr;
}
