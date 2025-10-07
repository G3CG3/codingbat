package string2;

/**
 * sameStarChar - CodingBat String-2
 *
 * Returns true if for every '*' in the string, if there are chars
 * immediately before and after the star, they are the same.
 */
public class SameStarChar {

    /**
     * Checks if every '*' has identical neighboring chars.
     *
     * @param str the input string
     * @return true if all stars have matching neighbors, false otherwise
     */
    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        SameStarChar s = new SameStarChar();
        System.out.println(s.sameStarChar("xy*yzz"));   // false
        System.out.println(s.sameStarChar("xy*yx"));    // true
        System.out.println(s.sameStarChar("xx*xx"));    // true
        System.out.println(s.sameStarChar("*xa*"));     // true
    }
}
