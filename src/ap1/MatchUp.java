package ap1;

/**
 * MatchUp - CodingBat AP-1
 *
 * Given 2 arrays of the same length containing strings, compares elements at
 * the same index and counts how many pairs are non-empty and start with
 * the same character.
 */
public class MatchUp {

    /**
     * Counts how many string pairs at matching indices are non-empty
     * and start with the same character.
     *
     * @param a first array of strings
     * @param b second array of strings (same length as a)
     * @return number of matching pairs that start with the same char
     */
    public int matchUp(String[] a, String[] b) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > 0 && b[i].length() > 0 &&
                    a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }

        return count;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MatchUp mu = new MatchUp();

        String[] a = {"aa", "bb", "cc"};
        String[] b = {"aaa", "xx", "bb"};
        System.out.println(mu.matchUp(a, b)); // Output: 1

        String[] a2 = {"aa", "bb", "cc"};
        String[] b2 = {"aaa", "b", "bb"};
        System.out.println(mu.matchUp(a2, b2)); // Output: 2
    }
}
