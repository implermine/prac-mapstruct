package org.example.entity.hierarchy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Country {

    private String name;
    private CountryAttribute countryAttribute;
    private String isbn;
}
