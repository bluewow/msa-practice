package com.example.chapter02.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomGeneratorServiceImplTest {
    private static RandomGeneratorServiceImpl randomGeneratorServiceImpl;

    @BeforeAll
    public static void setUp() {
        randomGeneratorServiceImpl = new RandomGeneratorServiceImpl();
    }

    @Test
    public void generateRandomFactorIsBetweenExpectedLimits() {
        //given 무작위 숫자 생성
        List<Integer> randomFactors = IntStream.range(0, 1000)
                .map(i -> randomGeneratorServiceImpl.generateRandomFactor())
                .boxed()
                .collect(Collectors.toList());

        //when then
        assertThat(randomFactors)
                .containsAll(IntStream.range(11, 99)
                        .boxed()
                        .collect(Collectors.toList()));

    }

}
