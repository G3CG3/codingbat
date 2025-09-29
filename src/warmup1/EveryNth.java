package warmup1;

/**
 * EveryNth - CodingBat Warmup-1
 *
 * Given a non-empty string and an int N, return the string made starting with char 0,
 * and then every Nth char of the string.
 */
public class EveryNth {

    /**
     * Returns a string starting with char 0, then every Nth char.
     *
     * @param str input string
     * @param n   step value (1 or more)
     * @return string made from every Nth character
     */
    public String everyNth(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        EveryNth en = new EveryNth();
        System.out.println(en.everyNth("Miracle", 2)); // "Mrce"
        System.out.println(en.everyNth("abcdefg", 2)); // "aceg"
        System.out.println(en.everyNth("abcdefg", 3)); // "adg"
    }
}
