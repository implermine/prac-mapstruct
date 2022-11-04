package org.example.manual.model.constructor;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ConstructorBeanDto {

    private final String name;
    private final String surname;
}
