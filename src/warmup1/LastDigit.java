package warmup1;

/**
 * LastDigit - CodingBat Warmup-1
 *
 * Given two non-negative int values, return true if they have the same last digit.
 */
public class LastDigit {

    /**
     * Checks if two numbers have the same last digit.
     *
     * @param a first non-negative integer
     * @param b second non-negative integer
     * @return true if the last digits are the same
     */
    public boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        LastDigit ld = new LastDigit();
        System.out.println(ld.lastDigit(27, 57)); // true
        System.out.println(ld.lastDigit(7, 17));  // true
        System.out.println(ld.lastDigit(12, 23)); // false
        System.out.println(ld.lastDigit(0, 10));  // true
    }
}
