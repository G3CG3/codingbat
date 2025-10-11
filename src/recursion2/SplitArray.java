package recursion2;

/**
 * SplitArray - CodingBat Recursion-2
 *
 * Determine if an array of ints can be split into two groups
 * with equal sums. Every int must go into one group or the other.
 */
public class SplitArray {

    /**
     * Determines if the array can be split into two groups with equal sums.
     *
     * @param nums the input array
     * @return true if such a split exists, false otherwise
     */
    public boolean splitArray(int[] nums) {
        return splitHelper(0, nums, 0, 0);
    }

    /**
     * Recursive helper that tries all possible splits.
     *
     * @param index current index in the array
     * @param nums  the array of ints
     * @param sum1  sum of the first group
     * @param sum2  sum of the second group
     * @return true if a split is found with equal sums
     */
    private boolean splitHelper(int index, int[] nums, int sum1, int sum2) {
        if (index >= nums.length) {
            return sum1 == sum2;
        }

        // Option 1: put current number in the first group
        if (splitHelper(index + 1, nums, sum1 + nums[index], sum2)) return true;

        // Option 2: put current number in the second group
        return splitHelper(index + 1, nums, sum1, sum2 + nums[index]);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        SplitArray sa = new SplitArray();

        System.out.println(sa.splitArray(new int[]{2, 2}));        // true
        System.out.println(sa.splitArray(new int[]{2, 3}));        // false
        System.out.println(sa.splitArray(new int[]{5, 2, 3}));     // true (5 in one group, 2+3 in the other)
        System.out.println(sa.splitArray(new int[]{1, 1, 1, 1, 1, 1})); // true
    }
}
