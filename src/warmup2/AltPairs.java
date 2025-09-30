package warmup2;

/**
 * AltPairs - CodingBat Warmup-2
 *
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
 * For example, "kittens" yields "kien".
 */
public class AltPairs {

    /**
     * Returns a string consisting of chars at positions 0,1,4,5,8,9,... from the input string.
     *
     * @param str input string
     * @return string made of selected characters
     */
    public String altPairs(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            sb.append(str.charAt(i));
            if (i + 1 < str.length()) {
                sb.append(str.charAt(i + 1));
            }
        }
        return sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        AltPairs ap = new AltPairs();
        System.out.println(ap.altPairs("kittens"));    // "kien"
        System.out.println(ap.altPairs("Chocolate"));  // "Chole"
        System.out.println(ap.altPairs("CodingBat"));  // "CoB"
        System.out.println(ap.altPairs(""));           // ""
    }
}
