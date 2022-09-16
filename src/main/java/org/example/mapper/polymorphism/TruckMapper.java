package org.example.mapper.polymorphism;

import org.example.dto.polymorphism.TruckDto;
import org.example.entity.polymorphism.Truck;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TruckMapper {

    @Mapping(target = "type", constant = "TRUCK")
    TruckDto someMethod(Truck some);
}
