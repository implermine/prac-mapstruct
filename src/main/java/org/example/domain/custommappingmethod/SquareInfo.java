package org.example.domain.custommappingmethod;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
public class SquareInfo {

    private Integer area;

    private String name; // 그대로 entity에서 오는 값

    public Boolean hasName(){
        return name != null;
    }
}
