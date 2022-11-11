package org.example.domain.hierarchy.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Second {

    private String name;
    private Third third;
}
