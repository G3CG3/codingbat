package string1;

/**
 * TheEnd - CodingBat String-1
 *
 * Given a string, return a string length 1 from its front,
 * unless front is false, in which case return a string length 1 from its back.
 * The string will be non-empty.
 */
public class TheEnd {

    /**
     * Returns the first or last character of the string based on the front flag.
     *
     * @param str   non-empty input string
     * @param front if true, return first character; if false, return last character
     * @return single-character string
     */
    public String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        TheEnd te = new TheEnd();
        System.out.println(te.theEnd("Hello", true));  // H
        System.out.println(te.theEnd("Hello", false)); // o
        System.out.println(te.theEnd("A", true));      // A
    }
}
