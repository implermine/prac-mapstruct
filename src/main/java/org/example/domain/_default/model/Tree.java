package org.example.domain._default.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Tree {
    private List<Leaf> leafs;
    private List<Leaf> otherLeafs;
}
