package logic2;

/**
 * NoTeenSum - CodingBat Logic-2
 *
 * Given 3 int values, a, b, and c, return their sum.
 * However, if any of the values is a "teen" in the range 13..19 inclusive,
 * that value counts as 0 — except 15 and 16 do not count as teens.
 *
 * The helper method {@code fixTeen(int n)} is used to apply the teen rule.
 */
public class NoTeenSum {

    /**
     * Returns the sum of a, b, and c, applying the teen rule via fixTeen().
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return the adjusted sum with teens replaced by 0 (except 15 and 16)
     */
    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    /**
     * Returns the given integer, applying the teen rule:
     * values in the range 13..19 are replaced with 0, except 15 and 16.
     *
     * @param n the integer to check
     * @return n if not a "teen" (or is 15 or 16), otherwise 0
     */
    public int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        NoTeenSum nts = new NoTeenSum();
        System.out.println(nts.noTeenSum(1, 2, 3));    // 6
        System.out.println(nts.noTeenSum(2, 13, 1));   // 3
        System.out.println(nts.noTeenSum(2, 1, 14));   // 3
        System.out.println(nts.noTeenSum(2, 15, 14));  // 17
    }
}
