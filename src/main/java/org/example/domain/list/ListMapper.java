package org.example.domain.list;

import org.example.domain.list.model.Leaf;
import org.example.domain.list.model.Tree;
import org.example.domain.list.model.TreeDto;
import org.mapstruct.*;

import java.util.Collections;
import java.util.List;

@Mapper
public interface ListMapper {

    default List<Leaf> toList(Tree tree){
        if(tree==null){
            return Collections.<Leaf>emptyList();
        }

        return tree.getLeafs();
    }

    @Mapping(target = "leafs", source = "leafs")
    @IterableMapping(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
    TreeDto toDto(Tree tree);
}
