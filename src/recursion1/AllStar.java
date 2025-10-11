package recursion1;

/**
 * AllStar - CodingBat Recursion-1
 *
 * Recursively inserts a '*' between each pair of adjacent characters in a string.
 */
public class AllStar {

    /**
     * Recursively adds '*' between adjacent characters.
     *
     * @param str input string
     * @return new string with '*' between each pair of characters
     */
    public String allStar(String str) {
        // Base case: if the string has 0 or 1 character, nothing to insert
        if (str.length() < 2) return str;

        // Recursive step: first char + "*" + result of recursion on the rest
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        AllStar as = new AllStar();
        System.out.println(as.allStar("hello")); // h*e*l*l*o
        System.out.println(as.allStar("abc"));   // a*b*c
        System.out.println(as.allStar("x"));     // x
        System.out.println(as.allStar(""));      // (empty string)
    }
}
