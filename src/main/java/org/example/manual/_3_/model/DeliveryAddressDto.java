package org.example.manual._3_.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeliveryAddressDto {

    private Long houseNumber;
    private String description;
    private String houseNumberForDirectReferring;

    private Long implicitlyConvertedToDeliveryAddressDto;
}
