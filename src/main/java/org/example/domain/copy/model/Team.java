package org.example.domain.copy.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Team {
    private String name;
    private List<Member> memberList;
}
