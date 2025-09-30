package string1;

/**
 * Left2 - CodingBat String-1
 *
 * Given a string, return a "rotated left 2" version where the first 2 chars
 * are moved to the end. The string length will be at least 2.
 */
public class Left2 {

    /**
     * Rotates the string left by 2 characters.
     *
     * @param str input string (length ≥ 2)
     * @return rotated string
     */
    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        Left2 l2 = new Left2();
        System.out.println(l2.left2("Hello")); // lloHe
        System.out.println(l2.left2("java"));  // vaja
        System.out.println(l2.left2("Hi"));    // Hi
    }
}
