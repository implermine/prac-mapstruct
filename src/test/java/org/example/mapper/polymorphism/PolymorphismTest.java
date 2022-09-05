package org.example.mapper.polymorphism;

import org.example.dto.polymorphism.VehicleWrapperDto;
import org.example.entity.polymorphism.Car;
import org.example.entity.polymorphism.Vehicle;
import org.example.entity.polymorphism.VehicleWrapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class PolymorphismTest {

    @Autowired
    private VehicleWrapperMapper vehicleWrapperMapper;

    @Test
    void carTest(){

        // given
        Car car = new Car();
        car.setId(1L);
        car.setName("ionic");
        car.setCarAttr("carAttribute For Ionic");

        Vehicle vehicle = car;

        VehicleWrapper vehicleWrapper = new VehicleWrapper();
        vehicleWrapper.setVehicle(vehicle);


        // when
        VehicleWrapperDto vehicleWrapperDto = vehicleWrapperMapper.toDto(vehicleWrapper);

        // then

        // stop!
        System.out.println("stop...!");


    }
}
