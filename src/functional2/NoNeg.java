package functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * NoNeg - CodingBat Functional-2
 *
 * Given a list of integers, returns a new list omitting any that are less than 0.
 */
public class NoNeg {

    /**
     * Filters out negative integers from the input list.
     *
     * @param nums list of integers
     * @return new list containing only non-negative integers
     */
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NoNeg nn = new NoNeg();
        List<Integer> nums = java.util.Arrays.asList(1, -2, 3, -4, 0);
        System.out.println(nn.noNeg(nums)); // → [1, 3, 0]
    }
}
