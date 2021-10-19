package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class squareDigitTest {
    squareDigit sq;
    @BeforeEach
    void setUp(){
        sq=new squareDigit();
    }
    @Test
    @DisplayName("Should return 44")
    void squareTwo(){
        assertEquals(44,sq.square(22));
    }
    @Test
    @DisplayName("This is a wrong test")
    void wrongtest(){
        assertEquals(94,sq.square(23));
    }
}