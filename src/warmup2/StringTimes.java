package warmup2;

/**
 * StringTimes - CodingBat Warmup-2
 *
 * Given a string and a non-negative int n, return a larger string that is n copies
 * of the original string.
 */
public class StringTimes {

    /**
     * Returns a string that is n copies of the original string.
     *
     * @param str input string
     * @param n   number of copies (non-negative)
     * @return concatenated string of n copies
     */
    public String stringTimes(String str, int n) {
        return str.repeat(Math.max(0, n));
    }


    // Before Java 11+

    /*
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
        sb.append(str);
    }
    return sb.toString();
    */

    // Optional: main() for testing
    public static void main(String[] args) {
        StringTimes st = new StringTimes();
        System.out.println(st.stringTimes("Hi", 2));   // "HiHi"
        System.out.println(st.stringTimes("Hi", 3));   // "HiHiHi"
        System.out.println(st.stringTimes("Hi", 1));   // "Hi"
    }
}
