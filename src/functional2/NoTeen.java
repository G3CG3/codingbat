package functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * NoTeen - CodingBat Functional-2
 *
 * Given a list of integers, returns a new list omitting
 * any integers that are between 13 and 19 inclusive.
 */
public class NoTeen {

    /**
     * Filters out integers that are "teen" values (13..19) from the input list.
     *
     * @param nums list of integers
     * @return new list excluding numbers from 13 to 19 inclusive
     */
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n < 13 || n > 19)
                .collect(Collectors.toList());
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NoTeen nt = new NoTeen();
        List<Integer> nums = java.util.Arrays.asList(10, 13, 15, 19, 20, 21);
        System.out.println(nt.noTeen(nums)); // → [10, 20, 21]
    }
}
