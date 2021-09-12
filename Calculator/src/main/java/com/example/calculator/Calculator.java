package com.example.calculator;

public class Calculator {
    public static String ConversionToQuaternary(String input) {
        int sBase = 10;
        int dBase  = 4;
        return Integer.toString(
                Integer.parseInt(input, sBase), dBase);
    }

    public static String ConversionToStandard(String input) {
        int sBase = 4;
        int dBase  = 10;
        return Integer.toString(
                Integer.parseInt(input, sBase), dBase);
    }
}
