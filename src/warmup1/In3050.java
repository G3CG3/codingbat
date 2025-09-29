package warmup1;

/**
 * In3050 - CodingBat Warmup-1
 *
 * Given 2 int values, return true if they are both in the range 30..40 inclusive,
 * or they are both in the range 40..50 inclusive.
 */
public class In3050 {

    /**
     * Checks if both integers are in the same range: 30..40 or 40..50.
     *
     * @param a first integer
     * @param b second integer
     * @return true if both are in 30..40 or both in 40..50
     */
    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
                ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        In3050 test = new In3050();
        System.out.println(test.in3050(30, 40)); // true
        System.out.println(test.in3050(40, 50)); // true
        System.out.println(test.in3050(35, 45)); // false
        System.out.println(test.in3050(31, 41)); // false
    }
}
