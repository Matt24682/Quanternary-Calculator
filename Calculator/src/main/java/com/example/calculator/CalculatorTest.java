package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void conversionToQuaternaryTest() {
        String expected = "1021";
        String actual = Calculator.ConversionToQuaternary("73");
        assertEquals(expected, actual);
    }

    @Test
    public void conversionToStandardTest() {
        String expected = "73";
        String actual = Calculator.ConversionToStandard("1021");
        assertEquals(expected, actual);
    }

    @Test
    public void additionTest(){
        String expected = "31";
        String actual = Calculator.addition("15", "16");
        assertEquals(expected, actual);
    }

    @Test
    public void subtractionTest(){
        String expected = "22";
        String actual = Calculator.subtraction("30", "8");
        assertEquals(expected, actual);
    }

    @Test
    public void multiplicationTest(){
        String expected = "18";
        String actual = Calculator.multiplication("6", "3");
        assertEquals(expected, actual);
    }

    @Test
    public void divisionTest(){
        String expected = "2";
        String actual = Calculator.division("16", "8");
        assertEquals(expected, actual);
    }
}

