package com.hackerrank;

public class NegativeValue {
    public static String expectedNegativeValue(int iNegative) {
        if (iNegative > 0)
            return "Positive value";
        else if (iNegative < 0)
            return "Negative value";
        else
            return "0";
    }
}
