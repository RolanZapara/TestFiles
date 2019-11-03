package com.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathMethodsTest {

    @Test
    public void summationTwoNumbersTest() {
        //given
        int n1 = 3;
        int n2 = 5;
        int expectedSummation = 8;
        //when
        int result = MathMethods.summationTwoNumbers(n1, n2);
        //then
        assertEquals(expectedSummation,result);
    }

    @Test
    public void substractionTwoNumbersTest() {
        //given
        int n1 = 12;
        int n2 = 5;
        int expectedSubstraction = 7;
        //when
        int result = MathMethods.subtractionTwoNumbers(n1, n2);
        //then
        assertEquals(expectedSubstraction, result);

    }

    @Test
    public void multiplicationTwoNumbersTest() {
        //given
        int n1 = 3;
        int n2 = 11;
        int expectedMultiplication = 33;
        //when
        int result = MathMethods.multiplicationTwoNumbers(n1, n2);
        //then
        assertEquals(expectedMultiplication, result);
    }

    @Test
    public void divisionTwoNumbers() {
        //given
        int n1 = 4000;
        int n2 = 200;
        int expectedDivision = 20;
        //when
        int result = MathMethods.divisionTwoNumbers(n1, n2);
        //then
        assertEquals(expectedDivision,result);
    }
}
