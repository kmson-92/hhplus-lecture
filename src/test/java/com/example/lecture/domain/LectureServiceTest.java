package com.example.lecture.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LectureServiceTest {

    @Mock
    private LectureRepository lectureRepository;

    @Mock
    private LectureHistoryRepository lectureHistoryRepository;

    @Mock
    private LectureScheduleRepository lectureScheduleRepository;

    @InjectMocks
    private LectureService lectureService;


    // 사용자가 이미 신청한 경우 실패

    // 30명 넘었을 때 실패
    
    // 신청 성공

    
    // 특강 등록자 명단에 없는지 (실패)
    
    // 특강 등록자 명단에 있는지


}
