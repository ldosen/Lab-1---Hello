package hw;

import java.util.Arrays;

public class Main {

    public static void main(final String[] args) {
        String[] fizzBuzzArray = FizzBuzz.fizzBuzz(args[0]);
        for (int i = 0; i < fizzBuzzArray.length; i++) {
            System.out.println(fizzBuzzArray[i]);
        }
    }
}