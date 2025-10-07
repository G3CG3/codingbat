package string2;

/**
 * PrefixAgain - CodingBat String-2
 *
 * Given a string, consider the prefix string made of the first N chars of the string.
 * Return true if that prefix appears somewhere else in the string. Assume N >= 1.
 */
public class PrefixAgain {

    /**
     * Checks if the first n characters of str appear again later in the string.
     *
     * @param str the input string
     * @param n the length of the prefix to check
     * @return true if the prefix appears again, false otherwise
     */
    public boolean prefixAgain(String str, int n) {
        return str.substring(n).contains(str.substring(0, n));
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        PrefixAgain pa = new PrefixAgain();
        System.out.println(pa.prefixAgain("abXYabc", 1)); // true
        System.out.println(pa.prefixAgain("abXYabc", 2)); // true
        System.out.println(pa.prefixAgain("abXYabc", 3)); // false
    }
}
