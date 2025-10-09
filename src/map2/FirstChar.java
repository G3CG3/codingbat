package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * firstChar - CodingBat Map-2
 *
 * Given an array of non-empty strings,
 * return a Map<String, String> where each key is the first character,
 * and each value is all strings starting with that character appended together.
 *
 * Example:
 * ["salt", "tea", "soda", "toast"] → {"s":"saltsoda", "t":"teatoast"}
 */
public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            String key = String.valueOf(s.charAt(0));
            map.put(key, map.getOrDefault(key, "") + s);
        }

        return map;
    }

    public static void main(String[] args) {
        FirstChar obj = new FirstChar();
        String[] arr = {"salt", "tea", "soda", "toast"};
        System.out.println(obj.firstChar(arr)); // {s=saltsoda, t=teatoast}
    }
}
