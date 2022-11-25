package com.example.test_hw;
import com.example.test_hw.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorParametrizedTest {
    private CalculatorService calculatorService;
    private static final Integer NUM_1 = 1;
    private static final Integer NUM_2 = 2;



    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldEqualWhenPlusThem(Integer input1, Integer input2) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.plus(input1, input2), input1 + input2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldEqualWhenMinusThem(Integer input1, Integer input2) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.minus(input1, input2), input1 - input2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldEqualWhenMultiplyThem(Integer input1, Integer input2) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.multiply(input1, input2), input1 * input2);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldEqualWhenDivideThem(Integer input1, Integer input2) {
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.divide(input1, input2), (double) input1 / input2);
    }


    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(Arguments.of(NUM_1, NUM_2));
    }
}
