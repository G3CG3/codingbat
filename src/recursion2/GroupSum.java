package recursion2;

/**
 * GroupSum - CodingBat Recursion-2
 *
 * Given an array of ints, determine recursively if it is possible
 * to choose a group of some of the ints such that the group sums
 * to the given target. This is a classic backtracking recursion problem.
 */
public class GroupSum {

    /**
     * Recursively determines if a subset of numbers starting from index 'start'
     * can sum to the given target.
     *
     * @param start  the starting index to consider in nums
     * @param nums   the array of integers
     * @param target the target sum to achieve
     * @return true if a subset sums to target, false otherwise
     */
    public boolean groupSum(int start, int[] nums, int target) {
        // Base case: if we've considered all elements
        if (start >= nums.length) {
            return target == 0;
        }

        // Recursive case 1: include nums[start] in the sum
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }

        // Recursive case 2: exclude nums[start] and continue
        return groupSum(start + 1, nums, target);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        GroupSum gs = new GroupSum();

        System.out.println(gs.groupSum(0, new int[]{2, 4, 8}, 10)); // true (2 + 8)
        System.out.println(gs.groupSum(0, new int[]{2, 4, 8}, 14)); // true (2 + 4 + 8)
        System.out.println(gs.groupSum(0, new int[]{2, 4, 8}, 9));  // false
        System.out.println(gs.groupSum(0, new int[]{10, 2, 2, 5}, 17)); // true (10 + 2 + 5)
        System.out.println(gs.groupSum(0, new int[]{1, 2, 3, 4}, 6)); // true (2 + 4)
    }
}
