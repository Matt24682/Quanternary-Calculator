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

    public static String addition(String firstNum, String secondNum){
        return Calculator.ConversionToQuaternary(Integer.toString(Integer.parseInt(Calculator.ConversionToStandard(firstNum)) + Integer.parseInt(Calculator.ConversionToStandard(secondNum))));
    }

    public static String subtraction(String firstNum, String secondNum){
        return Calculator.ConversionToQuaternary(Integer.toString(Integer.parseInt(Calculator.ConversionToStandard(firstNum)) - Integer.parseInt(Calculator.ConversionToStandard(secondNum))));
    }

    public static String multiplication(String firstNum, String secondNum){
        return Calculator.ConversionToQuaternary(Integer.toString(Integer.parseInt(Calculator.ConversionToStandard(firstNum)) * Integer.parseInt(Calculator.ConversionToStandard(secondNum))));
    }

    public static String division(String firstNum, String secondNum){
        return Calculator.ConversionToQuaternary(Integer.toString(Integer.parseInt(Calculator.ConversionToStandard(firstNum)) / Integer.parseInt(Calculator.ConversionToStandard(secondNum))));
    }

    public static String square(String number){
        return Calculator.ConversionToQuaternary(Integer.toString((int)Math.pow(Integer.parseInt(Calculator.ConversionToStandard(number)), 2)));
    }

    public static String squareRoot(String number){
        return Calculator.ConversionToQuaternary(Integer.toString((int)Math.floor(Math.sqrt(Integer.parseInt(Calculator.ConversionToStandard(number))))));
    }
}