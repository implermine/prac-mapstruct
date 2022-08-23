//package org.example.mapper;
//
//import javax.annotation.processing.Generated;
//import org.example.dto.PersonDto;
//import org.example.entity.Person;
//import org.springframework.stereotype.Component;
//
//@Generated(
//        value = "org.mapstruct.ap.MappingProcessor",
//        date = "2022-08-23T17:39:19+0900",
//        comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
//)
//@Component
//public class PersonMapperImpl implements PersonMapper {
//
//    @Override
//    public Person dtoToEntity(PersonDto personDto, Long id) {
//        if ( personDto == null && id == null ) {
//            return null;
//        }
//
//        Person.PersonBuilder person = Person.builder(); // <------ It used builder
//
//        if ( personDto != null ) {
//            person.name( personDto.getNameForDto() );
//        }
//        person.id( id );
//
//        return person.build();
//    }
//}