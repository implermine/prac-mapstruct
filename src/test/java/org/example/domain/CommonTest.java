package org.example.domain;

import org.example.domain.common.*;
import org.example.domain.common.mapper.BoxMapper;
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

        box.setHelloImStringList(null);
        box.setStatus(null);

        BoxDto boxDto = boxMapper.toDto(box);

        System.out.println("stop");
    }

    @Test
    @DisplayName("Test toDto2()")
    void test2(){
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
//        box.setInnerBox(new InnerBox().setName("helloWorld").setIsbn("hiWorld"));

        box.setInnerBox(null);
        box.setHelloImStringList(null);
        box.setStatus(null);

        BoxDto boxDto = boxMapper.toDto2(box);

        System.out.println("stop");
    }

    @Test
    @DisplayName("3.5 Mapping nested bean properties to current target")
    void test3(){
        Box box = new Box();
        InnerBox innerBox = new InnerBox();

        innerBox.setName("name");
        innerBox.setIsbn("1234");

        box.setInnerBox(innerBox);
        box.setGratitude("gratitude");

        BoxDto boxDto = boxMapper.toDto3(box);

        System.out.println(boxDto);

        System.out.println("stop");
    }

    @Test
    @DisplayName("extract second depth to first depth") //-> available
    void test4(){
        Box box = new Box();
        SecondStage secondStage = new SecondStage();
        secondStage.setName("hello");
        FirstStage firstStage = new FirstStage();
        firstStage.setSecond(secondStage);
        box.setFirst(firstStage);


        BoxDto boxDto = boxMapper.toDto4(box);

        System.out.println(boxDto);

        System.out.println("stop");
    }
}
