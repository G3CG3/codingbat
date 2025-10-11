package recursion1;

/**
 * ChangePi - CodingBat Recursion-1
 *
 * Recursively replaces all occurrences of "pi" with "3.14" in a string.
 */
public class ChangePi {

    /**
     * Recursively replaces all "pi" with "3.14" in the input string.
     *
     * @param str input string
     * @return new string with "pi" replaced by "3.14"
     */
    public String changePi(String str) {
        // Base case: string shorter than 2 cannot contain "pi"
        if (str.length() < 2) return str;

        if (str.startsWith("pi")) {
            return "3.14" + changePi(str.substring(2)); // Replace "pi" and recurse
        } else {
            return str.charAt(0) + changePi(str.substring(1)); // Keep first char and recurse
        }
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ChangePi cp = new ChangePi();
        System.out.println(cp.changePi("xpix"));      // x3.14x
        System.out.println(cp.changePi("pipi"));      // 3.143.14
        System.out.println(cp.changePi("pip"));       // 3.14p
        System.out.println(cp.changePi("hello"));     // hello
    }
}
