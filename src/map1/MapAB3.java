package map1;

import java.util.HashMap;
import java.util.Map;

/**
 * mapAB3 - CodingBat Map-1
 *
 * Modify and return the given map as follows:
 * If exactly one of the keys "a" or "b" has a value in the map (but not both),
 * set the other to have that same value in the map.
 */
public class MapAB3 {

    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.get("a") != null && map.get("b") == null) {
            map.put("b", map.get("a"));
        } else if (map.get("b") != null && map.get("a") == null) {
            map.put("a", map.get("b"));
        }
        return map;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        MapAB3 obj = new MapAB3();

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        System.out.println(obj.mapAB3(map1));
        // Expected: {a=aaa, b=aaa}

        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "bbb");
        System.out.println(obj.mapAB3(map2));
        // Expected: {a=bbb, b=bbb}

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        System.out.println(obj.mapAB3(map3));
        // Expected: {a=aaa, b=bbb} (unchanged)
    }
}
