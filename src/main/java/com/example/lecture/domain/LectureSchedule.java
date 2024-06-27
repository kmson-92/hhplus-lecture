package com.example.lecture.domain;

import lombok.Getter;

@Getter
public class LectureSchedule {

    private long id;
    private long lectureId;
    private int capacity;
    private int applyCount;

    public LectureSchedule(long id, long lectureId, int capacity, int applyCount) {
        this.id = id;
        this.lectureId = lectureId;
        this.capacity = capacity;
        this.applyCount = applyCount;
    }

}
