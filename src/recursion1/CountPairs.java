package recursion1;

/**
 * CountPairs - CodingBat Recursion-1
 *
 * Recursively counts the number of "pairs" in a string.
 * A "pair" is two instances of a char separated by another char.
 * Overlapping pairs are allowed.
 */
public class CountPairs {

    /**
     * Recursively counts pairs in a string.
     *
     * @param str input string
     * @return number of pairs
     */
    public int countPairs(String str) {
        // Base case: if string has fewer than 3 chars, no pair is possible
        if (str.length() < 3) return 0;

        // If the first and third character match, count this pair
        if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        }

        // Otherwise, move forward one character and continue recursion
        return countPairs(str.substring(1));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CountPairs cp = new CountPairs();
        System.out.println(cp.countPairs("axa"));       // 1
        System.out.println(cp.countPairs("axax"));      // 2
        System.out.println(cp.countPairs("axaxax"));    // 3
        System.out.println(cp.countPairs("aaaa"));      // 2
        System.out.println(cp.countPairs("abc"));       // 0
    }
}
