package logic2;

/**
 * CloseFar - CodingBat Logic-2
 *
 * Given three ints, a, b, and c, return true if one of b or c is "close"
 * (differing from a by at most 1), while the other is "far"
 * (differing from both other values by 2 or more).
 *
 * Example:
 * closeFar(1, 2, 10) → true
 * closeFar(1, 2, 3)  → false
 * closeFar(4, 1, 3)  → true
 */
public class CloseFar {

    /**
     * Determines if one of b or c is "close" to a, while the other is "far"
     * from both a and the "close" value.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return true if the condition of "close" and "far" holds, false otherwise
     */
    public boolean closeFar(int a, int b, int c) {
        boolean bClose = Math.abs(a - b) <= 1;
        boolean cClose = Math.abs(a - c) <= 1;
        boolean bFar = Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2;
        boolean cFar = Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2;

        return (bClose && cFar) || (cClose && bFar);
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        CloseFar cf = new CloseFar();
        System.out.println(cf.closeFar(1, 2, 10)); // true
        System.out.println(cf.closeFar(1, 2, 3));  // false
        System.out.println(cf.closeFar(4, 1, 3));  // true
    }
}
