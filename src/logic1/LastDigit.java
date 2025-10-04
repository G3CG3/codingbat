package logic1;

/**
 * LastDigit - CodingBat Logic-1
 *
 * Given three ints, a, b, c, return true if two or more of them have the same
 * rightmost digit. The ints are non-negative.
 *
 * The % "mod" operator computes the remainder, e.g., 17 % 10 is 7.
 */
public class LastDigit {

    /**
     * Checks if at least two numbers share the same rightmost digit.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return true if two or more numbers have the same rightmost digit
     */
    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        LastDigit ld = new LastDigit();
        System.out.println(ld.lastDigit(23, 19, 13)); // true (3 and 3)
        System.out.println(ld.lastDigit(23, 19, 12)); // false
        System.out.println(ld.lastDigit(11, 21, 31)); // true (all end with 1)
    }
}
