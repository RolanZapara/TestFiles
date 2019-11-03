package com.hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTwoNumbersTest {

    @Test
    public void multiplicationTwoNumbersTest() {
        //given
        int n1 = 3;
        int n2 = 11;
        int expectedMultiplication = 33;

        //when
        int result = MultiplicationTwoNumbers.multiplicationTwoNumbers(n1, n2);

        //then
        assertEquals(expectedMultiplication, result);
    }
}