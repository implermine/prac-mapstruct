package org.example.mapper.polymorphism;

import org.example.dto.polymorphism.VehicleWrapperDto;
import org.example.entity.polymorphism.VehicleWrapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * Polymorphism Mapper
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {VehicleMapper.class}
)
public interface VehicleWrapperMapper {

    VehicleWrapperDto toDto(VehicleWrapper entity);
}
