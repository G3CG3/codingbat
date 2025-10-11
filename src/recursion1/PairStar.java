package recursion1;

/**
 * PairStar - CodingBat Recursion-1
 *
 * Recursively inserts a '*' between identical adjacent characters in a string.
 */
public class PairStar {

    /**
     * Recursively adds '*' between identical adjacent characters.
     *
     * @param str input string
     * @return new string with '*' inserted between identical adjacent chars
     */
    public String pairStar(String str) {
        // Base case: if the string has 0 or 1 character, nothing to insert
        if (str.length() < 2) return str;

        // If first two characters are the same, insert '*' between them
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }

        // Otherwise, no '*' needed between first two characters
        return str.charAt(0) + pairStar(str.substring(1));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        PairStar ps = new PairStar();
        System.out.println(ps.pairStar("hello")); // hel*lo
        System.out.println(ps.pairStar("xxyy"));  // x*xy*y
        System.out.println(ps.pairStar("aaaa"));  // a*a*a*a
        System.out.println(ps.pairStar("abc"));   // abc
    }
}
