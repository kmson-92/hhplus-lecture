package com.example.lecture.infra.mapper;

import com.example.lecture.domain.LectureSchedule;
import com.example.lecture.infra.entity.LectureScheduleEntity;

public class LectureScheduleEntityMapper {

    public LectureScheduleEntity of(LectureSchedule lectureSchedule) {
        return new LectureScheduleEntity(lectureSchedule.getLectureId(), lectureSchedule.getCapacity(), lectureSchedule.getApplyCount());
    }

    public LectureSchedule toDomain(LectureScheduleEntity lectureScheduleEntity) {
        return new LectureSchedule(lectureScheduleEntity.getId(), lectureScheduleEntity.getLectureId(), lectureScheduleEntity.getCapacity(), lectureScheduleEntity.getApplyCount());
    };
}
