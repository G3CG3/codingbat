package string1;

/**
 * EndsLy - CodingBat String-1
 *
 * Given a string, return true if it ends in "ly".
 */
public class EndsLy {

    /**
     * Checks if the input string ends with "ly".
     *
     * @param str input string
     * @return true if string ends with "ly", false otherwise
     */
    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        EndsLy el = new EndsLy();
        System.out.println(el.endsLy("oddly")); // true
        System.out.println(el.endsLy("y"));     // false
        System.out.println(el.endsLy("oddy"));  // false
    }
}
