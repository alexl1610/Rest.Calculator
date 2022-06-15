package com.example.restcalculator;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (0 == b) {
            throw new ArithmeticException("Divide by Zero Exception");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public double pwr(int a, int b) {
        return Math.pow(a, b);
    }

    public int abs(int a) {
        return Math.abs(a);
    }

    public double sqrt(int a) {
        return Math.sqrt(a);
    }
}
