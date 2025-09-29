package warmup1;

/**
 * Makes10 - CodingBat Warmup-1
 *
 * Given 2 int values, return true if one of them is 10
 * or if their sum is 10.
 */
public class Makes10 {

    /**
     * Returns true if either a or b is 10, or if their sum is 10.
     *
     * @param a first integer
     * @param b second integer
     * @return true if one is 10 or sum is 10
     */
    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || (a + b == 10);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Makes10 m = new Makes10();
        System.out.println(m.makes10(9, 10));  // true
        System.out.println(m.makes10(9, 9));   // false
        System.out.println(m.makes10(1, 9));   // true
        System.out.println(m.makes10(10, 10)); // true
    }
}
