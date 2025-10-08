package map1;

import java.util.HashMap;
import java.util.Map;

/**
 * mapAB2 - CodingBat Map-1
 *
 * Modify and return the given map as follows:
 * If the keys "a" and "b" are both in the map and have equal values, remove them both.
 */
public class MapAB2 {

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") &&
                map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MapAB2 obj = new MapAB2();

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "aaa");
        map1.put("c", "cake");
        System.out.println(obj.mapAB2(map1));
        // Expected: {c=cake}

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aaa");
        map2.put("b", "bbb");
        System.out.println(obj.mapAB2(map2));
        // Expected: {a=aaa, b=bbb}

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "aaa");
        map3.put("c", "aaa");
        System.out.println(obj.mapAB2(map3));
        // Expected: {c=aaa}
    }
}
