package logic1;

/**
 * SortaSum - CodingBat Logic-1
 *
 * Given 2 ints, a and b, return their sum.
 * However, sums in the range 10..19 inclusive are forbidden,
 * so in that case just return 20.
 */
public class SortaSum {

    /**
     * Returns the sum of two ints, unless the sum is between
     * 10 and 19 (inclusive), in which case it returns 20.
     *
     * @param a first integer
     * @param b second integer
     * @return sum of a and b, or 20 if the sum is in the forbidden range
     */
    public int sortaSum(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        SortaSum ss = new SortaSum();
        System.out.println(ss.sortaSum(3, 4));   // 7
        System.out.println(ss.sortaSum(9, 4));   // 20
        System.out.println(ss.sortaSum(10, 11)); // 21
    }
}
