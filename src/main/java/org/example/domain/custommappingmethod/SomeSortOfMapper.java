package org.example.domain.custommappingmethod;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SomeSortOfMapper {

    SomeSortOfMapper INSTANCE = Mappers.getMapper( SomeSortOfMapper.class );


    /**
     * custom mapping을 통해, square의 너비를 계산하여 SquareInfo에 넣기
     */
    @Mapping(target = "area", source = "from", qualifiedByName = {"harryPotter"}) // source를 ambiguous하게 전체로 잡는다
    SquareInfo toInfo(Square from);


    @Named("harryPotter")
    default Integer someSortOfMappingMethod(Square notFrom){
        return notFrom.getHeight() * notFrom.getWidth();
    }
}
