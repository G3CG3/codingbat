package string1;

/**
 * HasBad - CodingBat String-1
 *
 * Given a string, return true if "bad" appears starting at index 0 or 1.
 * The string may be any length, including 0.
 */
public class HasBad {

    /**
     * Checks if "bad" appears at index 0 or 1 in the string.
     *
     * @param str input string
     * @return true if "bad" appears at index 0 or 1
     */
    public boolean hasBad(String str) {
        if (str.length() < 3) return false;

        // check at index 0
        if (str.substring(0, 3).equals("bad")) return true;

        // check at index 1 if length permits
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) return true;

        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        HasBad hb = new HasBad();
        System.out.println(hb.hasBad("badxx"));   // true
        System.out.println(hb.hasBad("xbadxx"));  // true
        System.out.println(hb.hasBad("xxbadxx")); // false
        System.out.println(hb.hasBad("ba"));      // false
    }
}
