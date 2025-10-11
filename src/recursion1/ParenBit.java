package recursion1;

/**
 * ParenBit - CodingBat Recursion-1
 *
 * Given a string that contains a single pair of parentheses,
 * return a new string made only of the parentheses and their contents.
 * Example: "xyz(abc)123" → "(abc)"
 */
public class ParenBit {

    /**
     * Recursively returns the substring that starts with '('
     * and ends with ')', including both parentheses.
     *
     * @param str input string containing exactly one pair of parentheses
     * @return substring with the parentheses and their contents
     */
    public String parenBit(String str) {
        // If the first character isn't '(', skip it
        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        }

        // If the last character isn't ')', trim from the end
        if (str.charAt(str.length() - 1) != ')') {
            return parenBit(str.substring(0, str.length() - 1));
        }

        // When it starts with '(' and ends with ')', return the substring
        return str;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ParenBit pb = new ParenBit();
        System.out.println(pb.parenBit("xyz(abc)123")); // (abc)
        System.out.println(pb.parenBit("x(hello)"));    // (hello)
        System.out.println(pb.parenBit("(xy)"));        // (xy)
        System.out.println(pb.parenBit("abc(xyz)"));    // (xyz)
    }
}
