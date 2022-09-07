package org.example.domain.custommappingmethod;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Square {

    private Integer width;
    private Integer height;

    private String name; // 그대로 Dto로 내리는 값

    /**
     * 10.10 Source presence checking
     *
     * hasXYZ method가 존재하면, null check같은 본인이 하고싶은 condition을 수행하고 ,hasXYZ가 true이면
     * 값을 target에 세팅하도록 유도할 수 있다.
     */
    public Boolean hasName(){
        return name != null;
    }
}
