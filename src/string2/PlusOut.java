package string2;

/**
 * plusOut - CodingBat String-2
 *
 * Return a version of the original string where all chars have been replaced
 * by pluses ("+"), except for appearances of the given word which are preserved unchanged.
 */
public class PlusOut {

    /**
     * Replaces characters by '+' except for occurrences of word.
     *
     * @param str  the input string
     * @param word the word to preserve
     * @return the transformed string
     */
    public String plusOut(String str, String word) {
        int len = word.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); ) {
            if (i + len <= str.length() && str.substring(i, i + len).equals(word)) {
                sb.append(word);
                i += len;
            } else {
                sb.append("+");
                i++;
            }
        }
        return sb.toString();
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        PlusOut po = new PlusOut();
        System.out.println(po.plusOut("12xy34", "xy")); // "++xy++"
        System.out.println(po.plusOut("12xy34xyabc", "xy")); // "++xy++xy+++"
        System.out.println(po.plusOut("abcabc", "b")); // "+b+c+b"
    }
}
