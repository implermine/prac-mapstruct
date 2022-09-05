//package org.example.mapper;
//
//import org.example.dto.CarDto;
//import org.example.entity.Car;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//public class CarMapperSpringDITest {
//
//    @Autowired
//    CarMapper carMapper;
//
//    @Test
//    @DisplayName("Spring DI를 통해서도 사용가능한지 여부를 테스트")
//    void shouldDependencyInjection(){
//
//        //given
//        Car car = new Car( 1L,"Morris", 5, Car.CarType.KIA );
//
//        //when
//        CarDto carDto = carMapper.carToCarDto(car);
//
//        //then
//        assertThat( carDto ).isNotNull();
//        assertThat( carDto.getMake() ).isEqualTo( "Morris" );
//        assertThat( carDto.getSeatCount() ).isEqualTo( 5 );
//        assertThat( carDto.getType() ).isEqualTo( "KIA" );
//    }
//}
