package array2;

/**
 * centeredAverage - CodingBat Array-2
 *
 * Return the "centered" average of an array of ints, which we'll say is
 * the mean average of the values, except ignoring the largest and smallest
 * values in the array. If there are multiple copies of the smallest value,
 * ignore just one copy, and likewise for the largest value.
 *
 * Use integer division for the final average. The array length is 3 or more.
 */
public class CenteredAverage {

    /**
     * Computes the centered average of an integer array.
     *
     * @param nums the array of integers (length >= 3)
     * @return the centered average
     */
    public int centeredAverage(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = 0;

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            sum += n;
        }

        return (sum - min - max) / (nums.length - 2);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CenteredAverage ca = new CenteredAverage();

        System.out.println(ca.centeredAverage(new int[]{1, 2, 3, 4, 100}));    // → 3
        System.out.println(ca.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7})); // → 5
        System.out.println(ca.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0})); // → -3
        System.out.println(ca.centeredAverage(new int[]{5, 3, 4, 6, 2}));      // → 4
    }
}
