package string2;

/**
 * wordEnds - CodingBat String-2
 *
 * Given a string and a non-empty word string, return a string made of each char
 * just before and just after every appearance of the word in the string.
 * Ignore cases where there is no char before or after the word, and a char may
 * be included twice if it is between two words.
 */
public class WordEnds {

    /**
     * Returns the string made of chars before and after each appearance of word.
     *
     * @param str  the input string
     * @param word the word to search for
     * @return the string of surrounding characters
     */
    public String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int len = word.length();

        for (int i = 0; i <= str.length() - len; i++) {
            if (str.substring(i, i + len).equals(word)) {
                if (i > 0) sb.append(str.charAt(i - 1)); // char before
                if (i + len < str.length()) sb.append(str.charAt(i + len)); // char after
            }
        }

        return sb.toString();
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        WordEnds we = new WordEnds();
        System.out.println(we.wordEnds("abcXY123XYijk", "XY")); // "b13i"
        System.out.println(we.wordEnds("XY123XY", "XY"));        // "13"
        System.out.println(we.wordEnds("XY1XY", "XY"));          // "11"
    }
}
