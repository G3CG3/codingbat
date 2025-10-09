package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * firstSwap - CodingBat Map-2
 *
 * We'll say that 2 strings "match" if they are non-empty and their first
 * chars are the same. Loop over and return the given array of non-empty strings
 * as follows: if a string matches an earlier string in the array, swap the
 * 2 strings in the array. A particular first char can only cause one swap,
 * so once a char has caused a swap, its later swaps are disabled.
 *
 * This can be solved with one pass using a Map<Character, Integer>.
 */
public class FirstSwap {

    /**
     * Performs swaps based on first character matches.
     * Each character can cause only one swap in total.
     *
     * @param strings the input array of non-empty strings
     * @return the modified array after performing swaps
     */
    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char key = strings[i].charAt(0);

            if (map.containsKey(key)) {
                int prevIndex = map.get(key);

                // If value is -1, swaps for this char are disabled
                if (prevIndex == -1) continue;

                // Swap the two strings
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;

                // Disable future swaps for this char
                map.put(key, -1);
            } else {
                // Store index of first occurrence
                map.put(key, i);
            }
        }

        return strings;
    }

    /**
     * Main method for testing.
     */
    public static void main(String[] args) {
        FirstSwap fs = new FirstSwap();

        System.out.println(java.util.Arrays.toString(fs.firstSwap(
                new String[]{"ab", "ac"})));
        // → ["ac", "ab"]

        System.out.println(java.util.Arrays.toString(fs.firstSwap(
                new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        // → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]

        System.out.println(java.util.Arrays.toString(fs.firstSwap(
                new String[]{"ax", "bx", "cx", "ay", "cy", "aaa", "azz"})));
        // → ["ay", "bx", "cy", "ax", "cx", "aaa", "azz"]
    }
}
