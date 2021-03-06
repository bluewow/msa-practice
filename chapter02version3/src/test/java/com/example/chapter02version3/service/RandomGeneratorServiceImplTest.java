package com.example.chapter02version3.service;

import com.example.chapter02version3.domain.Multiplication;
import com.example.chapter02version3.domain.MultiplicationResultAttempt;
import com.example.chapter02version3.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.openMocks;

@ExtendWith(MockitoExtension.class)
class RandomGeneratorServiceImplTest {
    private RandomGeneratorServiceImpl randomGeneratorServiceImpl = new RandomGeneratorServiceImpl();

    @Test
    public void generateRandomFactorIsBetweenExpectedLimits() throws Exception {
        // 무작위 숫자를 생성
        List<Integer> randomFactors = IntStream.range(0, 1000)
                .map(i -> randomGeneratorServiceImpl.generateRandomFactor())
                .boxed().collect(Collectors.toList());

        // 적당히 어려운 계산을 만들기 위해서
        // 생성한 인수가 11~99 범위에 있는지 확인
        assertThat(randomFactors).containsOnlyElementsOf(IntStream.range(11, 100)
                .boxed().collect(Collectors.toList()));
    }

}