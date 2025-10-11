package functional1;

import java.util.List;

/**
 * Square - CodingBat Functional-1
 *
 * Given a list of integers, returns a list where each integer
 * is multiplied with itself (squared).
 * Uses Java's replaceAll() with a lambda expression for concise implementation.
 */
public class Square {

    /**
     * Squares each integer in the given list.
     *
     * @param nums list of integers
     * @return the modified list where each integer is squared
     */
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Square s = new Square();
        List<Integer> nums = java.util.Arrays.asList(1, 2, 3);
        System.out.println(s.square(nums)); // → [1, 4, 9]
    }
}
