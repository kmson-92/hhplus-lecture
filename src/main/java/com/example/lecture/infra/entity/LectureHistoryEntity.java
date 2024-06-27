package com.example.lecture.infra.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "lectureHistory")
@NoArgsConstructor
public class LectureHistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long lectureScheduleId;

    private Long userId;

    @CreationTimestamp
    private LocalDateTime regDate;

    public LectureHistoryEntity(Long lectureScheduleId, Long userId, LocalDateTime regDate) {
        this.id = id;
        this.lectureScheduleId = lectureScheduleId;
        this.userId = userId;
        this.regDate = regDate;
    }

    public LectureHistoryEntity(Long lectureScheduleId, Long userId) {
        this.lectureScheduleId = lectureScheduleId;
        this.userId = userId;
    }
}
