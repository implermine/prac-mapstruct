package org.example.domain.polymorphism;

import org.example.domain.polymorphism.model.Animal;
import org.example.domain.polymorphism.model.AnimalWrapper;
import org.example.domain.polymorphism.model.Cat;
import org.example.domain.polymorphism.model.Dog;
import org.example.domain.polymorphism.model.dto.AnimalDto;
import org.example.domain.polymorphism.model.dto.CatDto;
import org.example.domain.polymorphism.model.dto.DogDto;
import org.mapstruct.*;

@Mapper(
        subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION
)
public interface PolyMapper {

    @SubclassMapping(target = CatDto.class, source = Cat.class)
    @SubclassMapping(target = DogDto.class, source = Dog.class)
    AnimalDto toDto(Animal animal);

//    AnimalDto fromWrapperToDto(AnimalWrapper wrapper);

    default AnimalDto map(AnimalWrapper wrapper){
        if(wrapper == null){
            return null;
        }

        Animal animal = wrapper.getAnimal();


        if(animal instanceof Cat){
            return map(wrapper,(Cat)animal);
        }

        if(animal instanceof Dog){
            return map(wrapper,(Dog)animal);
        }

        return null; // or throw exception like exhaustive blah blah
    }

    @Mapping(target = "chore", source = "wrapper.chore")
    @Mapping(target = "type", constant = "CAT")
    CatDto map(AnimalWrapper wrapper,Cat cat);

    @Mapping(target = "chore", source = "wrapper.chore")
    @Mapping(target = "type", constant = "DOG")
    DogDto map(AnimalWrapper wrapper,Dog dog);
}
