package org.example.manual._3_.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDto {
    private String fullName;

    private String b; // @BeanMapping(ignore어쩌고=true)가 아니므로 implicit 하게 매핑해줌.

    private String unmap;
}
