package warmup1;

/**
 * StringE - CodingBat Warmup-1
 *
 * Return true if the given string contains between 1 and 3 'e' chars.
 */
public class StringE {

    /**
     * Checks if the string contains 1 to 3 'e' characters.
     *
     * @param str input string
     * @return true if number of 'e' chars is between 1 and 3
     */
    public boolean stringE(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'e') count++;
        }
        return count >= 1 && count <= 3;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        StringE se = new StringE();
        System.out.println(se.stringE("hello"));    // true
        System.out.println(se.stringE("heelele"));  // false
        System.out.println(se.stringE("hi"));       // false
        System.out.println(se.stringE("e"));        // true
    }
}
