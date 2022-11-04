package org.example.manual._3_;

import org.example.manual._3_.model.*;
import org.example.manual._3_.model.builder.BuilderBean;
import org.example.manual._3_.model.builder.BuilderBeanDto;
import org.example.manual._3_.model.constructor.ConstructorBean;
import org.example.manual._3_.model.constructor.ConstructorBeanDto;
import org.mapstruct.*;

@Mapper
public interface Manual3Mapper {

    @Mapping(target = "manufacturer", source = "make")
    @Mapping(target = "seatCount", source = "numberOfSeats")
    @Mapping(target = "price", source = "price") // Implicit Type Conversion을 MapStruct가 수행함.
    @BeanMapping(ignoreByDefault = true) // implicit 한 매핑을 막아줌, 이에따라 a 라는 값은 매핑되지 않음
    CarDto carToCarDto(Car car);

    @Mapping(target = "fullName" , source = "name")
    @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        // target만 unmappedPolicy가 있고, source는 없음, unmapped source는 관리하지않음. 있어도 상관 없
    PersonDto personToPersonDto(Person person);

    /**
     * 3.3 Adding custom methods to mappers
     */
    default PersonDto personToPersonDtoHandWriting(Person person){
        if(person==null){
            return null;
        }

        PersonDto personDto = new PersonDto();
        personDto.setB(person.getB());
        person.setName(person.getName());

        return personDto;
    }

    /**
     * 3.4 Mapping methods with several source parameters
     *
     * 여러개의 source가 method의 파라미터로 들어올때 사용
     *
     * Address에 있는 implicitly~~ 값은 +1 layer에 존재하는 값인데, 이를 implicitly하게 뽑아다가 DeliveryAddressDto에 넣는다.
     * 이는 묵시적으로 발생하며,
     * DeliveryAddressDto에 매핑될 implicitly~~ property가 Person과 Address 양쪽에 같은 이름으로 존재 할 경우 에러가 발생한다.
     */
    @Mapping(target = "description", source = "person.description")
    @Mapping(target = "houseNumber" , source = "address.houseNo")
    @Mapping(target = "houseNumberForDirectReferring", source = "hn") //direct referring to parameter
    DeliveryAddressDto personAndAddressToDeliveryAddressDto(Person person, Address address, Integer hn);

    /**
     * 3.5 Mapping nested bean properties to current target
     *
     * unwrap nested bean, 여기엔 wrapping에 대한것은 설명되어있지 않다.
     *
     * CustomerDto.record.name -> Customer.name으로
     *
     * CustomerDto.record.weight -> Customer.weight로
     *
     * 사실 1은 2 세팅이 포함하므로 1을 쓸 필요는 없어 보이지만, 이 경우엔 record와 account 모두 name이란 property를 갖고 있으므로
     *
     * record.name에서 name을 가져와서 Customer에 매핑해야 함을 명시한다.
     *
     */
    @Mapping( target = "name", source = "record.name" ) //1
    @Mapping( target = ".", source = "record" )// 2
    @Mapping( target = ".", source = "account" )
    Customer customerDtoToCustomer(CustomerDto customerDto);


    /**
     * 3.6 Updating existing bean instances
     *
     * 새로운 객체를 만들어내는것이 아니라, 기존 Bean을 Update한다.
     *
     * Car instance를 CarDto 객체를 이용해서 Update할거다.
     */
    void updateCarFromDto(CarDto carDto, @MappingTarget Car car);

    /**
     * 3.8 Using Builders
     */
    BuilderBean BuilderBean_from_dto_to_bean(BuilderBeanDto dto);


    /**
     * 3.9 Using Constructors
     */
    ConstructorBean Constructor_from_dto_to_bean(ConstructorBeanDto dto);
}
