package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class arraySumTest {
    arraySum a;
    @BeforeEach
    void setUp() {
        a=new arraySum();
    }
    @Test
    @DisplayName("This returns 6")
    void firstTest(){
        assertEquals(6,new int[]{1,2,3});
    }

}