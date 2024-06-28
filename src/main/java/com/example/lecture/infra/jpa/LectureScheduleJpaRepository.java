package com.example.lecture.infra.jpa;

import com.example.lecture.infra.entity.LectureScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureScheduleJpaRepository extends JpaRepository<LectureScheduleEntity, Long> {
}
