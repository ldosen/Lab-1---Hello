package hw;

public class FizzBuzz {
    private static int max;

    public static void fizzBuzz(String arg) {
        if (arg.length() > 0) {
            try {
                max = Integer.parseInt(arg);
                if (max < 0) {
                    throw new Exception("Exception: negative number");
                }
                for (int i = 1; i <= max; i++) {
                    if ((i % 3 == 0) && (i % 5 == 0)) {
                        System.out.println("fizz buzz");
                    } else if (i % 3 == 0) {
                        System.out.println("fizz");
                    } else if (i % 5 == 0) {
                        System.out.println("buzz");
                    } else {
                        System.out.println(i);
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("The argument entered must be an integer");
                System.exit(1);
            } catch (Exception e) {
                System.err.println("The argument entered must be a natural number");
            }
        }
    }
}



