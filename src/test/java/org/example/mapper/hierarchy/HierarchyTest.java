package org.example.mapper.hierarchy;

import org.assertj.core.api.Assertions;
import org.example.dto.hierarchy.CountryAttributeDto;
import org.example.dto.hierarchy.CountryDto;
import org.example.entity.hierarchy.Country;
import org.example.entity.hierarchy.CountryAttribute;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * 결론, Hierarchy는 알아서 처리된다. flat화는 3.5 참고
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class HierarchyTest {

    @Autowired
    private CountryMapper countryMapper;

    @Test
    @DisplayName("계층구조는 default론 그냥 이름에 맞춰서 된다.")
    void test(){

        // given
        CountryAttribute countryAttribute = new CountryAttribute();
        countryAttribute.setName("name:countryAttribute");
        countryAttribute.setHeight(100);
        countryAttribute.setIsGood(true);

        Country country = new Country();
        country.setName("name:country");
        country.setCountryAttribute(countryAttribute);

        // when
        var countryDto = countryMapper.toDto(country);


        // then
        System.out.println("stop");
    }

    @Test
    @DisplayName("flat화")
    void flat(){
        // given
        CountryAttribute countryAttribute = new CountryAttribute();
        countryAttribute.setName("name:countryAttribute");
        countryAttribute.setHeight(100);
        countryAttribute.setIsGood(true);

        Country country = new Country();
        country.setName("name:country");
        country.setCountryAttribute(countryAttribute);

        // when
        var countryFlat = countryMapper.toFlat(country);

        // then
        Assertions.assertThat(countryFlat.getName()).isEqualTo("name:countryAttribute");
        Assertions.assertThat(countryFlat.getHeight()).isEqualTo(100);
        Assertions.assertThat(countryFlat.getIsGood()).isTrue();
    }

    @Test
    @DisplayName("UPDATE !")
    void update(){
        //given
        CountryAttribute countryAttribute = new CountryAttribute();
        countryAttribute.setName("name:countryAttribute");
        countryAttribute.setHeight(100);
        countryAttribute.setIsGood(true);

        Country country = new Country();
        country.setName("name:country");
        country.setCountryAttribute(countryAttribute);
        country.setIsbn("1234");

        // ================= update to...
        CountryAttributeDto countryAttributeDto = new CountryAttributeDto();
        countryAttributeDto.setName("name:countryAttributeDto");
        countryAttributeDto.setHeight(50);
        countryAttributeDto.setIsGood(Boolean.FALSE);

        CountryDto countryDto = new CountryDto();
        countryDto.setName("name:countryDto");
        countryDto.setCountryAttribute(countryAttributeDto);
        countryDto.setIsbn2("4321");

        //when
        countryMapper.updateCountryFromCountryDto(countryDto,country);

        //then
        Assertions.assertThat(country.getName()).isEqualTo("name:countryDto");
        Assertions.assertThat(country.getIsbn()).isEqualTo("4321");
        Assertions.assertThat(country.getCountryAttribute().getHeight()).isEqualTo(50);
        Assertions.assertThat(country.getCountryAttribute().getName()).isEqualTo("name:countryAttributeDto");
        Assertions.assertThat(country.getCountryAttribute().getIsGood()).isEqualTo(Boolean.FALSE);
    }
}
