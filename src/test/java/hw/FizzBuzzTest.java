package hw;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test(expected = NegativeArraySizeException.class)
    public void testFizzBuzzNegativeTen() {
        FizzBuzz.fizzBuzz("-10");
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testFizzBuzzNegativeOne() {
        FizzBuzz.fizzBuzz("-1");
    }

    @Test
    public void testFizzBussZero(){
        final String[] zero = {};
        assertArrayEquals(zero, FizzBuzz.fizzBuzz("0"));
    }

    @Test
    public void testFizzBuzzOne(){
        final String[] one = {"1"};
        assertArrayEquals(one, FizzBuzz.fizzBuzz("1"));
    }

    @Test
    public void testFizzBuzzSeven(){
        final String[] seven = {"1", "2", "fizz", "4", "buzz", "fizz", "7"};
        assertArrayEquals(seven, FizzBuzz.fizzBuzz("7"));
    }

    @Test
    public void testFizzBuzzSeventeen(){
        final String[] seventeen = {"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizz buzz", "16", "17"};
        assertArrayEquals(seventeen, FizzBuzz.fizzBuzz("17"));
    }
}