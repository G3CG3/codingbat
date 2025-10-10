package array3;

/**
 * MaxSpan - CodingBat Array-3
 *
 * Returns the largest span between the leftmost and rightmost
 * appearances of any value in the array.
 */
public class MaxSpan {

    /**
     * Computes the largest span in the array.
     *
     * @param nums input array of ints
     * @return the maximum span, 0 if array is empty
     */
    public int maxSpan(int[] nums) {
        if (nums.length == 0) return 0;

        int max = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] == nums[j]) {
                    int span = j - i + 1;
                    if (span > max) {
                        max = span;
                    }
                    break; // no need to check further left for this i
                }
            }
        }

        return max;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MaxSpan ms = new MaxSpan();

        System.out.println(ms.maxSpan(new int[]{})); // → 0
        System.out.println(ms.maxSpan(new int[]{1, 2, 1, 1, 3})); // → 4
        System.out.println(ms.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4})); // → 6
    }
}
