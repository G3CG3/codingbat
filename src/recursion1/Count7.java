package recursion1;

/**
 * Count7 - CodingBat Recursion-1
 *
 * Given a non-negative integer n, return the count of the occurrences of 7 as a digit.
 * For example, 717 yields 2.
 *
 * Rules:
 * - No loops allowed.
 * - Use recursion and basic arithmetic:
 *   - n % 10 gives the rightmost digit.
 *   - n / 10 removes the rightmost digit.
 */
public class Count7 {

    /**
     * Recursively counts how many digits in n are equal to 7.
     *
     * @param n non-negative integer
     * @return count of 7 digits in n
     */
    public int count7(int n) {
        if (n == 0) return 0; // Base case: no digits left

        int lastDigit = n % 10;
        if (lastDigit == 7) {
            return 1 + count7(n / 10); // Found a 7
        } else {
            return count7(n / 10); // Skip non-7 digit
        }
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Count7 c7 = new Count7();
        System.out.println(c7.count7(717));  // 2
        System.out.println(c7.count7(7));    // 1
        System.out.println(c7.count7(123));  // 0
        System.out.println(c7.count7(7777)); // 4
    }
}
