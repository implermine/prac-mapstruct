package org.example.domain._default.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TreeDto {

    private List<LeafDto> leafs;
    private List<LeafDto> otherLeafs;
    private TreeDto someOtherTree;
}
