package warmup1;

/**
 * EndUp - CodingBat Warmup-1
 *
 * Given a string, return a new string where the last 3 chars are now in upper case.
 * If the string has less than 3 chars, uppercase whatever is there.
 */
public class EndUp {

    /**
     * Converts the last 3 characters of the string to uppercase, or all if length < 3.
     *
     * @param str input string
     * @return string with last 3 chars in uppercase
     */
    public String endUp(String str) {
        if (str.length() < 3) return str.toUpperCase();
        return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        EndUp eu = new EndUp();
        System.out.println(eu.endUp("hello"));   // "heLLO"
        System.out.println(eu.endUp("hi"));      // "HI"
        System.out.println(eu.endUp("kitten"));  // "kitTEN"
        System.out.println(eu.endUp("a"));       // "A"
    }
}
