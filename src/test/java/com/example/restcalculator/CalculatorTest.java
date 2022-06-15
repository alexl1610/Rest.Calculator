package com.example.restcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        // Arrange
        int a = 5;
        int b = 6;

        int expected = 11;

        // Act
        int result = calculator.sum(a, b);

        // Assert
        // is expected == result?
        assertEquals(expected, result);
    }
    @Test
    void subTest() {
        int a = 10;
        int b = 6;
        int expected = 4;

        int result = calculator.sub(a, b);

        assertEquals(expected, result);
    }

    @Test
    void multiplyTest() {
        int a = 10;
        int b = 6;
        int expected = 60;

        int result = calculator.multiply(a, b);

        assertEquals(expected, result);
    }

    @Test
    void divideTest() {
        int a = 30;
        int b = 5;
        int expected = 6;

        int result = calculator.divide(a, b);

        assertEquals(expected, result);
    }

    @Test
    void divTestDividedZero() {
        int a = 10;
        int b = 0;

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(a, b);
        });
    }

    @Test
    void pwrTest() {
        int a = 3;
        int b = 2;
        int expected = 9;

        double result = calculator.pwr(a, b);

        assertEquals(expected, result);
    }

    @Test
    void absTest() {
        int a = -1;
        int expected = 1;

        int result = calculator.abs(a);

        assertEquals(expected, result);
    }

    @Test
    void sqrtTest() {
        int a = 25;
        int expected = 5;

        double result = calculator.sqrt(a);

        assertEquals(expected, result);
    }
}