package recursion1;

/**
 * StringClean - CodingBat Recursion-1
 *
 * Recursively "cleans" a string by removing adjacent duplicate characters.
 * For example, "yyzzza" → "yza".
 */
public class StringClean {

    /**
     * Recursively removes consecutive duplicate characters.
     *
     * @param str input string
     * @return cleaned string with no adjacent duplicates
     */
    public String stringClean(String str) {
        // Base case: if string has less than 2 characters, return as is
        if (str.length() < 2) return str;

        // If first two characters are the same, skip the first one
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }

        // Otherwise, keep the first character and recurse on the rest
        return str.charAt(0) + stringClean(str.substring(1));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        StringClean sc = new StringClean();
        System.out.println(sc.stringClean("yyzzza"));   // yza
        System.out.println(sc.stringClean("abbbcdd"));  // abcd
        System.out.println(sc.stringClean("a"));        // a
        System.out.println(sc.stringClean(""));         // (empty string)
        System.out.println(sc.stringClean("xxxyyy"));   // xy
    }
}
