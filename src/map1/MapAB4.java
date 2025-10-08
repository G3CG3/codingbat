package map1;

import java.util.HashMap;
import java.util.Map;

/**
 * mapAB4 - CodingBat Map-1
 *
 * Modify and return the given map as follows:
 * If the keys "a" and "b" have values that have different lengths,
 * then set "c" to have the longer value.
 * If the values exist and have the same length,
 * change them both to the empty string in the map.
 */
public class MapAB4 {

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            int lenA = map.get("a").length();
            int lenB = map.get("b").length();

            if (lenA > lenB) {
                map.put("c", map.get("a"));
            } else if (lenA < lenB) {
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        MapAB4 obj = new MapAB4();

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bb");
        System.out.println(obj.mapAB4(map1));
        // Expected: {a=aaa, b=bb, c=aaa}

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aa");
        map2.put("b", "bbb");
        System.out.println(obj.mapAB4(map2));
        // Expected: {a=aa, b=bbb, c=bbb}

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aa");
        map3.put("b", "bb");
        System.out.println(obj.mapAB4(map3));
        // Expected: {a=, b=}
    }
}
