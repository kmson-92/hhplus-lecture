package com.example.lecture.domain;

import com.example.lecture.infra.entity.LectureHistoryEntity;

public interface LectureHistoryRepository {

    LectureHistory save(LectureHistory lectureHistory);

    LectureHistory findLectureHistoryByLectureScheduleAndUserId(Long lectureScheduleId, Long userId);

}
