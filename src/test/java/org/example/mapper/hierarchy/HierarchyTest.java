package org.example.mapper.hierarchy;

import org.example.dto.hierarchy.CountryDto;
import org.example.entity.hierarchy.Country;
import org.example.entity.hierarchy.CountryAttribute;
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
        CountryDto countryDto = countryMapper.toDto(country);


        // then
        System.out.println("stop");


    }
}
