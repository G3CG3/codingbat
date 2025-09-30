package string1;

/**
 * WithoutEnd2 - CodingBat String-1
 *
 * Given a string, return a version without both the first and last char of the string.
 * The string may be any length, including 0.
 */
public class WithoutEnd2 {

    /**
     * Returns the string without the first and last characters.
     * If the string length is less than 3, returns an empty string.
     *
     * @param str input string
     * @return string without first and last characters or "" if too short
     */
    public String withouEnd2(String str) {
        if (str.length() < 3) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        WithoutEnd2 we2 = new WithoutEnd2();
        System.out.println(we2.withouEnd2("Hello")); // ell
        System.out.println(we2.withouEnd2("ab"));    // ""
        System.out.println(we2.withouEnd2("abc"));   // b
        System.out.println(we2.withouEnd2(""));      // ""
    }
}
