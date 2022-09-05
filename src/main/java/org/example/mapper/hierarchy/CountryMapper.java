package org.example.mapper.hierarchy;

import org.example.dto.hierarchy.CountryDto;
import org.example.entity.hierarchy.Country;
import org.example.entity.hierarchy.CountryFlat;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CountryMapper {

    CountryDto toDto(Country entity);

    @Mapping(target = "name", source = "countryAttribute.name")
    @Mapping(target = ".", source = "countryAttribute")
    CountryFlat toFlat(Country entity);

    /**
     * The generated code of the updateCountryFromCountryDto() method will update the passed Country instace with the
     * properties from the given CountryDto object;
     */
    @Mapping(target = "isbn", source = "isbn2")
    void updateCountryFromCountryDto(CountryDto dto, @MappingTarget Country country); // name doesn't matter
}
