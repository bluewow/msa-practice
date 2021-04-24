package com.example.chapter02version3.controller;


import com.example.chapter02version3.domain.Multiplication;
import com.example.chapter02version3.service.MultipleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/multiplications")
final class MultiplicationController {
    private final MultipleService multipleService;

    @GetMapping("/random")
    Multiplication getRandomMultiplication() {
        return multipleService.createRandomMultiplication();
    }

}