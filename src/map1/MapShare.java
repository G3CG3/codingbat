package map1;

import java.util.HashMap;
import java.util.Map;

/**
 * mapShare - CodingBat Map-1
 *
 * If the key "a" has a value, set the key "b" to have that same value.
 * In all cases remove the key "c", leaving the rest of the map unchanged.
 */
public class MapShare {

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.get("a") != null) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        MapShare obj = new MapShare();

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        System.out.println(obj.mapShare(map1)); // {a=aaa, b=aaa}

        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "xyz");
        map2.put("c", "ccc");
        System.out.println(obj.mapShare(map2)); // {b=xyz}

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "xyz");
        map3.put("b", "123");
        map3.put("c", "yo");
        System.out.println(obj.mapShare(map3)); // {a=xyz, b=xyz}
    }
}
