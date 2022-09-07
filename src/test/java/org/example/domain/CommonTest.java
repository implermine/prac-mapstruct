package org.example.domain;

import org.example.domain.common.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CommonTest {

    @Autowired
    private BoxMapper boxMapper;

    @Test
    @DisplayName("Impl 만들기")
    void test(){
        List<String> stringList = new ArrayList<>();

        stringList.add("a"); stringList.add("b"); stringList.add("c");

        List<InnerBox> innerBoxList = new ArrayList<>();

        innerBoxList.add(new InnerBox().setName("A"));
        innerBoxList.add(new InnerBox().setName("B"));
        innerBoxList.add(new InnerBox().setName("C"));




        Box box = new Box();
        box.setInnerList(innerBoxList);
        box.setHelloImStringList(stringList);
        box.setStatus(Status.SUCCESS);

        BoxDto boxDto = boxMapper.toDto(box);

        System.out.println("stop");
    }
}
