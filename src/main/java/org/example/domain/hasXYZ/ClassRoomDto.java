package org.example.domain.hasXYZ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassRoomDto {

    private Student student;

    public ClassRoomDto() {
        student = new Student();
    }
}
