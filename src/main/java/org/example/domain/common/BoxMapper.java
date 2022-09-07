package org.example.domain.common;


import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BoxMapper {

    @Mapping(target = "helloImStringListEither", source = "helloImStringList")
    @BeanMapping(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT) // Box의 List Default Value는...
    /**
     * null 반환을 아예 막는다,
     *
     * 리스트는 default가 null check 이므로, new ArrayList를 builder에 설정해두면 끝날 일
     */
    BoxDto toDto(Box box);
}
