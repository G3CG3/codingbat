package string1;

/**
 * AtFirst - CodingBat String-1
 *
 * Given a string, return a string length 2 made of its first 2 chars.
 * If the string length is less than 2, use '@' for the missing chars.
 */
public class AtFirst {

    /**
     * Returns a string of length 2 from the start, using '@' if needed.
     *
     * @param str input string
     * @return string of length 2
     */
    public String atFirst(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            if (str.length() > i) {
                sb.append(str.charAt(i));
            } else {
                sb.append("@");
            }
        }
        return sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        AtFirst af = new AtFirst();
        System.out.println(af.atFirst("hello")); // he
        System.out.println(af.atFirst("h"));     // h@
        System.out.println(af.atFirst(""));      // @@
    }
}
