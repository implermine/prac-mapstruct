package org.example.mapper.hierarchy;

import org.example.dto.hierarchy.CountryDto;
import org.example.entity.hierarchy.Country;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CountryMapper {

    CountryDto toDto(Country entity);
}
