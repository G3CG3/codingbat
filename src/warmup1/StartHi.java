package warmup1;

/**
 * StartHi - CodingBat Warmup-1
 *
 * Given a string, return true if the string starts with "hi" and false otherwise.
 */
public class StartHi {

    /**
     * Checks if a string starts with "hi".
     *
     * @param str input string
     * @return true if str starts with "hi", false otherwise
     */
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        StartHi s = new StartHi();
        System.out.println(s.startHi("hi there")); // true
        System.out.println(s.startHi("hi"));       // true
        System.out.println(s.startHi("hello"));    // false
        System.out.println(s.startHi("h"));        // false
    }
}
