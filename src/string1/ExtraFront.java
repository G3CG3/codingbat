package string1;

/**
 * ExtraFront - CodingBat String-1
 *
 * Given a string, return a new string made of 3 copies of the first 2 chars
 * of the original string. If the string has fewer than 2 chars, use whatever is there.
 */
public class ExtraFront {

    /**
     * Returns 3 copies of the first 2 chars of the given string.
     * If the string has fewer than 2 chars, repeats the whole string 3 times.
     *
     * @param str input string
     * @return new string with 3 copies of first 2 chars (or whole string if shorter)
     */
    public String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        String prefix = str.substring(0, 2);
        return prefix + prefix + prefix;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ExtraFront ef = new ExtraFront();
        System.out.println(ef.extraFront("Hello")); // HeHeHe
        System.out.println(ef.extraFront("ab"));    // ababab
        System.out.println(ef.extraFront("H"));     // HHH
        System.out.println(ef.extraFront(""));      // ""
    }
}
