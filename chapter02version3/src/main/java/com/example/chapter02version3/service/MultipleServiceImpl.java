package com.example.chapter02version3.service;

import com.example.chapter02version3.domain.Multiplication;
import com.example.chapter02version3.domain.MultiplicationResultAttempt;
import org.springframework.beans.factory.annotation.Autowired;

public class MultipleServiceImpl implements  MultipleService {
    private RandomGeneratorService randomGeneratorService;

    @Autowired
    public MultipleServiceImpl(final RandomGeneratorService randomGeneratorService) {
        this.randomGeneratorService = randomGeneratorService;
    }

    @Override
    public Multiplication createRandomMultiplication() {
        int factorA = randomGeneratorService.generateRandomFactor();
        int factorB = randomGeneratorService.generateRandomFactor();
        return new Multiplication(factorA, factorB);
    }

    @Override
    public boolean checkAttempt(final MultiplicationResultAttempt resultAttempt) {
        return resultAttempt.getResultAttempt() ==
                resultAttempt.getMultiplication().getFactorA() *
                        resultAttempt.getMultiplication().getFactorB();
    }
}
