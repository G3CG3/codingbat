package warmup2;

/**
 * FrontTimes - CodingBat Warmup-2
 *
 * Given a string and a non-negative int n, we'll say that the front of the string
 * is the first 3 chars, or whatever is there if the string is less than length 3.
 * Return n copies of the front.
 */
public class FrontTimes {

    /**
     * Returns n copies of the "front" of the string (first 3 chars, or less if shorter).
     *
     * @param str input string
     * @param n   number of copies (non-negative)
     * @return concatenated string of n copies of the front
     */
    public String frontTimes(String str, int n) {
        String front = str.length() < 3 ? str : str.substring(0, 3);
        return front.repeat(Math.max(0, n));
    }

    // Before Java 11+
    /*
    public String frontTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (str.length() < 3) {
                sb.append(str);
            } else {
                sb.append(str.substring(0, 3));
            }
        }
        return sb.toString();
    }
    */

    // Optional: main() for testing
    public static void main(String[] args) {
        FrontTimes ft = new FrontTimes();
        System.out.println(ft.frontTimes("Chocolate", 2)); // "ChoCho"
        System.out.println(ft.frontTimes("Chocolate", 3)); // "ChoChoCho"
        System.out.println(ft.frontTimes("Abc", 3));       // "AbcAbcAbc"
        System.out.println(ft.frontTimes("Hi", 4));        // "HiHiHiHi"
    }
}
