package string1;

/**
 * Right2 - CodingBat String-1
 *
 * Given a string, return a "rotated right 2" version where the last 2 chars
 * are moved to the start. The string length will be at least 2.
 */
public class Right2 {

    /**
     * Rotates the string right by 2 characters.
     *
     * @param str input string (length ≥ 2)
     * @return rotated string
     */
    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Right2 r2 = new Right2();
        System.out.println(r2.right2("Hello")); // loHel
        System.out.println(r2.right2("java"));  // vaja
        System.out.println(r2.right2("Hi"));    // Hi
    }
}
