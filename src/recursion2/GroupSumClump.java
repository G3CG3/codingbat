package recursion2;

/**
 * GroupSumClump - CodingBat Recursion-2
 *
 * Given an array of ints, determine recursively if it is possible
 * to choose a group of some of the ints such that the group sums
 * to the target with the following constraint:
 * - If there are adjacent identical numbers, they must be chosen
 *   together as a group or not at all.
 */
public class GroupSumClump {

    /**
     * Recursively checks if a subset of numbers can sum to the target
     * while treating adjacent identical numbers as a clump.
     *
     * @param start  the starting index in nums
     * @param nums   the array of integers
     * @param target the target sum
     * @return true if a valid subset sums to target, false otherwise
     */
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;

        // Find the extent of the clump of identical adjacent numbers
        int sum = nums[start];
        int count = 1;
        for (int i = start + 1; i < nums.length && nums[i] == nums[start]; i++) {
            sum += nums[i];
            count++;
        }

        // Option 1: Include the clump
        if (groupSumClump(start + count, nums, target - sum)) return true;

        // Option 2: Exclude the clump
        return groupSumClump(start + count, nums, target);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        GroupSumClump gsc = new GroupSumClump();

        System.out.println(gsc.groupSumClump(0, new int[]{2, 4, 4, 4, 5}, 15)); // true (2+4+4+4+1) -> 2+4+4+4+1?
        System.out.println(gsc.groupSumClump(0, new int[]{2, 4, 4, 4, 5}, 14)); // false
        System.out.println(gsc.groupSumClump(0, new int[]{1, 2, 2, 2, 5, 2}, 9)); // true (2+2+2+2 or 1+2+2+2+2?)
        System.out.println(gsc.groupSumClump(0, new int[]{1, 2, 2, 2, 5, 2}, 10)); // false
    }
}
