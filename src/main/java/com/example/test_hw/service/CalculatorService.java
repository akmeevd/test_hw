package com.example.test_hw.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public Integer plus(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Введите параметр(ы)");
        }
        return a + b;
    }

    public Integer minus(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Введите параметр(ы)");
        }
        return a - b;
    }
    public Integer multiply(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Введите параметр(ы)");
        }
        return a * b;
    }
    public double divide(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Введите параметр(ы)");
        }

        if (b == 0) {
            throw new IllegalArgumentException("на ноль делить нельзя");
        }
        return (double) a / b;
    }


}
