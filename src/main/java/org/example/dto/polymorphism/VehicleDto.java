package org.example.dto.polymorphism;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class VehicleDto {

    private Long id;
    private String name;
    private String type; // <- Entity to Dto 할때, DTYPE을 남긴다 생각해보자.
}
