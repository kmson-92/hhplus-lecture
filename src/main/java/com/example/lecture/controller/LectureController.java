package com.example.lecture.controller;

import com.example.lecture.domain.LectureSchedule;
import com.example.lecture.domain.LectureService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LectureController {

    private final LectureService lectureService;

    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    // 특강 신청 API
    @PostMapping("/lectures/apply")
    public boolean apply(Long lectureScheduleId, Long userId) {
        return lectureService.apply(lectureScheduleId, userId);
    }

    // 특강 신청 완료 여부 조회 API

}
