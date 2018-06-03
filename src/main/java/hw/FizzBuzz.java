package hw;

public class FizzBuzz {
    private static int max;

    /**
     * Returns an array of Strings in the Fizz Buzz sequence.
     * The String arg is entered on the command line and must be a natural number.
     * @param arg a String entered on the command  line
     * @return an array of Strings in the Fizz Buzz sequence
     */

    public static String[] fizzBuzz(String arg) {
        if (arg.length() > 0) {
            try {
                max = Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.err.println("The argument entered must be an integer");
                System.exit(1);
            }
        }
        String[] fizzBuzzArray = null;
        try {
            fizzBuzzArray = new String[max];
        } catch (NegativeArraySizeException e) {
           throw new NegativeArraySizeException();
        }
        try {
            for (int i = 1; i <= max; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    fizzBuzzArray[i - 1] = "fizz buzz";
                } else if (i % 3 == 0) {
                    fizzBuzzArray[i - 1] = "fizz";
                } else if (i % 5 == 0) {
                    fizzBuzzArray[i - 1] = "buzz";
                } else {
                    fizzBuzzArray[i - 1] = String.valueOf(i);
                }
            }
        } catch (NullPointerException e) {
            System.err.println("fizzBuzzArray does not exist");
            System.exit(1);
        }
        return fizzBuzzArray;
    }
}



