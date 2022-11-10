package org.example.domain.hasXYZ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassRoom {

    private Student student;

    public boolean hasStudent(){
        return student!=null;
    }
}
