package org.example.domain._default;

import org.example.domain._default.model.*;
import org.mapstruct.*;

import java.util.List;

@Mapper
public interface DefaultMapper {

    @Mapping(target = "name", source = "name", defaultExpression = "java(new String(\"hi\"))")
    BookDto toDto(Book entity);

    @Mapping(target = "leafs", source = "leafs", qualifiedByName = {"please"})
    @Mapping(target = "someOtherTree.leafs", source = "someOtherTree.leafs", qualifiedByName = {"please"})
    TreeDto toDto2(Tree tree);

    @Named("please")
    @IterableMapping(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
    List<LeafDto> pleasureLine(List<Leaf> leafs);



}
