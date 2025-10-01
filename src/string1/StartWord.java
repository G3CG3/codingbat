package string1;

/**
 * StartWord - CodingBat String-1
 *
 * Given a string and a second "word" string, we'll say that the word matches
 * the string if it appears at the front of the string, except its first char
 * does not need to match exactly. On a match, return the front of the string,
 * otherwise return the empty string. The word will be at least length 1.
 */
public class StartWord {

    /**
     * Checks if the word matches the start of the string,
     * ignoring the first char of the word.
     *
     * @param str  the base string
     * @param word the word to check
     * @return matching front of str, or "" if no match
     */
    public String startWord(String str, String word) {
        if (word.length() > str.length()) return "";

        String wordTail = word.substring(1);
        String strTail = str.substring(1, word.length());

        if (wordTail.equals(strTail)) {
            return str.substring(0, word.length());
        }
        return "";
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        StartWord sw = new StartWord();
        System.out.println(sw.startWord("hippo", "hi"));   // hi
        System.out.println(sw.startWord("hippo", "xip"));  // hip
        System.out.println(sw.startWord("hippo", "hip"));  // hip
        System.out.println(sw.startWord("hippo", "i"));    // h
        System.out.println(sw.startWord("hippo", "zip"));  // ""
    }
}
