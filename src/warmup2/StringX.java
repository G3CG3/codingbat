package warmup2;

/**
 * StringX - CodingBat Warmup-2
 *
 * Given a string, return a version where all the "x" have been removed,
 * except an "x" at the very start or end should not be removed.
 */
public class StringX {

    /**
     * Removes all 'x' characters from the middle of the string,
     * leaving the first and last characters untouched.
     *
     * @param str input string
     * @return string with 'x' removed from the middle
     */
    public String stringX(String str) {
        if (str.length() <= 2) return str;

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0)); // keep first char

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                sb.append(str.charAt(i));
            }
        }

        sb.append(str.charAt(str.length() - 1)); // keep last char
        return sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        StringX sx = new StringX();
        System.out.println(sx.stringX("xxHxix")); // "xHix"
        System.out.println(sx.stringX("abxxxcd")); // "abcd"
        System.out.println(sx.stringX("x"));       // "x"
        System.out.println(sx.stringX(""));        // ""
    }
}