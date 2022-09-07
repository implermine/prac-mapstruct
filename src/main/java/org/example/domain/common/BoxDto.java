package org.example.domain.common;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BoxDto {

    private List<String> helloImStringListEither;

    private List<InnerBoxDto> innerList;

    private Status status;

    private List<Boolean> nullTest;

    public BoxDto() {
        this.nullTest = List.of(Boolean.TRUE); // 기본생성자에서 True(list) 로 초기화
    }
}
