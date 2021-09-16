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
        String expected = "1";
        String actual = Calculator.addition("0", "1");
        assertEquals(expected, actual);
    }

    @Test
    public void secondAdditionTest(){
        String expected = "10";
        String actual = Calculator.addition("3", "1");
        assertEquals(expected, actual);
    }

    @Test
    public void largerValueAdditionTest(){
        String expected = "2303";
        String actual = Calculator.addition("1111", "1132");
        assertEquals(expected, actual);
    }

    @Test
    public void sevenDigitAdditionTest(){
        String expected = "3010220";
        String actual = Calculator.addition("1230123", "1120031");
        assertEquals(expected, actual);
    }

    @Test
    public void subtractionTest(){
        String expected = "3";
        String actual = Calculator.subtraction("10", "1");
        assertEquals(expected, actual);
    }

    @Test
    public void secondSubtractionTest(){
        String expected = "32";
        String actual = Calculator.subtraction("33", "1");
        assertEquals(expected, actual);
    }

    @Test
    public void largerSubtractionTest(){
        String expected = "2130";
        String actual = Calculator.subtraction("3323", "1133");
        assertEquals(expected, actual);
    }

    @Test
    public void sevenDigitSubtractionTest(){
        String expected = "33120";
        String actual = Calculator.subtraction("1231230", "1132110");
        assertEquals(expected, actual);
    }

    @Test
    public void multiplicationTest(){
        String expected = "102";
        String actual = Calculator.multiplication("12", "3");
        assertEquals(expected, actual);
    }

    @Test
    public void divisionTest(){
        String expected = "2";
        String actual = Calculator.division("100", "20");
        assertEquals(expected, actual);
    }

    @Test
    public void divideByZeroTest()
    {
        String expected = "Division by zero!";
        String actual = Calculator.division("100", "0");
        assertEquals(expected, actual);
    }

    @Test
    public void squaredTest(){
        String expected = "100";
        String actual = Calculator.square("10");
        assertEquals(expected, actual);
    }

    @Test
    public void perfectSquareRootTest(){
        String expected = "10";
        String actual = Calculator.squareRoot("100");
        assertEquals(expected, actual);
    }

    @Test
    public void imperfectSquareRootTest(){
        String expected = "10";
        String actual = Calculator.squareRoot("101");
        assertEquals(expected, actual);
    }
}

