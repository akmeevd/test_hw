package com.example.test_hw.controller;

import com.example.test_hw.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService = new CalculatorService();

//    public CalculatorController(CalculatorService calculatorService) {
//        this.calculatorService = calculatorService;
//    }

    @GetMapping
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping("/plus")
    public Integer plus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return this.calculatorService.plus(a, b);
    }
    @GetMapping("/minus")
    public Integer minus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return this.calculatorService.minus(a, b);
    }
    @GetMapping("/multiply")
    public Integer multiply(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return this.calculatorService.multiply(a, b);
    }
    @GetMapping("/divide")
    public double divide(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return this.calculatorService.divide(a, b);
    }
}
