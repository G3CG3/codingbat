package logic2;

/**
 * LoneSum - CodingBat Logic-2
 *
 * Given 3 int values, a, b, and c, return their sum.
 * However, if one of the values is the same as another of the values,
 * it does not count towards the sum.
 */
public class LoneSum {

    /**
     * Returns the sum of unique values among a, b, and c.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return the sum of distinct integers
     */
    public int loneSum(int a, int b, int c) {
        int sum = 0;

        if (a != b && a != c)
            sum += a;
        if (b != a && b != c)
            sum += b;
        if (c != a && c != b)
            sum += c;

        return sum;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        LoneSum ls = new LoneSum();
        System.out.println(ls.loneSum(1, 2, 3));  // 6
        System.out.println(ls.loneSum(3, 2, 3));  // 2
        System.out.println(ls.loneSum(3, 3, 3));  // 0
    }
}
