package recursion2;

/**
 * GroupSum6 - CodingBat Recursion-2
 *
 * Given an array of ints, determine recursively if it is possible
 * to choose a group of some of the ints starting at the given index
 * such that the group sums to the target, with the constraint that
 * all 6's must be included in the sum.
 */
public class GroupSum6 {

    /**
     * Recursively determines if a subset of numbers starting from index 'start'
     * can sum to the given target, always including 6's.
     *
     * @param start  the starting index to consider in nums
     * @param nums   the array of integers
     * @param target the target sum to achieve
     * @return true if a valid subset sums to target, false otherwise
     */
    public boolean groupSum6(int start, int[] nums, int target) {
        // Base case: all elements considered
        if (start >= nums.length) {
            return target == 0;
        }

        // If the current number is 6, it must be included
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - 6);
        }

        // Otherwise, choose to include or exclude the current number
        if (groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        }

        return groupSum6(start + 1, nums, target);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        GroupSum6 gs6 = new GroupSum6();

        System.out.println(gs6.groupSum6(0, new int[]{5, 6, 2}, 8));   // true (6 + 2)
        System.out.println(gs6.groupSum6(0, new int[]{5, 6, 2}, 9));   // false
        System.out.println(gs6.groupSum6(0, new int[]{6, 6, 2}, 14));  // true (6 + 6 + 2)
        System.out.println(gs6.groupSum6(0, new int[]{1, 6, 2}, 8));   // true (6 + 2)
        System.out.println(gs6.groupSum6(0, new int[]{1, 6, 2}, 7));   // false
    }
}
