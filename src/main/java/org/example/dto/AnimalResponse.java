package org.example.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class AnimalResponse {

    private AnimalNamesResponse animalNames;
    private List<Aliases> aliasesList;


    @NoArgsConstructor
    @Setter
    @Getter
    @AllArgsConstructor
    public static class AnimalNamesResponse {

        private String name1;
    }

    @AllArgsConstructor
    @Getter
    @Setter
    @NoArgsConstructor
    public static class Aliases {
        private String that;
    }
}
