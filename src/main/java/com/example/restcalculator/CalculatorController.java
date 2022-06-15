package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private Calculator calculator = new Calculator();

    /**
     * Does sum calculation
     * @param a
     * @param b
     * @return sum
     */
    @RequestMapping("/sum")
    public int sum(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.sum(a,b);
    }

    /**
     * Does division calculation
     * @param a
     * @param b
     * @return quotient
     */
    @RequestMapping("/divide")
    public int divide(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.divide(a,b);
    }

    /**
     * Does multiply calculation
     * @param a
     * @param b
     * @return product
     */
    @RequestMapping("/multiply")
    public int multiply(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.multiply(a,b);
    }

    /**
     * Does subtraction calculation
     * @param a
     * @param b
     * @return difference
     */
    @RequestMapping("/sub")
    public int sub(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.sub(a,b);
    }

    /**
     * Does power calculation
     * @param a
     * @param b
     * @return a to the power of b
     */
    @RequestMapping("/pwr")
    public double pwr(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.pwr(a,b);
    }

    /**
     * Does absolute calculation
     * @param a
     * @return positive a
     */
    @RequestMapping("/abs")
    public int abs(
            @RequestParam int a
    ) {
        return calculator.abs(a);
    }

    /**
     * Does sqrt calculation
     * @param a
     * @return sqrt of a
     */
    @RequestMapping("/sqrt")
    public double sqrt(
            @RequestParam int a
    ) {
        return calculator.sqrt(a);
    }
}
