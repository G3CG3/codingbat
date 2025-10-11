package functional1;

import java.util.List;

/**
 * Doubling - CodingBat Functional-1
 *
 * Given a list of integers, returns a list where each integer is multiplied by 2.
 * Uses Java's replaceAll() with a lambda expression for a concise, functional approach.
 */
public class Doubling {

    /**
     * Multiplies each integer in the list by 2.
     *
     * @param nums list of integers
     * @return the modified list where each integer is doubled
     */
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Doubling d = new Doubling();
        List<Integer> nums = java.util.Arrays.asList(1, 2, 3);
        System.out.println(d.doubling(nums)); // → [2, 4, 6]
    }
}
