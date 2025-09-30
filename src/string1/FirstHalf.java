package string1;

/**
 * FirstHalf - CodingBat String-1
 *
 * Given a string of even length, return the first half.
 * So the string "WooHoo" yields "Woo".
 */
public class FirstHalf {

    /**
     * Returns the first half of the input string.
     * Assumes the string length is even.
     *
     * @param str input string of even length
     * @return first half of the string
     */
    public String firstHalf(String str) {
        int half = str.length() / 2;
        return str.substring(0, half);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        FirstHalf fh = new FirstHalf();
        System.out.println(fh.firstHalf("WooHoo")); // Woo
        System.out.println(fh.firstHalf("Hello!")); // Hel
        System.out.println(fh.firstHalf("ABCD"));   // AB
    }
}
