package org.example.mapper;

import org.assertj.core.api.Assertions;
import org.example.dto.CarDto;
import org.example.entity.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarMapperTest {

    @Test
    public void shouldMapCarToDto(){
        //given
        Car car = new Car( "Morris", 5, Car.CarType.KIA );

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto( car );

        //then
        assertThat( carDto ).isNotNull();
        assertThat( carDto.getMake() ).isEqualTo( "Morris" );
        assertThat( carDto.getSeatCount() ).isEqualTo( 5 );
        assertThat( carDto.getType() ).isEqualTo( "KIA" );

    }
}
