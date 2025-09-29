package warmup1;

/**
 * Max1020 - CodingBat Warmup-1
 *
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
 * or return 0 if neither is in that range.
 */
public class Max1020 {

    /**
     * Returns the larger of two integers that is in the range 10..20, or 0 if neither.
     *
     * @param a first integer
     * @param b second integer
     * @return the larger number in range 10..20, or 0
     */
    public int max1020(int a, int b) {
        int max = 0;
        if (a >= 10 && a <= 20) max = a;
        if (b >= 10 && b <= 20) max = Math.max(b, max);
        return max;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Max1020 m = new Max1020();
        System.out.println(m.max1020(11, 19)); // 19
        System.out.println(m.max1020(19, 11)); // 19
        System.out.println(m.max1020(9, 21));  // 0
        System.out.println(m.max1020(10, 20)); // 20
    }
}
