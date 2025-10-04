package logic1;

/**
 * LessBy10 - CodingBat Logic-1
 *
 * Given three ints, a, b, c, return true if one of them is 10 or more
 * less than one of the others.
 */
public class LessBy10 {

    /**
     * Checks if any number is 10 or more less than any other number.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return true if one number is 10 or more less than another
     */
    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        LessBy10 lb = new LessBy10();
        System.out.println(lb.lessBy10(1, 7, 11)); // true
        System.out.println(lb.lessBy10(1, 7, 10)); // true
        System.out.println(lb.lessBy10(1, 7, 8));  // false
    }
}