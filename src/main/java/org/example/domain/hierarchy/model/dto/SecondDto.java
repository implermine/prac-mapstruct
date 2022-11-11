package org.example.domain.hierarchy.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SecondDto {

    private String name;
    private ThirdDto third;
}
