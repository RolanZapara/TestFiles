package com.hackerrank;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SubstractionTwoNumbersTest {

    @Test
    public void substractionTwoNumbersTest() {
        //given
        int n1 = 12;
        int n2 = 5;
        int expectedSubstraction = 7;

        //when
        int result = SubstractionTwoNumbers.substractionTwoNumbers(n1, n2);

        //then
        assertEquals(expectedSubstraction, result);

    }
}
