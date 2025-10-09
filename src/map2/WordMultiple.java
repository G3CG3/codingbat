package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * wordMultiple - CodingBat Map-2
 *
 * Given an array of strings, return a Map<String, Boolean> where each different
 * string is a key and its value is true if that string appears 2 or more times
 * in the array.
 */
public class WordMultiple {

    /**
     * Builds a map indicating whether each word appears two or more times.
     *
     * @param strings array of strings to analyze
     * @return a map where each string maps to true if it appears 2+ times
     */
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }
        return map;
    }

    /**
     * Main method for testing.
     */
    public static void main(String[] args) {
        WordMultiple wm = new WordMultiple();

        System.out.println(wm.wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        // {a=true, b=true, c=false}

        System.out.println(wm.wordMultiple(new String[]{"c", "b", "a"}));
        // {a=false, b=false, c=false}

        System.out.println(wm.wordMultiple(new String[]{"c", "c", "c", "c"}));
        // {c=true}
    }
}