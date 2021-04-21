package com.example.chapter02.service;

import com.example.chapter02.domain.Multiplication;

public interface MultiplicationService {
    /**
     *
     * @return 무작위 인수를 담은 {@link Multiplication} 객체
     */
    Multiplication createRandomMultiplication();
}
