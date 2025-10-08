package map1;

import java.util.HashMap;
import java.util.Map;

/**
 * topping1 - CodingBat Map-1
 *
 * Given a map of food keys and topping values, modify and return the map as follows:
 * - If the key "ice cream" is present, set its value to "cherry".
 * - In all cases, set the key "bread" to have the value "butter".
 */
public class Topping1 {

    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Topping1 obj = new Topping1();

        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "peanuts");
        System.out.println(obj.topping1(map1));
        // {ice cream=cherry, bread=butter}

        Map<String, String> map2 = new HashMap<>();
        map2.put("pancake", "syrup");
        System.out.println(obj.topping1(map2));
        // {pancake=syrup, bread=butter}

        Map<String, String> map3 = new HashMap<>();
        System.out.println(obj.topping1(map3));
        // {bread=butter}
    }
}
