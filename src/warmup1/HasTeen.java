package warmup1;

/**
 * HasTeen - CodingBat Warmup-1
 *
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 3 int values, return true if 1 or more of them are teen.
 */
public class HasTeen {

    /**
     * Returns true if any of the three integers is a teen (13..19 inclusive).
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return true if at least one number is in the range 13..19
     */
    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19));
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        HasTeen ht = new HasTeen();
        System.out.println(ht.hasTeen(13, 20, 10)); // true
        System.out.println(ht.hasTeen(20, 19, 10)); // true
        System.out.println(ht.hasTeen(20, 10, 12)); // false
    }
}
