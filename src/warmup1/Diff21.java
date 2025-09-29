package warmup1;

/**
 * Diff21 - CodingBat Warmup-1
 *
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 */
public class Diff21 {

    /**
     * Returns the absolute difference from 21,
     * doubled if n is greater than 21.
     *
     * @param n integer value
     * @return absolute difference or double if n > 21
     */
    public int diff21(int n) {
        int diff = Math.abs(n - 21);
        return n > 21 ? 2 * diff : diff;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Diff21 d = new Diff21();
        System.out.println(d.diff21(19));  // 2
        System.out.println(d.diff21(10));  // 11
        System.out.println(d.diff21(25));  // 8
        System.out.println(d.diff21(21));  // 0
    }
}
