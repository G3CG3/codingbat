package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * wordAppend - CodingBat Map-2
 *
 * Given an array of strings, build and return a result string as follows:
 * when a string appears the 2nd, 4th, 6th, etc. time in the array,
 * append the string to the result. Return the empty string if no string
 * appears a 2nd time.
 */
public class WordAppend {

    /**
     * Returns a string containing all words that appear an even number of times,
     * appended in the order they reach their 2nd, 4th, 6th, etc. occurrence.
     *
     * @param strings the array of strings to process
     * @return concatenated string of words appearing an even number of times
     */
    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String s : strings) {
            int count = map.getOrDefault(s, 0) + 1;
            map.put(s, count);

            if (count % 2 == 0) {
                result.append(s);
            }
        }
        return result.toString();
    }

    /**
     * Main method for basic testing.
     */
    public static void main(String[] args) {
        WordAppend w = new WordAppend();

        System.out.println(w.wordAppend(new String[]{"a", "b", "a"}));                // "a"
        System.out.println(w.wordAppend(new String[]{"a", "b", "a", "c", "a", "b"})); // "ab"
        System.out.println(w.wordAppend(new String[]{"a", "b", "b", "a", "a", "b", "a", "b"})); // "baba"
        System.out.println(w.wordAppend(new String[]{"a", "b", "c"}));                // ""
    }
}
