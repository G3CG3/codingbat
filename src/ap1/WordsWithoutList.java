package ap1;

import java.util.ArrayList;
import java.util.List;

/**
 * WordsWithoutList - CodingBat AP-1
 *
 * Given an array of strings, return a new List where all strings of the given length are omitted.
 */
public class WordsWithoutList {

    /**
     * Returns a List containing only the strings whose lengths are different from the given length.
     *
     * @param words input array of strings
     * @param len   the length to omit
     * @return List of strings excluding those of length len
     */
    public List<String> wordsWithoutList(String[] words, int len) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : words) {
            if (s.length() != len) {
                list.add(s);
            }
        }
        return list;
    }

    // Optional main() for testing
    public static void main(String[] args) {
        WordsWithoutList ww = new WordsWithoutList();

        String[] arr1 = {"a", "bb", "ccc", "dd", "eee"};
        List<String> res1 = ww.wordsWithoutList(arr1, 2); // ["a", "ccc", "eee"]
        System.out.println(res1);

        String[] arr2 = {"hello", "world", "java", "code"};
        List<String> res2 = ww.wordsWithoutList(arr2, 4); // ["hello", "world"]
        System.out.println(res2);
    }
}
