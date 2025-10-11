package functional1;

import java.util.List;

/**
 * RightDigit - CodingBat Functional-1
 *
 * Given a list of non-negative integers, returns a list of the
 * rightmost digits of each number. Uses Java's replaceAll() with
 * a lambda expression and the modulo operator (%).
 */
public class RightDigit {

    /**
     * Replaces each number with its rightmost digit.
     *
     * @param nums list of non-negative integers
     * @return modified list containing only the rightmost digits
     */
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        RightDigit r = new RightDigit();
        List<Integer> nums = java.util.Arrays.asList(16, 8, 886, 8, 1);
        System.out.println(r.rightDigit(nums)); // → [6, 8, 6, 8, 1]
    }
}
