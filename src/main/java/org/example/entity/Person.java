package org.example.entity;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class Person {

    private Long id;
    private String name;
}
