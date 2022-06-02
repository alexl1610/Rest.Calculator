package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

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
        return a + b;
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
        return a / b;
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
        return a * b;
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
        return a - b;
    }

    /**
     * Does power calculation
     * @param a
     * @param b
     * @return a to the power of b
     */
    @RequestMapping("/pot")
    public double pot(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return Math.pow(a,b);
    }

    /**
     * Does absolute calculation
     * @param a
     * @return positive a
     */
    @RequestMapping("/absolute")
    public int absolute(
            @RequestParam int a,
    ) {
        return Math.abs(a);
    }


}
