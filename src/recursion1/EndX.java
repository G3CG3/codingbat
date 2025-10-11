package recursion1;

/**
 * EndX - CodingBat Recursion-1
 *
 * Recursively moves all lowercase 'x' characters to the end of the string.
 */
public class EndX {

    /**
     * Recursively moves all 'x' characters to the end of the string.
     *
     * @param str input string
     * @return new string with all 'x' chars moved to the end
     */
    public String endX(String str) {
        // Base case: if string has 0 or 1 character, return it as-is
        if (str.length() < 2) return str;

        // If the first character is 'x', move it to the end
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + 'x';
        }

        // Otherwise, keep the first character and recurse on the rest
        return str.charAt(0) + endX(str.substring(1));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        EndX ex = new EndX();
        System.out.println(ex.endX("xxre"));     // rexx
        System.out.println(ex.endX("xxhixx"));   // hixxxx
        System.out.println(ex.endX("xhxhi"));    // hihi xx
        System.out.println(ex.endX("abc"));      // abc
    }
}
