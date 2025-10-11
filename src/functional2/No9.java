package functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * No9 - CodingBat Functional-2
 *
 * Given a list of non-negative integers, returns a new list
 * omitting any numbers that end with 9.
 */
public class No9 {

    /**
     * Filters out integers that end with 9 from the input list.
     *
     * @param nums list of non-negative integers
     * @return new list containing integers that do not end with 9
     */
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        No9 n9 = new No9();
        List<Integer> nums = java.util.Arrays.asList(1, 19, 20, 29, 33, 49);
        System.out.println(n9.no9(nums)); // → [1, 20, 33]
    }
}
