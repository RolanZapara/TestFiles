package com.hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTwoNumbersTest {
    @Test

    public void divisionTwoNumbers() {
        //given
        int n1 = 4000;
        int n2 = 200;
        int expectedDeivision = 20;

        //when
        int result = DivisionTwoNumbers.divisionTwoNumbers(n1, n2);

        //then
        assertEquals(expectedDeivision,result);
    }
}
