package com.ohgiraffers.jenkinsproject.dto;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class CalculatorDTO {
    private int num1;
    private int num2;
    private int sum;
}

