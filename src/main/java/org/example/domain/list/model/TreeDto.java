package org.example.domain.list.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TreeDto {

    private List<LeafDto> leafs;
}
