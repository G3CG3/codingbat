package recursion1;

/**
 * NoX - CodingBat Recursion-1
 *
 * Recursively removes all 'x' characters from a string.
 */
public class NoX {

    /**
     * Recursively removes all 'x' characters from the input string.
     *
     * @param str input string
     * @return new string without any 'x' characters
     */
    public String noX(String str) {
        // Base case: empty string
        if (str.isEmpty()) return str;

        if (str.charAt(0) == 'x') {
            // Skip 'x' and recurse on the rest
            return noX(str.substring(1));
        } else {
            // Keep first character and recurse
            return str.charAt(0) + noX(str.substring(1));
        }
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NoX nx = new NoX();
        System.out.println(nx.noX("xaxb"));    // ab
        System.out.println(nx.noX("abc"));     // abc
        System.out.println(nx.noX("xx"));      // (empty string)
        System.out.println(nx.noX(""));        // (empty string)
    }
}
