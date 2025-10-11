package recursion1;

/**
 * StrDist - CodingBat Recursion-1
 *
 * Given a string and a non-empty substring sub, compute recursively
 * the largest substring which starts and ends with sub and return its length.
 */
public class StrDist {

    /**
     * Recursively finds the length of the largest substring
     * that starts and ends with the given sub.
     *
     * @param str the input string
     * @param sub the substring to match at start and end
     * @return length of the largest substring starting and ending with sub
     */
    public int strDist(String str, String sub) {
        // Base case: if string shorter than sub, no valid substring
        if (str.length() < sub.length()) return 0;

        // If the string starts and ends with sub, return its length
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }

        // If it doesn't start with sub, remove first char and recurse
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        }

        // If it doesn't end with sub, remove last char and recurse
        return strDist(str.substring(0, str.length() - 1), sub);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        StrDist sd = new StrDist();
        System.out.println(sd.strDist("catcowcat", "cat"));  // 9
        System.out.println(sd.strDist("catcowcat", "cow"));  // 3
        System.out.println(sd.strDist("cccatcowcatxx", "cat")); // 9
        System.out.println(sd.strDist("xyx", "x"));          // 3
        System.out.println(sd.strDist("xyx", "y"));          // 1
        System.out.println(sd.strDist("hiHellohihihi", "hi")); // 13
    }
}
