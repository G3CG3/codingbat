package recursion1;

/**
 * StrCount - CodingBat Recursion-1
 *
 * Given a string and a non-empty substring sub,
 * compute recursively the number of times that sub appears in the string,
 * without the substrings overlapping.
 */
public class StrCount {

    /**
     * Recursively counts the number of times sub appears in str,
     * without allowing overlaps.
     *
     * @param str the input string
     * @param sub the substring to count
     * @return number of non-overlapping occurrences of sub
     */
    public int strCount(String str, String sub) {
        // Base case: if string is shorter than sub, no matches
        if (str.length() < sub.length()) return 0;

        // If the string starts with sub, count 1 and skip sub.length() ahead
        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }

        // Otherwise, skip one character and continue searching
        return strCount(str.substring(1), sub);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        StrCount sc = new StrCount();
        System.out.println(sc.strCount("catcowcat", "cat"));   // 2
        System.out.println(sc.strCount("catcowcat", "cow"));   // 1
        System.out.println(sc.strCount("catcowcat", "dog"));   // 0
        System.out.println(sc.strCount("aaaa", "aa"));         // 2
        System.out.println(sc.strCount("xxaxxaxxaxx", "xx"));  // 3
    }
}
