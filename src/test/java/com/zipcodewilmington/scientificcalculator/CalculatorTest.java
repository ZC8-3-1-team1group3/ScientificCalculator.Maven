package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class Tests {
    private CalculatorTest objCalculatorTest;
    {
        @Before
        public void setUp() {
            objCalculatorTest = new CalculatorTest();
    }

    @Test
    public void testAdd() {
        double num1 = 5; double num2 = 10;
        double expectedResult = 15;
        //Act
        double result = objectCalculatorTest.add(num1, num2);
        //Assert
       Assert.assertEquals(expectedResult, result, );
    }

    public void testSubtract() {
    }

    public void testMultiply() {
    }

    public void testDivide() {
    }

    public void testSqr() {
    }

    public void testSqrY() {
    }

    public void testRoot() {
    }

    public void testInverse() {
    }

    public void testInvertSign() {
    }

    }
}