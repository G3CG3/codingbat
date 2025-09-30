package string1;

/**
 * TwoChar - CodingBat String-1
 *
 * Given a string and an index, return a string length 2 starting at the given index.
 * If the index is too big or too small to define a string length 2, use the first 2 chars.
 * The string length will be at least 2.
 */
public class TwoChar {

    /**
     * Returns a substring of length 2 starting at the given index, or first 2 chars if out of bounds.
     *
     * @param str   input string (length ≥ 2)
     * @param index starting index
     * @return substring of length 2
     */
    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        TwoChar tc = new TwoChar();
        System.out.println(tc.twoChar("java", 0)); // ja
        System.out.println(tc.twoChar("java", 2)); // va
        System.out.println(tc.twoChar("java", 3)); // ja
        System.out.println(tc.twoChar("java", -1));// ja
    }
}
