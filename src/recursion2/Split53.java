package recursion2;

/**
 * Split53 - CodingBat Recursion-2
 *
 * Given an array of ints, determine if it can be split into two groups
 * so that the sums of the groups are equal, with constraints:
 * - Multiples of 5 must be in one group
 * - Multiples of 3 (not multiples of 5) must be in the other group
 */
public class Split53 {

    /**
     * Main method to initiate the recursive check.
     *
     * @param nums array of integers
     * @return true if a valid split exists, false otherwise
     */
    public boolean split53(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    /**
     * Recursive helper method to assign numbers to groups respecting the constraints.
     *
     * @param index current index in the array
     * @param nums array of integers
     * @param sum1 sum of the first group
     * @param sum2 sum of the second group
     * @return true if a valid split is found, false otherwise
     */
    private boolean helper(int index, int[] nums, int sum1, int sum2) {
        if (index >= nums.length) {
            // Base case: sums must be equal
            return sum1 == sum2;
        }

        int current = nums[index];

        if (current % 5 == 0) {
            // Must go into sum1
            return helper(index + 1, nums, sum1 + current, sum2);
        } else if (current % 3 == 0) {
            // Must go into sum2
            return helper(index + 1, nums, sum1, sum2 + current);
        } else {
            // Can go in either group
            return helper(index + 1, nums, sum1 + current, sum2) ||
                    helper(index + 1, nums, sum1, sum2 + current);
        }
    }

    // Optional main() for testing
    public static void main(String[] args) {
        Split53 solver = new Split53();

        int[] test1 = {1, 1};
        System.out.println(solver.split53(test1)); // true: 1+1 split equally

        int[] test2 = {1, 1, 1};
        System.out.println(solver.split53(test2)); // false

        int[] test3 = {2, 4, 2};
        System.out.println(solver.split53(test3)); // true: 2+2 vs 4
    }
}
