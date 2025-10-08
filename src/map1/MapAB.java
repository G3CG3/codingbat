package map1;

import java.util.HashMap;
import java.util.Map;

/**
 * mapAB - CodingBat Map-1
 *
 * For this problem the map may or may not contain the "a" and "b" keys.
 * If both keys are present, append their 2 string values together and
 * store the result under the key "ab".
 */
public class MapAB {

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        MapAB obj = new MapAB();

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");
        System.out.println(obj.mapAB(map1)); // {a=Hi, b=There, ab=HiThere}

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        System.out.println(obj.mapAB(map2)); // {a=Hi}

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");
        System.out.println(obj.mapAB(map3)); // {b=There}
    }
}
