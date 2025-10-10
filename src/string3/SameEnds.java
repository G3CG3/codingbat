package string3;

/**
 * sameEnds - CodingBat String-3
 *
 * Given a string, return the longest substring that appears at both
 * the beginning and end of the string without overlapping.
 *
 * Examples:
 * sameEnds("abXab") → "ab"
 * sameEnds("xx") → "x"
 * sameEnds("xxx") → "x"
 */

public class SameEnds {

    /**
     * Returns the longest substring that appears at both the start and end
     * of the given string, without overlapping.
     *
     * @param string the input string
     * @return the longest non-overlapping matching substring
     */
    public String sameEnds(String string) {
        int middle = string.length() / 2;

        // Start from the middle and move backwards to find the longest match
        for (int i = middle; i > 0; i--) {
            if (string.substring(0, i).equals(string.substring(string.length() - i))) {
                return string.substring(0, i);
            }
        }

        return "";
    }

    /**
     * Manual test cases for quick verification.
     */
    public static void main(String[] args) {
        SameEnds se = new SameEnds();
        System.out.println(se.sameEnds("abXab")); // → "ab"
        System.out.println(se.sameEnds("xx"));    // → "x"
        System.out.println(se.sameEnds("xxx"));   // → "x"
        System.out.println(se.sameEnds("abc"));   // → ""
    }
}
