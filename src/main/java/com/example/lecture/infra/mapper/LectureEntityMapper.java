package com.example.lecture.infra.mapper;

import com.example.lecture.domain.Lecture;
import com.example.lecture.infra.entity.LectureEntity;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
public class LectureEntityMapper {

    public LectureEntity of(Lecture lecture) {
        return new LectureEntity(lecture.getName());
    }

    public Lecture toDomain(LectureEntity lectureEntity) {
        return new Lecture(lectureEntity.getId(), lectureEntity.getName());
    }

}
