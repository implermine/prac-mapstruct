package org.example.dto.polymorphism;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TruckDto extends VehicleDto{

    private String truckAttr;
}
