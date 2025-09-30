package string1;

/**
 * NonStart - CodingBat String-1
 *
 * Given 2 strings, return their concatenation, except omit the first char of each.
 * The strings will be at least length 1.
 */
public class NonStart {

    /**
     * Returns the concatenation of a and b without their first characters.
     *
     * @param a first string (length ≥ 1)
     * @param b second string (length ≥ 1)
     * @return concatenated string without the first character of each input
     */
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        NonStart ns = new NonStart();
        System.out.println(ns.nonStart("Hello", "There")); // ellohere
        System.out.println(ns.nonStart("java", "code"));   // avaode
        System.out.println(ns.nonStart("shotl", "java"));  // hotlava
    }
}
