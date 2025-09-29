package warmup1;

/**
 * BackAround - CodingBat Warmup-1
 *
 * Given a string, take the last char and return a new string with
 * the last char added at the front and back, so "cat" yields "tcatt".
 * The original string will be length 1 or more.
 */
public class BackAround {

    /**
     * Returns a new string with the last character added to the front and back.
     *
     * @param str input string
     * @return string with last character added at front and back
     */
    public String backAround(String str) {
        String lastChar = str.substring(str.length() - 1);
        return lastChar + str + lastChar;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        BackAround ba = new BackAround();
        System.out.println(ba.backAround("cat"));   // "tcatt"
        System.out.println(ba.backAround("Hello")); // "oHelloo"
        System.out.println(ba.backAround("a"));     // "aaa"
    }
}
