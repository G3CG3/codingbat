package string2;

/**
 * XyzThere - CodingBat String-2
 *
 * Return true if the given string contains an appearance of "xyz" where the
 * "xyz" is not directly preceded by a period (.).
 *
 * Examples:
 * xyzThere("abcxyz") → true
 * xyzThere("abc.xyz") → false
 * xyzThere("xyz.abc") → true
 */
public class XyzThere {

    /**
     * Checks for "xyz" in the string not immediately preceded by a period.
     *
     * @param str the input string
     * @return true if such an "xyz" exists
     */
    public boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.startsWith("xyz", i)) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        XyzThere xt = new XyzThere();
        System.out.println(xt.xyzThere("abcxyz"));    // true
        System.out.println(xt.xyzThere("abc.xyz"));   // false
        System.out.println(xt.xyzThere("xyz.abc"));   // true
        System.out.println(xt.xyzThere("abcx.xyz"));  // false
    }
}
