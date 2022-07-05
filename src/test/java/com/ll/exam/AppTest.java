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
    public void 문자열_빼기() {
        int rs = Calculator.run("10 - 5");
        assertEquals(5, rs);
    }

    @Test
    public void 문자열_곱하기() {
        int rs = Calculator.run("10 * 5");
        assertEquals(50, rs);
    }

    @Test
    public void 문자열_나눗셈() {
        int rs = Calculator.run("10 / 5");
        assertEquals(2, rs);
    }

    @Test
    public void 세자리문자_더하기() {
        int rs = Calculator.run("10 + 1 + 2");
        assertEquals(13, rs);
    }

    @Test
    public void 세자리문자_빼기() {
        int rs = Calculator.run("10 - 1 - 2");
        assertEquals(7, rs);
    }

    @Test
    public void 세자리문자_곱하기() {
        int rs = Calculator.run("10 * 1 * 2");
        assertEquals(20, rs);
    }

    @Test
    public void 세자리문자_나눗셈() {
        int rs = Calculator.run("21 / 1 / 3");
        assertEquals(7, rs);
    }
    @Test
    public void 세자리문자_사칙연산(){
        int rs=Calculator.run("1 + 2 * 3");
        assertEquals(7,rs);
    }
}
