package org.example.domain.list;

import org.example.domain.list.model.Leaf;
import org.example.domain.list.model.Tree;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

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
}
