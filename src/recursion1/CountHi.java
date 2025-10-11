package recursion1;

/**
 * CountHi - CodingBat Recursion-1
 *
 * Recursively counts the number of times the lowercase "hi" appears in a string.
 */
public class CountHi {

    /**
     * Recursively counts "hi" substrings in the input string.
     *
     * @param str input string
     * @return number of times "hi" appears
     */
    public int countHi(String str) {
        if (str.length() < 2) return 0; // Base case: string too short for "hi"

        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2)); // Count "hi" and skip past it
        }
        return countHi(str.substring(1)); // Recurse on the rest of the string
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CountHi ch = new CountHi();
        System.out.println(ch.countHi("ahixhi")); // 2
        System.out.println(ch.countHi("ahibhi")); // 2
        System.out.println(ch.countHi("hihih"));  // 2
        System.out.println(ch.countHi("hello"));  // 0
    }
}
