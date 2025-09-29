package warmup1;

/**
 * Close10 - CodingBat Warmup-1
 *
 * Given 2 int values, return whichever value is nearest to the value 10,
 * or return 0 in the event of a tie. Note: Math.abs(n) returns the absolute value.
 */
public class Close10 {

    /**
     * Returns the number closest to 10, or 0 if there's a tie.
     *
     * @param a first integer
     * @param b second integer
     * @return integer closest to 10, or 0 if tied
     */
    public int close10(int a, int b) {
        int absA = Math.abs(10 - a);
        int absB = Math.abs(10 - b);
        if (absA == absB) return 0;
        return (absA < absB) ? a : b;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Close10 c = new Close10();
        System.out.println(c.close10(8, 13));  // 8
        System.out.println(c.close10(13, 8));  // 8
        System.out.println(c.close10(13, 7));  // 0
    }
}
