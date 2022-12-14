package com.monotonic.testing.m4;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearTest {
    // a year is leap if it is divisible by four
    // but, years divisible by 100, are not leap years,
    // except years divisible by 400

    @Test
    public void leapYearsAreDivisibleByFour(){
        assertTrue(LeapYear.isLeapYear(2016));
    }
    @Test
    public void normalYearsAreNotDivisibleByFour(){
        assertFalse(LeapYear.isLeapYear(3));
    }
    @Test
    public void leapYearsAreNotDivisibleByOneHundred(){
        assertFalse(LeapYear.isLeapYear(1900));
    }
    @Test
    public void leapYearsAreDivisibleByFourHundred(){
        assertTrue(LeapYear.isLeapYear(2000));
    }
}
