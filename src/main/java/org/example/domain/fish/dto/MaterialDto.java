package org.example.domain.fish.dto;

public class MaterialDto {

    private String manufacturer;
    private MaterialTypeDto materialType;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public MaterialTypeDto getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialTypeDto materialType) {
        this.materialType = materialType;
    }

}
