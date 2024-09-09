/*
 * Solve the FizzBuzz challenge.
*/

class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 100) {
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean DivideBy3 = i % 3 == 0;
        boolean DivideBy5 = i % 5 == 0;
        if (DivideBy3 && DivideBy5) {
            System.out.println("FizzBuzz");
        } else if (DivideBy3) {
            System.out.println("Fizz");
        } else if (DivideBy5) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
        i++;
        return i;
    }


    private static void extracted() {
        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
    }
}