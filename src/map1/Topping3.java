package map1;

import java.util.HashMap;
import java.util.Map;

/**
 * topping3 - CodingBat Map-1
 *
 * Given a map of food keys and topping values, modify and return the map as follows:
 * - If the key "potato" has a value, set that as the value for the key "fries".
 * - If the key "salad" has a value, set that as the value for the key "spinach".
 */
public class Topping3 {

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.get("potato") != null) {
            map.put("fries", map.get("potato"));
        }
        if (map.get("salad") != null) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Topping3 obj = new Topping3();

        Map<String, String> map1 = new HashMap<>();
        map1.put("potato", "ketchup");
        map1.put("salad", "ranch");
        System.out.println(obj.topping3(map1));
        // {potato=ketchup, salad=ranch, fries=ketchup, spinach=ranch}

        Map<String, String> map2 = new HashMap<>();
        map2.put("potato", "butter");
        System.out.println(obj.topping3(map2));
        // {potato=butter, fries=butter}

        Map<String, String> map3 = new HashMap<>();
        map3.put("salad", "oil");
        System.out.println(obj.topping3(map3));
        // {salad=oil, spinach=oil}
    }
}
