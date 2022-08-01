package org.example.mapper;

import org.example.dto.AnimalResponse;
import org.example.entity.Animal;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AnimalMapperTest {

    @Test
    public void shouldMapAnimalToAnimalResponse(){
        //given
        List<Animal.Aliases> aliasesList = new ArrayList<>();
        aliasesList.add(new Animal.Aliases("that1"));
        aliasesList.add(new Animal.Aliases("that2"));
        aliasesList.add(new Animal.Aliases("that3"));


        Animal animal = new Animal(new Animal.AnimalNames("happy"), aliasesList);

        //when
        AnimalResponse animalResponse = AnimalMapper.INSTANCE.animalToAnimalResponse(animal);

        //then
        assertThat( animalResponse ).isNotNull();
        assertThat( animalResponse.getAnimalNames().getName1() ).isEqualTo( "happy" );


    }
}
