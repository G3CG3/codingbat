package recursion1;

/**
 * CountX - CodingBat Recursion-1
 *
 * Recursively counts the number of lowercase 'x' chars in a string.
 */
public class CountX {

    /**
     * Recursively counts 'x' characters in the string.
     *
     * @param str input string
     * @return number of 'x' characters
     */
    public int countX(String str) {
        if (str.isEmpty()) return 0; // Base case: empty string
        if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1)); // Count 'x' and recurse
        }
        return countX(str.substring(1)); // Recurse without counting
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CountX cx = new CountX();
        System.out.println(cx.countX("xxhixx")); // 4
        System.out.println(cx.countX("xhixhix")); // 3
        System.out.println(cx.countX("hi"));      // 0
    }
}
