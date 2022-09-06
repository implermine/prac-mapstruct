package org.example.mapper.custommappingmethod;

import org.example.custommappingmethod.SomeSortOfMapper;
import org.example.custommappingmethod.Square;
import org.example.custommappingmethod.SquareInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomMappingMethodTest {

    @Test
    @DisplayName("커스텀 매핑 메소드 사용")
    void test(){
        SomeSortOfMapper mapper = SomeSortOfMapper.INSTANCE;

        Square square = new Square();
        square.setHeight(3);
        square.setWidth(7);

        SquareInfo squareInfo = mapper.toInfo(square);

        System.out.println(squareInfo);
    }
}
