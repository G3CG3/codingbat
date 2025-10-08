package array2;

/**
 * sum28 - CodingBat Array-2
 *
 * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
 */
public class Sum28 {

    /**
     * Checks if the sum of all 2's in the array equals 8.
     *
     * @param nums the array of integers
     * @return true if the sum of 2's is exactly 8, false otherwise
     */
    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            if (n == 2) sum += n;
        }
        return sum == 8;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Sum28 s = new Sum28();
        System.out.println(s.sum28(new int[]{2, 3, 2, 2, 4, 2}));  // → true
        System.out.println(s.sum28(new int[]{2, 3, 2, 2, 4, 2, 2})); // → false
        System.out.println(s.sum28(new int[]{1, 2, 3, 4}));          // → false
        System.out.println(s.sum28(new int[]{2, 2, 2, 2}));          // → true
        System.out.println(s.sum28(new int[]{}));                    // → false
    }
}
