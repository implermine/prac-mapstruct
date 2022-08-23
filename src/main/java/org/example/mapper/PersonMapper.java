package org.example.mapper;

import org.example.dto.PersonDto;
import org.example.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface PersonMapper {


    /**
     * 3.4 Mapping methods with several source parameters
     */
    @Mapping(source = "personDto.nameForDto", target = "name")
    @Mapping(source = "id", target = "id")
    Person dtoToEntity(PersonDto personDto, Long id);

    /**
     * Example 8. Mapper whice defines a custom mapping with a default method
     */
    default String customMappingMethod(){
        return "hello World";
    }
}
