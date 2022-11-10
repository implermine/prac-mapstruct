package org.example.domain.hasXYZ;

import org.mapstruct.Mapper;

@Mapper
public interface HasMapper {

    ClassRoomDto toDto(ClassRoom room);
}
