package org.example.dto.hierarchy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CountryAttributeDto {

    private String name;
    private Integer height;
    private Boolean isGood;
}
