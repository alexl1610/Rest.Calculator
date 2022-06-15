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
}