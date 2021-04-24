package com.example.chapter02version3.service;

import com.example.chapter02version3.domain.Multiplication;
import com.example.chapter02version3.domain.MultiplicationResultAttempt;

public interface RandomGeneratorService {
    /**
     * @return 무작위로 생성한 11 이상 99 이하의 인수
     */
    int generateRandomFactor();
}
