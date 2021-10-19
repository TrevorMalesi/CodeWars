package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }
    @Test
    @DisplayName("This returns two")
    void multiplyByTwo(){
        assertEquals(2,calculator.multiply(2,1));
    }

}