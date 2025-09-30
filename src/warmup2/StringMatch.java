package warmup2;

/**
 * StringMatch - CodingBat Warmup-2
 *
 * Given 2 strings, a and b, return the number of the positions where they contain
 * the same length 2 substring.
 * For example, "xxcaazz" and "xxbaaz" yields 3.
 */
public class StringMatch {

    /**
     * Counts the number of positions with matching length-2 substrings in both strings.
     *
     * @param a first input string
     * @param b second input string
     * @return number of matching positions
     */
    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        StringMatch sm = new StringMatch();
        System.out.println(sm.stringMatch("xxcaazz", "xxbaaz")); // 3
        System.out.println(sm.stringMatch("abc", "abc"));       // 2
        System.out.println(sm.stringMatch("abc", "axc"));       // 0
        System.out.println(sm.stringMatch("a", "a"));           // 0
    }
}
