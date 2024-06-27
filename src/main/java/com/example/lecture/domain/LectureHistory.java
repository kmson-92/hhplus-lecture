package com.example.lecture.domain;

import lombok.Getter;

@Getter
public class LectureHistory {

    private long lectureScheduleId; // 강의 id
    private long userId;    // 사용자 id

    public LectureHistory(long lectureScheduleId, long userId) {
        this.lectureScheduleId = lectureScheduleId;
        this.userId = userId;
    }

}
