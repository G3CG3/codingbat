package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * wordLen - CodingBat Map-2
 *
 * Given an array of strings, return a Map<String, Integer>
 * containing a key for every different string in the array,
 * and the value is that string's length.
 *
 * Example:
 * ["a", "bb", "a", "bb"] → {"a":1, "bb":2}
 */
public class WordLen {

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, s.length());
        }

        return map;
    }

    // Optional test method
    public static void main(String[] args) {
        WordLen obj = new WordLen();
        String[] arr = {"a", "bb", "a", "bb"};
        System.out.println(obj.wordLen(arr)); // Expected: {a=1, bb=2}
    }
}
