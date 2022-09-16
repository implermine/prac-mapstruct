package org.example.domain.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class BoxDto {

    private List<String> helloImStringListEither;

    private List<InnerBoxDto> innerList;

    private Status status;

    private List<Boolean> nullTest;

    private String isbn;

    private InnerBoxDto innerBox;

    public BoxDto() {
        this.nullTest = List.of(Boolean.TRUE); // 기본생성자에서 True(list) 로 초기화, 따라서 null이 매핑되어선 안됌
        this.status = Status.SUCCESS;
    }
}