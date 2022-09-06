package org.example.dto.hierarchy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryDto {

    private String name;
    private CountryAttributeDto countryAttribute;
    private String isbn2;

    public CountryDto(String name, CountryAttributeDto countryAttribute, String isbn2) {
        this.name = name;
        this.countryAttribute = countryAttribute;
        this.isbn2 = isbn2;
    }

    public CountryDto() {
    }

    public static CountryDtoBuilder builder() {
        return new CountryDtoBuilder();
    }

    public static class CountryDtoBuilder {
        private String name;
        private CountryAttributeDto countryAttribute;
        private String isbn2;

        CountryDtoBuilder() {
        }

        public CountryDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CountryDtoBuilder countryAttribute(CountryAttributeDto countryAttribute) {
            this.countryAttribute = countryAttribute;
            return this;
        }

        public CountryDtoBuilder isbn2(String isbn2) {
            this.isbn2 = isbn2;
            return this;
        }

        public CountryDto build() {
            return new CountryDto(name, countryAttribute, isbn2);
        }

        public String toString() {
            return "CountryDto.CountryDtoBuilder(name=" + this.name + ", countryAttribute=" + this.countryAttribute + ", isbn2=" + this.isbn2 + ")";
        }
    }
}
