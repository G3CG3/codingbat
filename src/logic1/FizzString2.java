package logic1;

/**
 * FizzString2 - CodingBat Logic-1
 *
 * Given an int n, return the string form of the number followed by "!".
 * - If n is divisible by 3, use "Fizz" instead of the number.
 * - If n is divisible by 5, use "Buzz" instead of the number.
 * - If n is divisible by both 3 and 5, use "FizzBuzz".
 */
public class FizzString2 {

    /**
     * Returns "Fizz!", "Buzz!", "FizzBuzz!" or the number followed by "!" based on divisibility rules.
     *
     * @param n the input number
     * @return the corresponding FizzBuzz string
     */
    public String fizzString2(int n) {
        if (n % 15 == 0) return "FizzBuzz!";
        if (n % 3 == 0) return "Fizz!";
        if (n % 5 == 0) return "Buzz!";
        return n + "!";
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        FizzString2 fs2 = new FizzString2();
        System.out.println(fs2.fizzString2(1));   // 1!
        System.out.println(fs2.fizzString2(3));   // Fizz!
        System.out.println(fs2.fizzString2(5));   // Buzz!
        System.out.println(fs2.fizzString2(15));  // FizzBuzz!
    }
}
