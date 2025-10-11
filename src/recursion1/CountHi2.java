package recursion1;

/**
 * CountHi2 - CodingBat Recursion-1
 *
 * Recursively counts the number of "hi" substrings in a string,
 * but does not count "hi" that are immediately preceded by 'x'.
 */
public class CountHi2 {

    /**
     * Returns the count of "hi" substrings, excluding those preceded by 'x'.
     *
     * @param str input string
     * @return count of valid "hi" occurrences
     */
    public int countHi2(String str) {
        // Base case: strings shorter than 2 cannot contain "hi"
        if (str.length() < 2) return 0;

        // If the string starts with "xhi", skip all 3 characters
        if (str.startsWith("xhi")) {
            return countHi2(str.substring(3));
        }

        // If the string starts with "hi", count it and move forward by 2
        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }

        // Otherwise, move forward by 1 and continue
        return countHi2(str.substring(1));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CountHi2 ch = new CountHi2();
        System.out.println(ch.countHi2("ahixhi"));   // 1 (second "hi" skipped)
        System.out.println(ch.countHi2("ahibhi"));   // 2
        System.out.println(ch.countHi2("xhixhi"));   // 0
        System.out.println(ch.countHi2("hihihi"));   // 3
        System.out.println(ch.countHi2("xhi"));      // 0
    }
}
