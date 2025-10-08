package map1;

import java.util.HashMap;
import java.util.Map;

/**
 * mapBully - CodingBat Map-1
 *
 * If the key "a" has a value, set the key "b" to have that value,
 * and set the key "a" to have the value "".
 * Basically "b" is a bully, taking the value and replacing it with the empty string.
 */
public class MapBully {

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.get("a") != null) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        MapBully obj = new MapBully();

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "candy");
        map1.put("b", "dirt");
        System.out.println(obj.mapBully(map1)); // {a=, b=candy}

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "candy");
        System.out.println(obj.mapBully(map2)); // {a=, b=candy}

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "carrot");
        System.out.println(obj.mapBully(map3)); // {b=carrot}
    }
}
