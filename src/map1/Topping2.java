package map1;

import java.util.HashMap;
import java.util.Map;

/**
 * topping2 - CodingBat Map-1
 *
 * Given a map of food keys and their topping values, modify and return the map as follows:
 * - If the key "ice cream" has a value, set that as the value for the key "yogurt" also.
 * - If the key "spinach" has a value, change that value to "nuts".
 */
public class Topping2 {

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.get("ice cream") != null) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.get("spinach") != null) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Topping2 obj = new Topping2();

        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "cherry");
        map1.put("spinach", "dirt");
        System.out.println(obj.topping2(map1));
        // {ice cream=cherry, yogurt=cherry, spinach=nuts}

        Map<String, String> map2 = new HashMap<>();
        map2.put("yogurt", "salt");
        System.out.println(obj.topping2(map2));
        // {yogurt=salt}

        Map<String, String> map3 = new HashMap<>();
        map3.put("spinach", "dirt");
        System.out.println(obj.topping2(map3));
        // {spinach=nuts}
    }
}
