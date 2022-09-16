package org.example.domain.polymorphism.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class AnimalDto {

    private String type; // 생성됨
    private String name; // 기존과 같음
    private String chore; // chore로부터 받아야함
}
