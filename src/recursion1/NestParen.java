package recursion1;

/**
 * NestParen - CodingBat Recursion-1
 *
 * Given a string, return true if it is a nesting of zero or more
 * pairs of parentheses, like "(())" or "((()))".
 *
 * Suggestion: check the first and last characters, and then
 * recursively process what's inside them.
 */
public class NestParen {

    /**
     * Recursively checks if the given string represents
     * properly nested parentheses.
     *
     * @param str the input string
     * @return true if the string is properly nested, false otherwise
     */
    public boolean nestParen(String str) {
        // Base case: empty string is valid
        if (str.isEmpty()) return true;

        // If first char is '(' and last char is ')', check inside recursively
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        }

        // Otherwise, not a valid nesting
        return false;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        NestParen np = new NestParen();
        System.out.println(np.nestParen("(())"));     // true
        System.out.println(np.nestParen("((()))"));   // true
        System.out.println(np.nestParen("(()"));      // false
        System.out.println(np.nestParen(")("));       // false
        System.out.println(np.nestParen(""));         // true
    }
}
