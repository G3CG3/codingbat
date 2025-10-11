package recursion1;

/**
 * Count11 - CodingBat Recursion-1
 *
 * Recursively counts the number of "11" substrings in a string.
 * Overlapping substrings are not counted.
 */
public class Count11 {

    /**
     * Recursively counts non-overlapping "11" substrings.
     *
     * @param str input string
     * @return number of "11" substrings
     */
    public int count11(String str) {
        // Base case: if string has fewer than 2 characters, no match is possible
        if (str.length() < 2) return 0;

        // If first two characters are "11", count 1 and skip 2 characters
        if (str.charAt(0) == '1' && str.charAt(1) == '1') {
            return 1 + count11(str.substring(2));
        }

        // Otherwise, move forward 1 character and continue recursion
        return count11(str.substring(1));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Count11 c11 = new Count11();
        System.out.println(c11.count11("11"));        // 1
        System.out.println(c11.count11("111"));       // 1
        System.out.println(c11.count11("1111"));      // 2
        System.out.println(c11.count11("1"));         // 0
        System.out.println(c11.count11(""));          // 0
        System.out.println(c11.count11("10111"));     // 1
    }
}
