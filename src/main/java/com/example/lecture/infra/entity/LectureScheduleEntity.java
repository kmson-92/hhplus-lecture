package com.example.lecture.infra.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "lecture_schedule")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class LectureScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long lectureId;
    private int capacity;
    private int applyCount;

    @CreationTimestamp
    private LocalDateTime regDate;

    public LectureScheduleEntity(Long id, Long lectureId, int capacity, int applyCount, LocalDateTime regDate) {
        this.id = id;
        this.lectureId = lectureId;
        this.capacity = capacity;
        this.applyCount = applyCount;
        this.regDate = regDate;
    }

    public LectureScheduleEntity(Long lectureId, int capacity, int applyCount) {
        this.lectureId = lectureId;
        this.capacity = capacity;
        this.applyCount = applyCount;
    }
}
