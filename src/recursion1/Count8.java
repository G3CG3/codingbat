package recursion1;

/**
 * Count8 - CodingBat Recursion-1
 *
 * Given a non-negative integer n, return the count of the occurrences of 8 as a digit,
 * with the twist that an 8 with another 8 immediately to its left counts double.
 * Example: 8818 yields 4.
 */
public class Count8 {

    /**
     * Recursively counts 8s in n with the "double if consecutive" rule.
     *
     * @param n non-negative integer
     * @return count of 8s (with consecutive 8s counted double)
     */
    public int count8(int n) {
        if (n == 0) return 0; // Base case: no digits left

        int lastDigit = n % 10;
        int secondLastDigit = (n / 10) % 10;

        if (lastDigit == 8) {
            if (secondLastDigit == 8) {
                return 2 + count8(n / 10); // Consecutive 8, count double
            } else {
                return 1 + count8(n / 10); // Single 8
            }
        } else {
            return count8(n / 10); // Not 8
        }
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Count8 c8 = new Count8();
        System.out.println(c8.count8(8818));  // 4
        System.out.println(c8.count8(8088));  // 4
        System.out.println(c8.count8(123));   // 0
    }
}
