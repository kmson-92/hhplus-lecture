package com.example.lecture.infra;

import com.example.lecture.domain.LectureSchedule;
import com.example.lecture.domain.LectureScheduleRepository;
import com.example.lecture.infra.entity.LectureScheduleEntity;
import com.example.lecture.infra.jpa.LectureScheduleJpaRepository;
import com.example.lecture.infra.mapper.LectureScheduleEntityMapper;
import org.springframework.stereotype.Repository;

@Repository
public class LectureScheduleRepositoryImpl implements LectureScheduleRepository {

    private final LectureScheduleJpaRepository lectureScheduleJpaRepository;
    private final LectureScheduleEntityMapper lectureScheduleEntityMapper;

    public LectureScheduleRepositoryImpl(LectureScheduleJpaRepository lectureScheduleJpaRepository) {
        this.lectureScheduleJpaRepository = lectureScheduleJpaRepository;
        this.lectureScheduleEntityMapper = new LectureScheduleEntityMapper();
    }

    @Override
    public LectureSchedule save(LectureSchedule lectureSchedule) {
        return lectureScheduleEntityMapper.toDomain(lectureScheduleJpaRepository.save(lectureScheduleEntityMapper.of(lectureSchedule)));
    }

    @Override
    public LectureSchedule findById(long lectureScheduleId) {
        LectureScheduleEntity result = lectureScheduleJpaRepository.findById(lectureScheduleId).orElseThrow(IllegalArgumentException::new);
        return lectureScheduleEntityMapper.toDomain(result);

    }
}
