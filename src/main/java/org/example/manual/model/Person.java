package org.example.manual.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;

    private String b;// @BeanMapping(ignore어쩌고=true)가 아니므로 implicit 하게 매핑해줌.

    private String description;
}
