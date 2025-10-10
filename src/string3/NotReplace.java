package string3;

/**
 * NotReplace - CodingBat String-3
 *
 * Replace every appearance of the lowercase word "is" with "is not".
 * Only standalone "is" is replaced (not part of another word).
 */
public class NotReplace {

    /**
     * Replaces "is" with "is not" if it is not part of another word.
     *
     * @param str input string
     * @return modified string
     */
    public String notReplace(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            // Check for "is" starting at position i
            if (i + 1 < str.length() && str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                boolean before = (i == 0) || !Character.isLetter(str.charAt(i - 1));
                boolean after = (i + 2 >= str.length()) || !Character.isLetter(str.charAt(i + 2));

                if (before && after) {
                    sb.append("is not");
                    i += 2;
                    continue;
                }
            }

            sb.append(str.charAt(i));
            i++;
        }

        return sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NotReplace nr = new NotReplace();
        System.out.println(nr.notReplace("is test"));         // → "is not test"
        System.out.println(nr.notReplace("this is right"));   // → "this is not right"
        System.out.println(nr.notReplace("is-is"));           // → "is not-is not"
        System.out.println(nr.notReplace("isx isy"));         // → "isx isy"
    }
}
