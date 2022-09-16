package org.example.mapper.polymorphism;

import org.example.dto.polymorphism.CarDto;
import org.example.dto.polymorphism.TruckDto;
import org.example.dto.polymorphism.VehicleDto;
import org.example.entity.polymorphism.Car;
import org.example.entity.polymorphism.Truck;
import org.example.entity.polymorphism.Vehicle;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {CarMapper.class, TruckMapper.class},
        subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION
)
public interface VehicleMapper {

    @SubclassMapping(source = Car.class, target = CarDto.class)
    @SubclassMapping(source = Truck.class, target = TruckDto.class)
//    @Mapping(target = "type", source = "entity") <- 이거안될텐데;;
    VehicleDto toDto(Vehicle entity);

//    default String toDtoType(Vehicle entity){
//        if(entity==null){
//            return null;
//        }
//
//        if(entity instanceof Car){
//            return "CAR";
//        }
//
//        if(entity instanceof Truck){
//            return "TRUCK";
//        }
//
//        return null;
//    }

}
