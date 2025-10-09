package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * wordCount - CodingBat Map-2
 *
 * The classic word-count algorithm:
 * given an array of strings, return a Map<String, Integer>
 * with a key for each different string,
 * with the value being the number of times that string appears in the array.
 *
 * Example:
 * ["a", "b", "a", "c", "b"] → {"a":2, "b":2, "c":1}
 */
public class WordCount {

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        return map;
    }

    // Optional test
    public static void main(String[] args) {
        WordCount obj = new WordCount();
        String[] arr = {"a", "b", "a", "c", "b"};
        System.out.println(obj.wordCount(arr)); // Expected: {a=2, b=2, c=1}
    }
}
