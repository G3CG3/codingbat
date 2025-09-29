package warmup1;

/**
 * MissingChar - CodingBat Warmup-1
 *
 * Given a non-empty string and an int n, return a new string where the char
 * at index n has been removed. The value of n will be a valid index of a char
 * in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
 */
public class MissingChar {

    /**
     * Returns a new string with the character at index n removed.
     *
     * @param str input string
     * @param n index of the character to remove
     * @return string with character at n removed
     */
    public String missingChar(String str, int n) {
        String prefix = str.substring(0, n);
        String suffix = str.substring(n + 1);
        return prefix + suffix;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MissingChar mc = new MissingChar();
        System.out.println(mc.missingChar("kitten", 1)); // "ktten"
        System.out.println(mc.missingChar("kitten", 0)); // "itten"
        System.out.println(mc.missingChar("kitten", 4)); // "kittn"
    }
}
