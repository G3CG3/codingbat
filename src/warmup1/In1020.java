package warmup1;

/**
 * In1020 - CodingBat Warmup-1
 *
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 */
public class In1020 {

    /**
     * Checks if either integer is in the range 10..20 inclusive.
     *
     * @param a first integer
     * @param b second integer
     * @return true if a or b is between 10 and 20 (inclusive)
     */
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        In1020 i = new In1020();
        System.out.println(i.in1020(12, 99)); // true
        System.out.println(i.in1020(21, 12)); // true
        System.out.println(i.in1020(8, 99));  // false
    }
}
