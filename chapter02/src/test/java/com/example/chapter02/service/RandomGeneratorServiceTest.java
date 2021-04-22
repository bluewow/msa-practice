package com.example.chapter02.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RandomGeneratorServiceTest {

    @Autowired
    RandomGeneratorService randomGeneratorService;

    @Test
    public void generateRandomFactorIsBetweenExpectedLimits() {
        //given 무작위 숫자 생성
        List<Integer> randomFactors = IntStream.range(0, 1000)
                .map(i -> randomGeneratorService.generateRandomFactor())
                .boxed()
                .collect(Collectors.toList());

        //when then
        assertThat(randomFactors)
                .containsAll(IntStream.range(11, 100)
                        .boxed()
                        .collect(Collectors.toList()));

    }

}