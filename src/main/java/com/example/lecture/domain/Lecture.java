package com.example.lecture.domain;

import lombok.Getter;

import java.util.Date;

@Getter
public class Lecture {

    private Long id;        // 강의 id
    private String name;    // 강의 이름

    public Lecture(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
