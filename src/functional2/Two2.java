package functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Two2 - CodingBat Functional-2
 *
 * Given a list of non-negative integers, returns a list of those
 * numbers multiplied by 2, omitting any resulting numbers that end in 2.
 */
public class Two2 {

    /**
     * Multiplies each number by 2 and filters out results ending with 2.
     *
     * @param nums list of non-negative integers
     * @return modified list
     */
    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .filter(n -> n % 10 != 2)
                .collect(Collectors.toList());
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Two2 t2 = new Two2();
        List<Integer> input = java.util.Arrays.asList(1, 2, 3, 5);
        System.out.println(t2.two2(input)); // → [4, 6, 10]
    }
}
