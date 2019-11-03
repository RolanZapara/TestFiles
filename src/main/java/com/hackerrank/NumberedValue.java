package com.hackerrank;

public class NumberedValue {
    public static String expectedValue(int i) {
        if (i > 0)
            return "Positive value";
        else if (i < 0)
            return "Negative value";
        else
            return "0";
    }
}
