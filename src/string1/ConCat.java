package string1;

/**
 * ConCat - CodingBat String-1
 *
 * Given two strings, append them together and return the result. However,
 * if the concatenation creates a double-char, then omit one of the chars.
 * Example: "abc" and "cat" yields "abcat".
 */
public class ConCat {

    /**
     * Concatenates two strings, avoiding a duplicate char if the end of the first
     * and the beginning of the second are the same. Uses ternary operator for conciseness.
     *
     * @param a first string
     * @param b second string
     * @return concatenated string without double char
     */
    public String conCat(String a, String b) {
        return (a.isEmpty()) ? b
                : (b.isEmpty()) ? a
                : (a.charAt(a.length() - 1) == b.charAt(0))
                ? a + b.substring(1)
                : a + b;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ConCat cc = new ConCat();
        System.out.println(cc.conCat("abc", "cat")); // abcat
        System.out.println(cc.conCat("dog", "cat")); // dogcat
        System.out.println(cc.conCat("abc", ""));    // abc
        System.out.println(cc.conCat("", "cat"));    // cat
        System.out.println(cc.conCat("", ""));       // ""
    }
}
