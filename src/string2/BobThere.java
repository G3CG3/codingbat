package string2;

/**
 * BobThere - CodingBat String-2
 *
 * Return true if the given string contains a "bob" string,
 * but where the middle 'o' char can be any char.
 *
 * Examples:
 * bobThere("abcbob") → true
 * bobThere("b9b") → true
 * bobThere("bac") → false
 */
public class BobThere {

    /**
     * Checks if "bob" pattern exists with any middle character.
     *
     * @param str the input string
     * @return true if such a pattern exists
     */
    public boolean bobThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        BobThere bt = new BobThere();
        System.out.println(bt.bobThere("abcbob"));  // true
        System.out.println(bt.bobThere("b9b"));     // true
        System.out.println(bt.bobThere("bac"));     // false
    }
}
