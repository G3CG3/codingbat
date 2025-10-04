package logic1;

/**
 * Love6 - CodingBat Logic-1
 *
 * The number 6 is a truly great number.
 * Given two int values, a and b, return true if either one is 6,
 * or if their sum or absolute difference is 6.
 */
public class Love6 {

    /**
     * Returns true if either a or b is 6, or if their sum/difference is 6.
     *
     * @param a first integer
     * @param b second integer
     * @return true if the condition involving 6 is satisfied
     */
    public boolean love6(int a, int b) {
        return (a == 6 || b == 6 || Math.abs(a - b) == 6 || a + b == 6);
    }

    // Optional main for quick testing
    public static void main(String[] args) {
        Love6 l6 = new Love6();
        System.out.println(l6.love6(6, 4));  // true
        System.out.println(l6.love6(4, 5));  // false
        System.out.println(l6.love6(1, 5));  // true
    }
}
