package org.example.domain.common;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class InnerBox {

    private String name;

    private String isbn;
}
