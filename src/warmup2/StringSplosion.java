package warmup2;

/**
 * StringSplosion - CodingBat Warmup-2
 *
 * Given a non-empty string like "Code", return a string like "CCoCodCode".
 */
public class StringSplosion {

    /**
     * Returns a "splosion" string: for "Code" returns "CCoCodCode".
     *
     * @param str input string (non-empty)
     * @return concatenated string of incremental prefixes
     */
    public String stringSplosion(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= str.length(); i++) {
            sb.append(str.substring(0, i));
        }
        return sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        StringSplosion ss = new StringSplosion();
        System.out.println(ss.stringSplosion("Code")); // "CCoCodCode"
        System.out.println(ss.stringSplosion("abc"));  // "aababc"
        System.out.println(ss.stringSplosion("X"));    // "X"
        System.out.println(ss.stringSplosion(""));     // ""
    }
}
