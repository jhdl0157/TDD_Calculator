package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기() {
        int rs = 10 + 20;
        assertEquals(30, rs);
    }
    @Test
    public void 문자열_더하기() {
        int rs = Calculator.run("10 + 20");
        assertEquals(30, rs);
    }
    @Test
    public void 문자열_빼기(){
        int rs=Calculator.run("10 - 5");
        assertEquals(5,rs);
    }
    @Test
    public void 문자열_곱하기(){
        int rs=Calculator.run("10 * 5");
        assertEquals(50,rs);
    }
}
