package org.example.manual._3_.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private Long houseNo;

    private Long implicitlyConvertedToDeliveryAddressDto; // Address와 Person을 합해서 DeliveryAddressDto를 만드는데,
    // 이때, 따로 지정해주지 않아도 nested 되어있는 implicitlyConvertedToDeliveryAddressDto 값을 추출해서 DeliveryAddressDto를 만드는데
    // 사용한다.
}
