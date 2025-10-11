package recursion1;

/**
 * CountAbc - CodingBat Recursion-1
 *
 * Recursively counts the number of "abc" and "aba" substrings in a string.
 * Overlapping substrings are allowed.
 */
public class CountAbc {

    /**
     * Recursively counts "abc" and "aba" substrings in the string.
     *
     * @param str input string
     * @return total count of "abc" and "aba"
     */
    public int countAbc(String str) {
        // Base case: if string has fewer than 3 characters, no match is possible
        if (str.length() < 3) return 0;

        // If the first 3 characters match "abc" or "aba", count 1 and skip 2 characters
        if (str.startsWith("abc") || str.startsWith("aba")) {
            return 1 + countAbc(str.substring(2));
        }

        // Otherwise, move forward 1 character and continue recursion
        return countAbc(str.substring(1));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CountAbc ca = new CountAbc();
        System.out.println(ca.countAbc("abc"));       // 1
        System.out.println(ca.countAbc("abcabc"));    // 2
        System.out.println(ca.countAbc("ababc"));     // 2
        System.out.println(ca.countAbc("ababa"));     // 2
        System.out.println(ca.countAbc("abcd"));      // 1
    }
}
