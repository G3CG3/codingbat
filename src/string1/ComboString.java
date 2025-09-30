package string1;

/**
 * ComboString - CodingBat String-1
 *
 * Given 2 strings, a and b, return a string of the form short+long+short,
 * with the shorter string on the outside and the longer string on the inside.
 * The strings will not be the same length, but they may be empty (length 0).
 */
public class ComboString {

    /**
     * Returns the combination of the two strings in short+long+short form.
     *
     * @param a first string
     * @param b second string
     * @return a string in the form short+long+short
     */
    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        ComboString cs = new ComboString();
        System.out.println(cs.comboString("Hello", "hi")); // hiHellohi
        System.out.println(cs.comboString("hi", "Hello")); // hiHellohi
        System.out.println(cs.comboString("aaa", "b"));    // baaab
    }
}