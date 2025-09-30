package warmup2;

/**
 * StringBits - CodingBat Warmup-2
 *
 * Given a string, return a new string made of every other char starting with the first.
 * For example, "Hello" yields "Hlo".
 */
public class StringBits {

    /**
     * Returns a string consisting of every other character from the input string, starting at index 0.
     *
     * @param str input string
     * @return string made of every other char
     */
    public String stringBits(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        StringBits sb = new StringBits();
        System.out.println(sb.stringBits("Hello"));   // "Hlo"
        System.out.println(sb.stringBits("Hi"));      // "H"
        System.out.println(sb.stringBits("abcdefg")); // "aceg"
        System.out.println(sb.stringBits(""));        // ""
    }
}
