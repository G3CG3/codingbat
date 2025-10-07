package string2;

/**
 * oneTwo - CodingBat String-2
 *
 * Given a string, compute a new string by moving the first char
 * to come after the next two chars, so "abc" yields "bca".
 * Repeat this process for each subsequent group of 3 chars,
 * ignoring any group of fewer than 3 chars at the end.
 */
public class OneTwo {

    /**
     * Rearranges groups of 3 chars by moving the first char to the end.
     *
     * @param str the input string
     * @return the transformed string
     */
    public String oneTwo(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() - 2; i += 3) {
            sb.append(str.charAt(i + 1))
                    .append(str.charAt(i + 2))
                    .append(str.charAt(i));
        }

        return sb.toString();
    }

    // Optional: main() for local testing
    public static void main(String[] args) {
        OneTwo o = new OneTwo();
        System.out.println(o.oneTwo("abc"));      // "bca"
        System.out.println(o.oneTwo("abcdef"));   // "bcaefd"
        System.out.println(o.oneTwo("abcdefg"));  // "bcaefd"
        System.out.println(o.oneTwo("ab"));       // ""
    }
}
