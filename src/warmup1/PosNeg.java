package warmup1;

/**
 * PosNeg - CodingBat Warmup-1
 *
 * Given two int values, return true if one is negative and one is positive.
 * Except if the parameter "negative" is true, then return true only if both are negative.
 */
public class PosNeg {

    /**
     * Returns true based on the signs of a and b, and the negative flag.
     *
     * @param a first integer
     * @param b second integer
     * @param negative if true, return true only if both are negative
     * @return true based on the rules described
     */
    public boolean posNeg(int a, int b, boolean negative) {
        return (negative && a < 0 && b < 0) || (!negative && a * b < 0);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        PosNeg pn = new PosNeg();
        System.out.println(pn.posNeg(1, -1, false));  // true
        System.out.println(pn.posNeg(-1, 1, false));  // true
        System.out.println(pn.posNeg(-4, -5, true));  // true
        System.out.println(pn.posNeg(-4, -5, false)); // false
        System.out.println(pn.posNeg(1, 2, false));   // false
    }
}
