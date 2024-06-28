package com.example.lecture.infra;

import com.example.lecture.domain.LectureHistory;
import com.example.lecture.domain.LectureHistoryRepository;
import com.example.lecture.infra.entity.LectureHistoryEntity;
import com.example.lecture.infra.jpa.LectureHistoryJpaRepository;
import com.example.lecture.infra.mapper.LectureHistoryEntityMapper;
import org.springframework.stereotype.Repository;

@Repository
public class LectureHistoryRepositoryImpl implements LectureHistoryRepository {

    private final LectureHistoryJpaRepository lectureHistoryJpaRepository;
    private final LectureHistoryEntityMapper lectureHistoryEntityMapper;

    public LectureHistoryRepositoryImpl(LectureHistoryJpaRepository lectureHistoryJpaRepository) {
        this.lectureHistoryJpaRepository = lectureHistoryJpaRepository;
        this.lectureHistoryEntityMapper = new LectureHistoryEntityMapper();
    }

    @Override
    public LectureHistory save(LectureHistory lectureHistory) {
        return lectureHistoryEntityMapper.toDomain(lectureHistoryJpaRepository.save(lectureHistoryEntityMapper.of(lectureHistory)));
    }

    @Override
    public LectureHistory findLectureHistoryByLectureScheduleAndUserId(Long lectureScheduleId, Long userId) {
        LectureHistoryEntity result = lectureHistoryJpaRepository.findLectureHistoryByLectureScheduleAndUserId(lectureScheduleId, userId);
        return lectureHistoryEntityMapper.toDomain(result);
    }
}
