package array2;

/**
 * sum13 - CodingBat Array-2
 *
 * Return the sum of the numbers in the array, returning 0 for an empty array.
 * The number 13 is unlucky: it does not count, and numbers immediately after 13
 * also do not count.
 */
public class Sum13 {

    /**
     * Computes the sum of numbers in the array with the 13 rule applied.
     *
     * @param nums the array of integers
     * @return the sum according to the rule
     */
    public int sum13(int[] nums) {
        if (nums.length == 0) return 0;

        int sum = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] == 13) {
                i += 2; // skip 13 and the next number
            } else {
                sum += nums[i];
                i++;
            }
        }
        return sum;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Sum13 s = new Sum13();

        System.out.println(s.sum13(new int[]{1, 2, 2, 1}));       // → 6
        System.out.println(s.sum13(new int[]{1, 2, 13, 2, 1, 13})); // → 4
        System.out.println(s.sum13(new int[]{13, 1, 2, 13, 2, 1, 13})); // → 3
        System.out.println(s.sum13(new int[]{}));                 // → 0
    }
}
