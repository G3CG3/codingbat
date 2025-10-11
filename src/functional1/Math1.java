package functional1;

import java.util.List;

/**
 * Math1 - CodingBat Functional-1
 *
 * Given a list of integers, returns a list where each integer
 * is added to 1 and the result is multiplied by 10.
 * Uses Java's replaceAll() with a lambda expression.
 */
public class Math1 {

    /**
     * Adds 1 to each integer and multiplies the result by 10.
     *
     * @param nums list of integers
     * @return modified list after applying (n + 1) * 10 to each element
     */
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Math1 m = new Math1();
        List<Integer> nums = java.util.Arrays.asList(1, 2, 3);
        System.out.println(m.math1(nums)); // → [20, 30, 40]
    }
}
