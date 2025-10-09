package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * allSwap - CodingBat Map-2
 *
 * We'll say that 2 strings "match" if they are non-empty and their first
 * chars are the same. Loop over and then return the given array of non-empty
 * strings as follows: if a string matches an earlier string in the array,
 * swap the 2 strings in the array. When a position in the array has been swapped,
 * it no longer matches anything. Using a map, this can be solved in one pass.
 */
public class AllSwap {

    /**
     * Swaps strings in the array based on matching first characters.
     * Each first character can only cause one swap.
     *
     * @param strings the array of non-empty strings
     * @return the modified array after performing swaps
     */
    public String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char key = strings[i].charAt(0);

            if (map.containsKey(key)) {
                int prevIndex = map.get(key);

                // Perform the swap
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;

                // Remove key so no further swaps happen with this character
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }

        return strings;
    }

    /**
     * Main method for testing.
     */
    public static void main(String[] args) {
        AllSwap as = new AllSwap();

        System.out.println(java.util.Arrays.toString(as.allSwap(
                new String[]{"ab", "ac"})));
        // → ["ac", "ab"]

        System.out.println(java.util.Arrays.toString(as.allSwap(
                new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        // → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]

        System.out.println(java.util.Arrays.toString(as.allSwap(
                new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));
        // → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
    }
}
