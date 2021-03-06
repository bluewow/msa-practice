package com.example.chapter02version3.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class User {
    private final String alias;

    // JSON (역)직렬화를 위한 빈 생성자
    protected User() {
        alias = null;
    }
}
