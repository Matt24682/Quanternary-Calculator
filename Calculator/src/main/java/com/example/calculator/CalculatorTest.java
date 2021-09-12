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
}

