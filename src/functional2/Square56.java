package functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Square56 - CodingBat Functional-2
 *
 * Given a list of integers, returns a list of those numbers squared,
 * adds 10, and omits any resulting numbers that end in 5 or 6.
 */
public class Square56 {

    /**
     * Squares each number, adds 10, and filters out results ending with 5 or 6.
     *
     * @param nums list of integers
     * @return modified list
     */
    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n * n) + 10)
                .filter(n -> n % 10 != 5 && n % 10 != 6)
                .collect(Collectors.toList());
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Square56 s = new Square56();
        List<Integer> input = java.util.Arrays.asList(1, 2, 3, 4);
        System.out.println(s.square56(input)); // → [11, 14, 19]
    }
}
