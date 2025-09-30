package string1;

/**
 * MakeOutWord - CodingBat String-1
 *
 * Given an "out" string length 4, such as "<<>>", and a word,
 * return a new string where the word is in the middle of the out string,
 * e.g. "<<word>>".
 */
public class MakeOutWord {

    /**
     * Inserts the word into the middle of the given "out" string.
     *
     * @param out  a 4-character string like "<<>>"
     * @param word the word to insert
     * @return a new string with word inside out
     */
    public String makeOutWord(String out, String word) {
        String prefix = out.substring(0, 2);
        String suffix = out.substring(2);
        return prefix + word + suffix;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MakeOutWord mow = new MakeOutWord();
        System.out.println(mow.makeOutWord("<<>>", "Yay"));  // <<Yay>>
        System.out.println(mow.makeOutWord("<<>>", "Woo"));  // <<Woo>>
        System.out.println(mow.makeOutWord("[[]]", "word")); // [[word]]
    }
}
