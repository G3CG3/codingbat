package string2;

/**
 * DoubleChar - CodingBat String-2
 *
 * Given a string, return a new string where for every character in the original,
 * there are two of that character.
 *
 * Examples:
 * doubleChar("The") → "TThhee"
 * doubleChar("AAbb") → "AAAAbbbb"
 * doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class DoubleChar {

    /**
     * Returns a string where each character in the input appears twice.
     *
     * @param str the input string
     * @return the string with doubled characters
     */
    public String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c).append(c);
        }
        return sb.toString();
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        DoubleChar dc = new DoubleChar();
        System.out.println(dc.doubleChar("The"));       // TThhee
        System.out.println(dc.doubleChar("AAbb"));      // AAAAbbbb
        System.out.println(dc.doubleChar("Hi-There"));  // HHii--TThheerree
    }
}
