package org.example.mapper.hierarchy;

import org.example.dto.hierarchy.CountryDto;
import org.example.entity.hierarchy.Country;
import org.example.entity.hierarchy.CountryFlat;
import org.mapstruct.*;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CountryMapper {

    /**
     * If no such method was found MapStruct will try to generate
     * an automatic sub-mapping method that will do the mapping
     * between the source and target attributes.
     * 다시말해, CountryAttribute는 위 구문에 의해 mapping 된다.
     */
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
