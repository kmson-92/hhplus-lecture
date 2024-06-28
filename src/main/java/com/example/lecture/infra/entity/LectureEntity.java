package com.example.lecture.infra.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "lecture")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class LectureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @CreationTimestamp
    private LocalDateTime regDate;

    public LectureEntity(String name, LocalDateTime regDate) {
        this.id = id;
        this.name = name;
        this.regDate = regDate;
    }

    public LectureEntity(String name) {
        this.name = name;
    }
}
