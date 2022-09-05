package org.example.mapper;

import org.example.dto.BookDto;
import org.example.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;


/**
 * Mapping 설정을 default로 두고, 어떤식으로 로그가 발생하는지 inspect
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UnmappedTestMapper {


    BookDto toDto(Book entity);
}
