package org.example.domain.fish.dto;

public class FishDto {

    private String kind;

    // make sure that mapping on name does not happen based on name mapping
    private String name;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}