package recursion1;

/**
 * StrCopies - CodingBat Recursion-1
 *
 * Given a string and a non-empty substring sub, compute recursively
 * if at least n copies of sub appear in the string somewhere,
 * possibly with overlapping. N will be non-negative.
 */
public class StrCopies {

    /**
     * Recursively checks if the given string contains
     * at least n occurrences of the substring sub.
     *
     * @param str the input string
     * @param sub the substring to search for
     * @param n the number of required occurrences
     * @return true if at least n copies of sub appear, possibly overlapping
     */
    public boolean strCopies(String str, String sub, int n) {
        // Base case: if n == 0, found enough copies
        if (n == 0) return true;

        // If string is shorter than sub and n > 0, not enough room left
        if (str.length() < sub.length()) return false;

        // If the string starts with sub, reduce n and move one char forward
        if (str.startsWith(sub)) {
            return strCopies(str.substring(1), sub, n - 1);
        }

        // Otherwise, move one char forward without reducing n
        return strCopies(str.substring(1), sub, n);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        StrCopies sc = new StrCopies();
        System.out.println(sc.strCopies("catcowcat", "cat", 2));  // true
        System.out.println(sc.strCopies("catcowcat", "cow", 2));  // false
        System.out.println(sc.strCopies("catcowcat", "cow", 1));  // true
        System.out.println(sc.strCopies("iiiijj", "ii", 2));      // true
        System.out.println(sc.strCopies("iiiijj", "ii", 3));      // false
        System.out.println(sc.strCopies("iiiiij", "ii", 3));      // true
    }
}
