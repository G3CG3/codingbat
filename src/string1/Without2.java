package string1;

/**
 * Without2 - CodingBat String-1
 *
 * Given a string, if a length 2 substring appears at both its beginning and end,
 * return a string without the substring at the beginning.
 * The substring may overlap itself. Otherwise, return the original string unchanged.
 */
public class Without2 {

    /**
     * Removes the first 2 chars if they are the same as the last 2 chars.
     *
     * @param str input string
     * @return modified string without the first 2 chars if they match the last 2
     */
    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Without2 w2 = new Without2();
        System.out.println(w2.without2("HelloHe")); // lloHe
        System.out.println(w2.without2("HelloHi")); // HelloHi
        System.out.println(w2.without2("Hi"));      // ""
        System.out.println(w2.without2("H"));       // H
        System.out.println(w2.without2(""));        // ""
    }
}
