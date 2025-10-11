package recursion2;

/**
 * GroupNoAdj - CodingBat Recursion-2
 *
 * Given an array of ints, determine recursively if it is possible
 * to choose a group of some of the ints such that the group sums
 * to the target, with the additional constraint that if a value
 * is chosen, the value immediately following it cannot be chosen.
 */
public class GroupNoAdj {

    /**
     * Recursively checks if a subset of numbers can sum to the target,
     * with the rule that adjacent numbers cannot both be chosen.
     *
     * @param start  the starting index in nums
     * @param nums   the array of integers
     * @param target the target sum
     * @return true if a valid subset sums to target, false otherwise
     */
    public boolean groupNoAdj(int start, int[] nums, int target) {
        // Base case: reached the end of the array
        if (start >= nums.length) {
            return target == 0;
        }

        // Choose current element and skip next one
        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }

        // Skip current element
        return groupNoAdj(start + 1, nums, target);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        GroupNoAdj gna = new GroupNoAdj();

        System.out.println(gna.groupNoAdj(0, new int[]{2, 5, 10, 4}, 12)); // true (2 + 10)
        System.out.println(gna.groupNoAdj(0, new int[]{2, 5, 10, 4}, 14)); // false
        System.out.println(gna.groupNoAdj(0, new int[]{2, 5, 10, 4}, 7));  // true (2 + 5)
        System.out.println(gna.groupNoAdj(0, new int[]{3, 2, 5, 10, 7}, 15)); // true (3 + 5 + 7)
    }
}
