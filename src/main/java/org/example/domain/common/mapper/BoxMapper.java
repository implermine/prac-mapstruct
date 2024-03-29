package org.example.domain.common.mapper;


import org.example.domain.common.Box;
import org.example.domain.common.BoxDto;
import org.mapstruct.*;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING
)
public interface BoxMapper {

    @Mapping(target = "helloImStringListEither", source = "helloImStringList")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT, nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION)
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT) // Box의 List Default Value는...
    /**
     * null 반환을 아예 막는다,
     *
     * 리스트는 default가 null check 이므로, new ArrayList를 builder에 설정해두면 끝날 일
     */
    BoxDto toDto(Box box);

    @Mapping(target = "isbn", source = "innerBox.isbn")
    BoxDto toDto2(Box box);


    @Mapping(target = ".", source = "innerBox ")
    @Mapping(target = "innerBox", source = ".") // gratitude
    BoxDto toDto3(Box box);

    /**
     * 2 depth를 flat하게 1 depth로 뽑을 수 있는가?
     */
    @Mapping(target = "first" , source = "first.second")
    BoxDto toDto4(Box box);


}
