package warmup1;

/**
 * StartOz - CodingBat Warmup-1
 *
 * Given a string, return a string made of the first 2 chars (if present),
 * however include first char only if it is 'o' and include the second only if it is 'z'.
 * Example: "ozymandias" -> "oz".
 */
public class StartOz {

    /**
     * Returns a string containing 'o' if first char is 'o'
     * and 'z' if second char is 'z'.
     *
     * @param str input string
     * @return string made of first char 'o' and second char 'z' if present
     */
    public String startOz(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.isEmpty() && str.charAt(0) == 'o') sb.append('o');
        if (str.length() > 1 && str.charAt(1) == 'z') sb.append('z');
        return sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        StartOz sz = new StartOz();
        System.out.println(sz.startOz("ozymandias")); // "oz"
        System.out.println(sz.startOz("bzoo"));       // "z"
        System.out.println(sz.startOz("oxx"));        // "o"
        System.out.println(sz.startOz("abc"));        // ""
    }
}
