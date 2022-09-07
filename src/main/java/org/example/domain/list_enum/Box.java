package org.example.domain.list_enum;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Box {

    List<String> helloImStringList;

    List<InnerBox> innerList;

    Status status;
}
