package string2;

/**
 * XyzMiddle - CodingBat String-2
 *
 * Given a string, return true if "xyz" appears in the middle of the string.
 * The "middle" means the number of chars to the left and right of "xyz"
 * differ by at most one.
 */
public class XyzMiddle {

    /**
     * Checks if "xyz" appears in the middle of the string.
     *
     * @param str the input string
     * @return true if "xyz" is in the middle, false otherwise
     */
    public boolean xyzMiddle(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int before = i;
                int after = str.length() - (i + 3);
                if (Math.abs(before - after) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        XyzMiddle xm = new XyzMiddle();
        System.out.println(xm.xyzMiddle("AAxyzBB"));       // true
        System.out.println(xm.xyzMiddle("AxyzBB"));        // false
        System.out.println(xm.xyzMiddle("AxyzB"));         // true
        System.out.println(xm.xyzMiddle("xyz"));           // true
        System.out.println(xm.xyzMiddle("xyzAxyzBBB"));    // true
        System.out.println(xm.xyzMiddle("xyzAxyzBB"));     // false
    }
}
