package org.example.mapper.polymorphism;

import org.example.dto.polymorphism.CarDto;
import org.example.entity.polymorphism.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CarMapper {

    @Mapping(target = "type", constant = "CAR")
    CarDto extraOrdinaryMappingMethod(Car someParameter);


}
