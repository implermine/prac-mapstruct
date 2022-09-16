package org.example.domain.polymorphism.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnimalWrapper {

    private Animal animal;
    private String chore;
}
