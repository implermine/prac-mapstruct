package org.example.domain.polymorphism.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CatDto extends AnimalDto{

    private Integer meowCount;
}
