package org.example.domain.hierarchy;

import org.example.domain.hierarchy.model.First;
import org.example.domain.hierarchy.model.dto.FirstDto;
import org.mapstruct.Mapper;

@Mapper
public interface HierarchyMapper {

    FirstDto toDto(First first);

    First copy(First first);
}
