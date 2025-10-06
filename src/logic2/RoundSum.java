package logic2;

/**
 * RoundSum - CodingBat Logic-2
 *
 * Given 3 int values, a, b, and c, return the sum of their rounded values.
 * Each value is rounded to the nearest multiple of 10:
 * - Round up if the rightmost digit is 5 or more.
 * - Round down if the rightmost digit is less than 5.
 *
 * Uses the helper method {@code round10(int num)} to avoid code repetition.
 */
public class RoundSum {

    /**
     * Returns the sum of the three integers after rounding each
     * to the nearest multiple of 10 using {@link #round10(int)}.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return the sum of rounded values
     */
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    /**
     * Rounds the given integer to the nearest multiple of 10.
     * Rounds up if the last digit is 5 or more; otherwise rounds down.
     *
     * @param num the integer to round
     * @return the rounded integer
     */
    public int round10(int num) {
        if (num % 10 < 5) {
            return num - (num % 10);
        }
        return num + (10 - num % 10);
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        RoundSum rs = new RoundSum();
        System.out.println(rs.roundSum(16, 17, 18)); // 60
        System.out.println(rs.roundSum(12, 13, 14)); // 30
        System.out.println(rs.roundSum(6, 4, 4));    // 10
    }
}
