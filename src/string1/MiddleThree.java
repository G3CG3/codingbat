package string1;

/**
 * MiddleThree - CodingBat String-1
 *
 * Given a string of odd length, return the string length 3 from its middle.
 * The string length will be at least 3.
 */
public class MiddleThree {

    /**
     * Returns the middle three characters of a string with odd length.
     *
     * @param str input string of odd length (≥ 3)
     * @return substring of length 3 from the middle
     */
    public String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MiddleThree mt = new MiddleThree();
        System.out.println(mt.middleThree("Candy")); // and
        System.out.println(mt.middleThree("and"));   // and
        System.out.println(mt.middleThree("solving")); // lvi
    }
}
