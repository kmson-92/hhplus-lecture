package com.example.lecture.domain;

public interface LectureScheduleRepository {

    LectureSchedule save(LectureSchedule lectureSchedule);

    LectureSchedule findById(long lectureScheduleId);



}
