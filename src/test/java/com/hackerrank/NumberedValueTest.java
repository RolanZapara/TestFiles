package com.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberedValueTest {
    @Test
    public void shouldReturnPositiveValueCasePositiveValue() {
        //given
        int givenPositiveValue = 5;

        //when
        int expectedPositiveValue = 5;

        //then
        assertEquals(givenPositiveValue,expectedPositiveValue);
    }
    @Test
    public void shouldReturnNegativeValueCaseNegativeValue() {
        //given
        int givenNegativeValue = -4;

        //when
        int expectedNegativeValue = -4;

        //then
        assertEquals(givenNegativeValue,expectedNegativeValue);
    }

    @Test
    public void shouldReturnZeroValueCaseZeroValue() {
        //given
        int givenZeroValue = 0;

        //when
        int expectedZeroValue = 0;

        //then
        assertEquals(givenZeroValue,expectedZeroValue);
    }
}
