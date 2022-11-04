package org.example.manual.model.builder;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BuilderBeanDto {

    private String name;
    private Integer height;
}
