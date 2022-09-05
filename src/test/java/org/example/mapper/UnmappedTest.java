package org.example.mapper;

import org.example.dto.BookDto;
import org.example.entity.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class UnmappedTest {

    @Autowired
    private UnmappedTestMapper mapper;

    @Test
    @DisplayName("Unmapped Test")
    void test(){
        var builder = Book.builder();
        builder.name("clean-code");
        builder.isbn("1234");
        builder.sourceUnmapped("source");
        Book newBook = builder.build();

        BookDto bookDto = mapper.toDto(newBook);

        System.out.println(bookDto);

        /**
         * ~~~/UnmappedTestMapper.java:16:13
         * java: Unmapped target property: "targetUnmapped". `at build time`
         *
         * Unmapped source property는 WARN 안되는데...?
         */

    }
}
