package org.example.domain.polymorphism.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class Dog extends Animal{

    private Integer barkVolume;
}
