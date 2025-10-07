package string2;

/**
 * starOut - CodingBat String-2
 *
 * Return a version of the given string, where for every star (*) in the string
 * the star and the chars immediately to its left and right are gone.
 */
public class StarOut {

    /**
     * Removes stars and neighboring characters from the string.
     *
     * @param str the input string
     * @return the transformed string
     */
    public String starOut(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') continue;
            if (i > 0 && str.charAt(i - 1) == '*') continue;
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue;

            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        StarOut so = new StarOut();
        System.out.println(so.starOut("ab*cd"));    // "ad"
        System.out.println(so.starOut("ab**cd"));   // "ad"
        System.out.println(so.starOut("*ab"));      // "b"
        System.out.println(so.starOut("a*b*c"));    // ""
    }
}
