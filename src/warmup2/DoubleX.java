package warmup2;

/**
 * DoubleX - CodingBat Warmup-2
 *
 * Given a string, return true if the first instance of "x" in the string
 * is immediately followed by another "x".
 */
public class DoubleX {

    /**
     * Checks if the first 'x' in the string is immediately followed by another 'x'.
     *
     * @param str input string
     * @return true if first 'x' is followed by another 'x', false otherwise
     */
    public boolean doubleX(String str) {
        int index = str.indexOf('x');
        return index != -1 && index < str.length() - 1 && str.charAt(index + 1) == 'x';
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        DoubleX dx = new DoubleX();
        System.out.println(dx.doubleX("axxbb"));  // true
        System.out.println(dx.doubleX("axaxax")); // false
        System.out.println(dx.doubleX("xxxxx"));  // true
        System.out.println(dx.doubleX(""));       // false
    }
}
