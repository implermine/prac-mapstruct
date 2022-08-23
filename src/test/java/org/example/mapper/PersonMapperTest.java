package org.example.mapper;

import org.example.dto.PersonDto;
import org.example.entity.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class PersonMapperTest {

    @Autowired
    PersonMapper personMapper;

    @Test
    @DisplayName("Spring DI를 통해서도 사용가능한지 여부를 테스트")
    void shouldDependencyInjection(){

        //given
        PersonDto dto = new PersonDto("implermine");

        //when
        Person person = personMapper.dtoToEntity(dto, 3L);

        //then
        System.out.println(person);
        System.out.println(personMapper.customMappingMethod());
    }
}
