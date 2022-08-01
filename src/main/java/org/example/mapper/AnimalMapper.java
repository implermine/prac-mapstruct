package org.example.mapper;

import org.example.dto.AnimalResponse;
import org.example.entity.Animal;
import org.example.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimalMapper {

    AnimalMapper INSTANCE = Mappers.getMapper(AnimalMapper.class);

    AnimalResponse animalToAnimalResponse(Animal animal);
}
