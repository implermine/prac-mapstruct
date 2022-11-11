package org.example.domain.hierarchy.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FirstDto {

    private String name;
    private SecondDto second;
}
