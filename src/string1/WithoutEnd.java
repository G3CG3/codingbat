package string1;

/**
 * WithoutEnd - CodingBat String-1
 *
 * Given a string, return a version without the first and last char,
 * so "Hello" yields "ell". The string length will be at least 2.
 */
public class WithoutEnd {

    /**
     * Removes the first and last characters from the given string.
     *
     * @param str input string of length at least 2
     * @return string without the first and last characters
     */
    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        WithoutEnd we = new WithoutEnd();
        System.out.println(we.withoutEnd("Hello")); // ell
        System.out.println(we.withoutEnd("java"));  // av
        System.out.println(we.withoutEnd("coding"));// odin
    }
}
