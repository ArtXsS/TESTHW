package ru.netology;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator = new Calculator();

    @Test
    public void sumDevide() {
        int result = calculator.devide.apply(6, 2);
        int expected = 3;
        assertEquals(expected, result);
    }
    @Test
    public void sumPow() {
        int result = calculator.pow.apply(5);
        int expected = 25;
        assertEquals(expected, result);
    }
    @Test
    public void sumMultiply() {
        int result = calculator.multiply.apply(9, 8);
        int expected = 72;
        assertEquals(expected, result);
    }

}