package warmup1;

/**
 * FrontBack - CodingBat Warmup-1
 *
 * Given a string, return a new string where the first and last chars have been exchanged.
 * The string will be at least length 1.
 */
public class FrontBack {

    /**
     * Returns a string with the first and last characters swapped.
     *
     * @param str input string
     * @return string with first and last characters exchanged
     */
    public String frontBack(String str) {
        if (str.length() <= 1) return str; // no change needed
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        String middle = str.substring(1, str.length() - 1);
        return last + middle + first;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        FrontBack fb = new FrontBack();
        System.out.println(fb.frontBack("code"));  // "eodc"
        System.out.println(fb.frontBack("a"));     // "a"
        System.out.println(fb.frontBack("ab"));    // "ba"
        System.out.println(fb.frontBack("abcde")); // "ebcda"
    }
}
