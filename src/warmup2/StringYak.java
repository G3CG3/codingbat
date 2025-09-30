package warmup2;

/**
 * StringYak - CodingBat Warmup-2
 *
 * Suppose the string "yak" is unlucky. Given a string, return a version where
 * all the "yak" are removed, but the middle character can be any char.
 * The "yak" strings will not overlap.
 */
public class StringYak {

    /**
     * Removes all "yak" patterns (y_anyChar_k) from the string.
     *
     * @param str input string
     * @return string with "yak" patterns removed
     */
    public String stringYak(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                // skip this "yak" pattern
                i += 3;
            } else {
                sb.append(str.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        StringYak sy = new StringYak();
        System.out.println(sy.stringYak("yakpak"));    // "pak"
        System.out.println(sy.stringYak("pakyak"));    // "pak"
        System.out.println(sy.stringYak("yak123yak")); // "123"
        System.out.println(sy.stringYak("yak"));       // ""
        System.out.println(sy.stringYak("abc"));       // "abc"
    }
}
