package array2;

/**
 * bigDiff - CodingBat Array-2
 *
 * Given an array length 1 or more of ints, return the difference between
 * the largest and smallest values in the array.
 *
 * Note: Math.min(v1, v2) and Math.max(v1, v2) can be used to find the
 * smaller or larger of two values.
 */
public class BigDiff {

    /**
     * Returns the difference between the maximum and minimum values
     * in the given integer array.
     *
     * @param nums the array of integers (length >= 1)
     * @return the difference between the largest and smallest values
     */
    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return max - min;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        BigDiff bd = new BigDiff();

        System.out.println(bd.bigDiff(new int[]{10, 3, 5, 6}));     // → 7
        System.out.println(bd.bigDiff(new int[]{7, 2, 10, 9}));     // → 8
        System.out.println(bd.bigDiff(new int[]{2, 10, 7, 2}));     // → 8
        System.out.println(bd.bigDiff(new int[]{1}));               // → 0
    }
}
