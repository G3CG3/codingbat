package string3;

/**
 * mirrorEnds - - CodingBat String-3
 *
 * Given a string, look for a mirror image (backwards) string at both the beginning
 * and end of the given string. In other words, zero or more characters at the very
 * beginning of the given string, and at the very end of the string in reverse order
 * (possibly overlapping).
 *
 * Example:
 * mirrorEnds("abXYZba") → "ab"
 * mirrorEnds("abca") → "a"
 * mirrorEnds("aba") → "aba"
 * mirrorEnds("xyz") → ""
 */

import java.util.*;

public class MirrorEnds {

    /**
     * Returns the mirrored part of the given string.
     *
     * @param string the input string
     * @return the substring that appears as a mirror image at both the start and end
     */
    public String mirrorEnds(String string) {
        StringBuilder sb = new StringBuilder();

        // Compare characters from start and end moving inward
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                sb.append(string.charAt(i));
            } else {
                break; // Stop when the mirror pattern ends
            }
        }

        return sb.toString();
    }

    /**
     * Simple manual test cases for validation.
     */
    public static void main(String[] args) {
        MirrorEnds me = new MirrorEnds();
        System.out.println(me.mirrorEnds("abXYZba")); // → "ab"
        System.out.println(me.mirrorEnds("abca"));    // → "a"
        System.out.println(me.mirrorEnds("aba"));     // → "aba"
        System.out.println(me.mirrorEnds("xyz"));     // → ""
    }
}
