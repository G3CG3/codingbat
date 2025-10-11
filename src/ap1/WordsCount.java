package ap1;

/**
 * WordsCount - CodingBat AP-1
 *
 * Given an array of strings, returns the count of the number of strings with the given length.
 */
public class WordsCount {

    /**
     * Counts how many strings in the array have the specified length.
     *
     * @param words array of strings
     * @param len   target length
     * @return count of strings with length equal to len
     */
    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String s : words) {
            if (s.length() == len) {
                count++;
            }
        }
        return count;
    }

    // Optional main() for testing
    public static void main(String[] args) {
        WordsCount wc = new WordsCount();

        System.out.println(wc.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1)); // 2
        System.out.println(wc.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 2)); // 1
        System.out.println(wc.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3)); // 1
    }
}
