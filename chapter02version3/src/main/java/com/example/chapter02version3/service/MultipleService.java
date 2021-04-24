package com.example.chapter02version3.service;

import com.example.chapter02version3.domain.Multiplication;
import com.example.chapter02version3.domain.MultiplicationResultAttempt;

public interface MultipleService {
    /**
     * 두 개의 무작위 인수(11~99)를 담은 {@link Multiplication} 객체를 생성
     *
     * @return 무작위 인수를 담은 {@link Multiplication} 객체
     */
    Multiplication createRandomMultiplication();

    /**
     * @return 곱셈 계산 결과가 맞으면 true, 아니면 false
     */
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
}
