package org.example.domain.common;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Box {

    private List<String> helloImStringList;

    private List<InnerBox> innerList;

    private Status status;

    private List<Boolean> nullTest;

    private InnerBox innerBox;
}
