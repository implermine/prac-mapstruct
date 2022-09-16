package org.example.domain.polymorphism.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Cat extends Animal{

    private Integer meowCount;
}
