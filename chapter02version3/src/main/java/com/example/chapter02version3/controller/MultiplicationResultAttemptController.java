package com.example.chapter02version3.controller;

import com.example.chapter02version3.domain.MultiplicationResultAttempt;
import com.example.chapter02version3.service.MultipleService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/results")
final class MultiplicationResultAttemptController {
    private final MultipleService multipleService;

    @PostMapping
    ResponseEntity<ResultResponse> postResult(@RequestBody MultiplicationResultAttempt multiplicationResultAttempt) {
        return ResponseEntity.ok(
                new ResultResponse(multipleService
                        .checkAttempt(multiplicationResultAttempt)));
    }

    @RequiredArgsConstructor
    @NoArgsConstructor(force = true)
    @Getter
    static final class ResultResponse {
        private final boolean correct;
    }
}