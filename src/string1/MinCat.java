package string1;

/**
 * MinCat - CodingBat String-1
 *
 * Given two strings, append them together. If the strings are different lengths,
 * omit chars from the longer string so it matches the shorter string's length.
 */
public class MinCat {

    /**
     * Concatenates two strings, trimming the longer one to match the shorter's length.
     *
     * @param a first string
     * @param b second string
     * @return concatenated string with equal-length parts
     */
    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()) + b;
        }
        if (b.length() > a.length()) {
            return a + b.substring(b.length() - a.length());
        }
        return a + b;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MinCat mc = new MinCat();
        System.out.println(mc.minCat("Hello", "Hi"));     // loHi
        System.out.println(mc.minCat("Hi", "Hello"));     // Hiello
        System.out.println(mc.minCat("Hello", "Java"));   // elloJava
        System.out.println(mc.minCat("Hi", "Hi"));        // HiHi
    }
}
