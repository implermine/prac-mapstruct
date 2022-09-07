package org.example.domain.list_enum;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BoxDto {

    List<String> helloImStringListEither;

    List<InnerBoxDto> innerList;

    Status status;
}
