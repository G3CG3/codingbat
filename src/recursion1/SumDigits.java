package recursion1;

/**
 * SumDigits - CodingBat Recursion-1
 *
 * Given a non-negative integer n, return the sum of its digits recursively (no loops).
 * Note that:
 * - n % 10 gives the rightmost digit (e.g., 126 % 10 → 6)
 * - n / 10 removes the rightmost digit (e.g., 126 / 10 → 12)
 */
public class SumDigits {

    /**
     * Recursively returns the sum of the digits of n.
     *
     * @param n non-negative integer
     * @return sum of all digits in n
     */
    public int sumDigits(int n) {
        if (n < 10) return n; // Base case: single-digit number
        return (n % 10) + sumDigits(n / 10); // Recursive step
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        SumDigits sd = new SumDigits();
        System.out.println(sd.sumDigits(126)); // 9
        System.out.println(sd.sumDigits(49));  // 13
        System.out.println(sd.sumDigits(12));  // 3
        System.out.println(sd.sumDigits(0));   // 0
    }
}
