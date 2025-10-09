package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * word0 - CodingBat Map-2
 *
 * Given an array of strings, return a Map<String, Integer>
 * containing a key for every different string in the array,
 * always with the value 0.
 *
 * Example:
 * ["a", "b", "a", "b"] → {"a":0, "b":0}
 */
public class Word0 {

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, 0);
        }

        return map;
    }

    // Optional main() for testing
    public static void main(String[] args) {
        Word0 obj = new Word0();
        String[] arr = {"a", "b", "a", "b"};
        System.out.println(obj.word0(arr)); // Expected: {a=0, b=0}
    }
}
