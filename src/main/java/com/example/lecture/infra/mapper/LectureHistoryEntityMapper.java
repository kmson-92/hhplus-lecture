package com.example.lecture.infra.mapper;

import com.example.lecture.domain.LectureHistory;
import com.example.lecture.infra.entity.LectureHistoryEntity;

public class LectureHistoryEntityMapper {

    public LectureHistoryEntity of(LectureHistory lectureHistory) {
        return new LectureHistoryEntity(lectureHistory.getLectureScheduleId(), lectureHistory.getUserId());
    }

    public LectureHistory toDomain(LectureHistoryEntity lectureHistoryEntity) {
        return new LectureHistory(lectureHistoryEntity.getLectureScheduleId(), lectureHistoryEntity.getUserId());
    };

}
