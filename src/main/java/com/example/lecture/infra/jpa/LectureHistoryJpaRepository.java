package com.example.lecture.infra.jpa;

import com.example.lecture.infra.entity.LectureHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface
LectureHistoryJpaRepository extends JpaRepository<LectureHistoryEntity, Long> {
    LectureHistoryEntity findLectureHistoryByLectureScheduleAndUserId(Long lectureScheduleId, Long userId);
}
