package string1;

/**
 * DeFront - CodingBat String-1
 *
 * Given a string, return a version without the first 2 chars.
 * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
 * The string may be any length.
 */
public class DeFront {

    /**
     * Removes the first 2 chars, conditionally keeping 'a' and 'b'.
     *
     * @param str input string
     * @return modified string according to the rules
     */
    public String deFront(String str) {
        StringBuilder sb = new StringBuilder();

        if (str.length() > 0 && str.charAt(0) == 'a') {
            sb.append('a');
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            sb.append('b');
        }
        if (str.length() > 2) {
            sb.append(str.substring(2));
        }

        return sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        DeFront df = new DeFront();
        System.out.println(df.deFront("Hello")); // llo
        System.out.println(df.deFront("java"));  // va
        System.out.println(df.deFront("away"));  // away
        System.out.println(df.deFront("abacus")); // abacus
        System.out.println(df.deFront("b"));     // b
        System.out.println(df.deFront(""));      // ""
    }
}
