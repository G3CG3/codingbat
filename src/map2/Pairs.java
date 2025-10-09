package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * pairs - CodingBat Map-2
 *
 * Given an array of non-empty strings, create and return a Map<String, String>
 * as follows: for each string add its first character as a key
 * with its last character as the value.
 *
 * Example:
 * ["code", "bug"] → {"b":"g", "c":"e"}
 */
public class Pairs {

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            map.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        }

        return map;
    }

    // Optional main for testing
    public static void main(String[] args) {
        Pairs obj = new Pairs();
        String[] arr = {"code", "bug"};
        System.out.println(obj.pairs(arr)); // Expected: {b=g, c=e}
    }
}
