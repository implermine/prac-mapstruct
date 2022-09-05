package org.example.dto.hierarchy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CountryDto {

    private String name;
    private CountryAttributeDto countryAttribute;
}
