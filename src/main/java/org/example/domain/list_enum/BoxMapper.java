package org.example.domain.list_enum;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BoxMapper {

    @Mapping(target = "helloImStringListEither", source = "helloImStringList")
    BoxDto toDto(Box box);
}
