package com.example.lecture.infra;

import com.example.lecture.domain.Lecture;
import com.example.lecture.domain.LectureRepository;
import com.example.lecture.infra.entity.LectureEntity;
import com.example.lecture.infra.jpa.LectureJpaRepository;
import com.example.lecture.infra.mapper.LectureEntityMapper;
import org.springframework.stereotype.Repository;

@Repository
public class LectureRepositoryImpl implements LectureRepository {

    private final LectureJpaRepository lectureJpaRepository;

    public LectureRepositoryImpl(LectureJpaRepository lectureJpaRepository) {
        this.lectureJpaRepository = lectureJpaRepository;
    }
    @Override
    public Lecture findById(long lectureId) {
        LectureEntity result = lectureJpaRepository.findById(lectureId).orElseThrow(IllegalArgumentException::new);
        LectureEntityMapper mapper = new LectureEntityMapper();
        return mapper.toDomain(result);
    }
}
