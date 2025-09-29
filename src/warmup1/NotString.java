package warmup1;

/**
 * NotString - CodingBat Warmup-1
 *
 * Given a string, return a new string where "not " has been added to the front.
 * However, if the string already begins with "not", return the string unchanged.
 * Note: use .equals() to compare 2 strings.
 */
public class NotString {

    /**
     * Returns the string with "not " added to the front unless it already starts with "not".
     *
     * @param str input string
     * @return modified string according to the rules
     */
    public String notString(String str) {
        return str.startsWith("not") ? str : "not " + str;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NotString ns = new NotString();
        System.out.println(ns.notString("candy"));   // "not candy"
        System.out.println(ns.notString("x"));       // "not x"
        System.out.println(ns.notString("not bad")); // "not bad"
    }
}
