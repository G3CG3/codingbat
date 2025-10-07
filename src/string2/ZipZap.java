package string2;

/**
 * zipZap - CodingBat String-2
 *
 * Look for patterns like "zip" and "zap" in the string -- length-3,
 * starting with 'z' and ending with 'p'. Return a string where for all
 * such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
 */
public class ZipZap {

    /**
     * Removes the middle character from "z?p" patterns.
     *
     * @param str the input string
     * @return the transformed string
     */
    public String zipZap(String str) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < str.length()) {
            // Check that a length-3 pattern exists starting at i
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                sb.append("zp");
                i += 3; // skip this pattern
            } else {
                sb.append(str.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        ZipZap zz = new ZipZap();
        System.out.println(zz.zipZap("zipXzap"));   // "zpXzp"
        System.out.println(zz.zipZap("zzzop"));      // "zzzp"
        System.out.println(zz.zipZap("zipzap"));     // "zpzp"
        System.out.println(zz.zipZap("abczp"));      // "abczp"
    }
}
