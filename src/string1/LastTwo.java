package string1;

/**
 * LastTwo - CodingBat String-1
 *
 * Given a string of any length, return a new string where the last 2 chars,
 * if present, are swapped. Example: "coding" yields "codign".
 */
public class LastTwo {

    /**
     * Swaps the last two characters of the string if length >= 2.
     *
     * @param str input string
     * @return string with last two characters swapped
     */
    public String lastTwo(String str) {
        if (str.length() < 2) return str;
        return str.substring(0, str.length() - 2)
                + str.charAt(str.length() - 1)
                + str.charAt(str.length() - 2);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        LastTwo lt = new LastTwo();
        System.out.println(lt.lastTwo("coding")); // codign
        System.out.println(lt.lastTwo("cat"));    // cta
        System.out.println(lt.lastTwo("ab"));     // ba
        System.out.println(lt.lastTwo("a"));      // a
        System.out.println(lt.lastTwo(""));       // ""
    }
}
