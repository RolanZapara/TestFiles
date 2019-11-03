package com.hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummationTwoNumbersTest {

    @Test
    public void summationTwoNumbersTest() {
        //given
        int n1 = 3;
        int n2 = 5;
        int expectedSummation = 8;

        //when
        int result = SummationTwoNumbers.summationTwoNumbers(n1, n2);

        //then
        assertEquals(expectedSummation,result);
    }
}