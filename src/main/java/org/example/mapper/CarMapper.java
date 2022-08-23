package org.example.mapper;

import org.example.dto.CarDto;
import org.example.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


/**
 * Generated Code가 생성된다.
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "numberOfSeats", target = "seatCount")
//    @Mapping(source = "make" , target = "make", ignore = true)
//    @Mapping(target = "", source = "id", ignore = true)
    CarDto carToCarDto(Car car);

}
