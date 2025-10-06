package logic2;

/**
 * LuckySum - CodingBat Logic-2
 *
 * Given 3 int values, a, b, and c, return their sum.
 * However, if one of the values is 13, it does not count towards the sum
 * and the values to its right also do not count.
 * For example:
 *   - luckySum(1, 2, 3) → 6
 *   - luckySum(1, 2, 13) → 3
 *   - luckySum(1, 13, 3) → 1
 *   - luckySum(13, 2, 3) → 0
 */
public class LuckySum {

    /**
     * Returns the sum of a, b, and c following the "13 stops counting" rule.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return adjusted sum based on the position of 13
     */
    public int luckySum(int a, int b, int c) {
        if (a == 13)
            return 0;
        if (b == 13)
            return a;
        if (c == 13)
            return a + b;
        return a + b + c;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        LuckySum ls = new LuckySum();
        System.out.println(ls.luckySum(1, 2, 3));   // 6
        System.out.println(ls.luckySum(1, 2, 13));  // 3
        System.out.println(ls.luckySum(1, 13, 3));  // 1
        System.out.println(ls.luckySum(13, 2, 3));  // 0
    }
}
