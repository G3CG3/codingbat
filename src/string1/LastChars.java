package string1;

/**
 * LastChars - CodingBat String-1
 *
 * Given 2 strings, a and b, return a new string made of the first char of a and
 * the last char of b. If either string is empty, use '@' for its missing char.
 */
public class LastChars {

    /**
     * Returns a 2-character string made of the first char of a and last char of b.
     *
     * @param a first string
     * @param b second string
     * @return 2-character string
     */
    public String lastChars(String a, String b) {
        StringBuilder sb = new StringBuilder();

        if (!a.isEmpty()) {
            sb.append(a.charAt(0));
        } else {
            sb.append("@");
        }

        if (!b.isEmpty()) {
            sb.append(b.charAt(b.length() - 1));
        } else {
            sb.append("@");
        }

        return sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        LastChars lc = new LastChars();
        System.out.println(lc.lastChars("yo", "java")); // ya
        System.out.println(lc.lastChars("hi", ""));     // h@
        System.out.println(lc.lastChars("", "java"));   // @a
        System.out.println(lc.lastChars("", ""));       // @@
    }
}