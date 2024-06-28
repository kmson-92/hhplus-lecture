package com.example.lecture.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LectureService {

    private final int capacity = 30;

    private final LectureRepository lectureRepository;
    private final LectureHistoryRepository lectureHistoryRepository;
    private final LectureScheduleRepository lectureScheduleRepository;

    public LectureService(LectureRepository lectureRepository, LectureHistoryRepository lectureHistoryRepository, LectureScheduleRepository lectureScheduleRepository) {
        this.lectureRepository = lectureRepository;
        this.lectureHistoryRepository = lectureHistoryRepository;
        this.lectureScheduleRepository = lectureScheduleRepository;
    }

    public boolean apply(Long lectureScheduleId, Long userId) {

        // 사용자가 이미 신청했는지 확인
        LectureHistory lectureHistory = lectureHistoryRepository.findLectureHistoryByLectureScheduleAndUserId(lectureScheduleId, userId);

        if (lectureHistory != null) {
            throw new IllegalArgumentException();
        }

        // 30명 넘었는지 확인 (스케줄의 applyCount 조회)
        LectureSchedule lectureSchedule = lectureScheduleRepository.findById(lectureScheduleId);

        if (lectureSchedule.getApplyCount() < 30) {
            throw new IllegalArgumentException();
        }

        // save
        lectureHistoryRepository.save(new LectureHistory(lectureScheduleId, userId));

        // update
        lectureScheduleRepository.save(new LectureSchedule(0L, 0L, 0, lectureSchedule.getApplyCount() + 1));

        return true;
    }
}
