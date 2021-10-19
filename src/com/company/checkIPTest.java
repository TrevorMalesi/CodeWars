package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkIPTest {
    checkIP ip;
    @BeforeEach
    void setUp() {
        ip=new checkIP();
    }
    @Test
    @DisplayName("This return true")
    void simpleTest(){
        assertEquals(true,ip.isvalidIp("127.0.0.1"));
    }
    @Test
    @DisplayName("This returns false")
    void wrongTest(){
        assertEquals(false,ip.isvalidIp("259.0.0.1"));
    }
    @Test
    @DisplayName("This is a wrong test")
    void falseTest(){
        assertEquals(true,ip.isvalidIp("256.0"));
    }
    @Test
    void otherTest(){
        assertEquals(false,ip.isvalidIp(" "));
    }


}