package com.example.chapter02.service;

/**
 * 곱셈에 필요한 숫자를 매번 무작위로 생성하는 서비스를 따로 만든다.
 * 곱셈을 계산하는 서비스 내에서 숫자를 무작위로 생성한다면 테스트 작성이 쉽지 않다
 */
public interface RandomGeneratorService {
    /**
     *
     * @return 무작위로 만든 11 이상 99 이하의 인수
     */
    int generateRandomFactor();
}
