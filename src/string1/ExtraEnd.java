package string1;

/**
 * ExtraEnd - CodingBat String-1
 *
 * Given a string, return a new string made of 3 copies
 * of the last 2 chars of the original string.
 * The string length will be at least 2.
 */
public class ExtraEnd {

    /**
     * Returns 3 copies of the last 2 characters of the input string.
     *
     * @param str input string (length >= 2)
     * @return string with last 2 chars repeated 3 times
     */
    public String extraEnd(String str) {
        String last2 = str.substring(str.length() - 2);
        return last2 + last2 + last2;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ExtraEnd ee = new ExtraEnd();
        System.out.println(ee.extraEnd("Hello")); // lololo
        System.out.println(ee.extraEnd("ab"));    // ababab
        System.out.println(ee.extraEnd("Hi"));    // HiHiHi
    }
}
