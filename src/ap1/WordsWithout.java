package ap1;

/**
 * WordsWithout - CodingBat AP-1
 *
 * Returns a new array containing all the strings from the input array
 * except those equal to the target string.
 */
public class WordsWithout {

    /**
     * Returns a new array without the target string.
     *
     * @param words input array of strings
     * @param target string to omit
     * @return new array without the target string
     */
    public String[] wordsWithout(String[] words, String target) {
        // Count how many elements are not equal to target
        int count = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                count++;
            }
        }

        // Create result array of correct length
        String[] result = new String[count];
        int index = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                result[index++] = word;
            }
        }

        return result;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        WordsWithout ww = new WordsWithout();

        String[] words = {"a", "b", "c", "b"};
        String target = "b";
        String[] result = ww.wordsWithout(words, target);

        for (String s : result) {
            System.out.print(s + " "); // Output: a c
        }
    }
}
