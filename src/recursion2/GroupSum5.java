package recursion2;

/**
 * GroupSum5 - CodingBat Recursion-2
 *
 * Given an array of ints, determine recursively if it is possible
 * to choose a group of some of the ints such that the group sums
 * to the target with the following constraints:
 * 1. All multiples of 5 must be included.
 * 2. If a multiple of 5 is immediately followed by 1, the 1 must not be chosen.
 */
public class GroupSum5 {

    /**
     * Recursively checks if a subset of numbers can sum to the target
     * following the rules for multiples of 5 and adjacent 1s.
     *
     * @param start  the starting index in nums
     * @param nums   the array of integers
     * @param target the target sum
     * @return true if a valid subset sums to target, false otherwise
     */
    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;

        // If current number is multiple of 5, must include it
        if (nums[start] % 5 == 0) {
            int nextIndex = start + 1;

            // Skip 1 immediately following a multiple of 5
            if (nextIndex < nums.length && nums[nextIndex] == 1) {
                nextIndex++;
            }

            return groupSum5(nextIndex, nums, target - nums[start]);
        }

        // Try including or excluding current number (if not multiple of 5)
        if (groupSum5(start + 1, nums, target - nums[start])) return true;

        return groupSum5(start + 1, nums, target);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        GroupSum5 gs5 = new GroupSum5();

        System.out.println(gs5.groupSum5(0, new int[]{2, 5, 1, 10}, 17)); // true (2 + 5 + 10)
        System.out.println(gs5.groupSum5(0, new int[]{2, 5, 1, 10}, 15)); // false
        System.out.println(gs5.groupSum5(0, new int[]{5, 1, 2}, 7));      // true (5 + 2)
        System.out.println(gs5.groupSum5(0, new int[]{5, 1, 2}, 6));      // false
    }
}
