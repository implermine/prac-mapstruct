package org.example.dto.polymorphism;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@NoArgsConstructor
//@Setter
@SuperBuilder
public abstract class VehicleDto {

    private Long id;
    private String name;
    private String type; // <- Entity to Dto 할때, DTYPE을 남긴다 생각해보자.
    private String pleaseIgnoreMe;
}
