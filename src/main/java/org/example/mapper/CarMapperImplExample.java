package org.example.mapper;

import org.example.dto.CarDto;
import org.example.entity.Car;

/**
 * CarMapper에 대해서 Gradle이 mapstruct 의존성을 받아 code를 generate한다면 이런 형식으로 생김
 */
//public class CarMapperImplExample implements CarMapper{
//
//    @Override
//    public CarDto carToCarDto(Car car) {
//        if ( car == null ) {
//            return null;
//        }
//
//        CarDto carDto = new CarDto();
//
//        if ( car.getFeatures() != null ) {
//            carDto.setFeatures( new ArrayList<String>( car.getFeatures() ) );
//        }
//        carDto.setManufacturer( car.getMake() );
//        carDto.setSeatCount( car.getNumberOfSeats() );
//        carDto.setDriver( personToPersonDto( car.getDriver() ) );
//        carDto.setPrice( String.valueOf( car.getPrice() ) );
//        if ( car.getCategory() != null ) {
//            carDto.setCategory( car.getCategory().toString() );
//        }
//        carDto.setEngine( engineToEngineDto( car.getEngine() ) );
//
//        return carDto;
//    }
//}
