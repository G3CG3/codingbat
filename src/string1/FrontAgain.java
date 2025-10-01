package string1;

/**
 * FrontAgain - CodingBat String-1
 *
 * Given a string, return true if the first 2 chars in the string also appear
 * at the end of the string, such as with "edited".
 */
public class FrontAgain {

    /**
     * Checks if the first 2 characters are the same as the last 2 characters.
     *
     * @param str input string
     * @return true if first 2 chars match last 2 chars, false otherwise
     */
    public boolean frontAgain(String str) {
        if (str.length() < 2) return false;
        return str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        FrontAgain fa = new FrontAgain();
        System.out.println(fa.frontAgain("edited")); // true
        System.out.println(fa.frontAgain("edit"));   // false
        System.out.println(fa.frontAgain("ee"));     // true
        System.out.println(fa.frontAgain("e"));      // false
        System.out.println(fa.frontAgain(""));       // false
    }
}