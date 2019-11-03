package com.hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class PositiveValueTest {

    @Test
    public void shouldReturnPositiveValueCasePositiveValue() {
        //given
        int givenPositiveValue = 5;

        //when
        int expectedPositiveValue = 5;

        //then
        assertEquals(givenPositiveValue,expectedPositiveValue);
    }
}