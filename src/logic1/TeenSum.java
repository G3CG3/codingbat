package logic1;

/**
 * TeenSum - CodingBat Logic-1
 *
 * Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive
 * are extra lucky. So if either value is a teen, just return 19.
 */
public class TeenSum {

    /**
     * Returns the sum of a and b, unless either is a teen (13..19), in which case returns 19.
     *
     * @param a first integer
     * @param b second integer
     * @return sum or 19 if either is a teen
     */
    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19))
            return 19;
        return a + b;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        TeenSum ts = new TeenSum();
        System.out.println(ts.teenSum(3, 4));    // 7
        System.out.println(ts.teenSum(10, 13));  // 19
        System.out.println(ts.teenSum(13, 2));   // 19
        System.out.println(ts.teenSum(19, 19));  // 19
    }
}
