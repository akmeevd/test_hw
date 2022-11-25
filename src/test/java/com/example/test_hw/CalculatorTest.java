package com.example.test_hw;

import com.example.test_hw.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Integer ILLEGAL_ARGUMENT = 0;
    private final Integer NUM_1 = 1;
    private final Integer NUM_2 = 2;
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void shouldNumsEqualsWhenPlusThem() {
        Integer expected = calculatorService.plus(NUM_1, NUM_2);
        Integer actual = NUM_1 + NUM_2;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNumsEqualsWhenMinusThem() {
        Integer expected = calculatorService.minus(NUM_1, NUM_2);
        Integer actual = NUM_1 - NUM_2;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNumsEqualsWhenMultiplyThem() {
        Integer expected = calculatorService.multiply(NUM_1, NUM_2);
        Integer actual = NUM_1 * NUM_2;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNumsEqualsWhenDivideThem() {
        double expected = calculatorService.divide(NUM_1, NUM_2);
        double actual = (double) NUM_1 / NUM_2;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivideOnNull() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(NUM_1, ILLEGAL_ARGUMENT));
    }
}
