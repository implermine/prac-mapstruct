package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Animal {

    private AnimalNames animalNames;
    private List<Aliases> aliasesList;


    @AllArgsConstructor
    @Getter
    public static class AnimalNames{

        private String name1;
    }

    @AllArgsConstructor
    @Getter
    public static class Aliases {
        private String that;
    }
}
