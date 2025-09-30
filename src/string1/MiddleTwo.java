package string1;

/**
 * MiddleTwo - CodingBat String-1
 *
 * Given a string of even length, return a string made of the middle two chars.
 * The string length will be at least 2.
 */
public class MiddleTwo {

    /**
     * Returns the middle two characters of an even-length string.
     *
     * @param str input string of even length (≥ 2)
     * @return string of the middle two characters
     */
    public String middleTwo(String str) {
        int l = str.length() / 2;
        return str.substring(l - 1, l + 1);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MiddleTwo mt = new MiddleTwo();
        System.out.println(mt.middleTwo("string")); // ri
        System.out.println(mt.middleTwo("code"));   // od
        System.out.println(mt.middleTwo("java"));   // av
    }
}
