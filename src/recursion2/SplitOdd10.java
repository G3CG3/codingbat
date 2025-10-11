package recursion2;

/**
 * SplitOdd10 - CodingBat Recursion-2
 *
 * Given an array of ints, determine if it can be split into two groups
 * where one group sums to a multiple of 10 and the other sums to an odd number.
 */
public class SplitOdd10 {

    /**
     * Main method to initiate the recursive check.
     *
     * @param nums array of integers
     * @return true if a valid split exists, false otherwise
     */
    public boolean splitOdd10(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    /**
     * Recursive helper method to try adding each number to one of the two groups.
     *
     * @param index current index in the array
     * @param nums array of integers
     * @param sum1 sum of the first group
     * @param sum2 sum of the second group
     * @return true if a valid split is found, false otherwise
     */
    private boolean helper(int index, int[] nums, int sum1, int sum2) {
        if (index >= nums.length) {
            // Base case: check the sums
            return (sum1 % 10 == 0 && sum2 % 2 == 1) || (sum2 % 10 == 0 && sum1 % 2 == 1);
        }

        // Try including the current number in the first group
        if (helper(index + 1, nums, sum1 + nums[index], sum2)) {
            return true;
        }

        // Try including the current number in the second group
        return helper(index + 1, nums, sum1, sum2 + nums[index]);

        // Neither choice leads to a valid split
    }

    // Optional main for testing
    public static void main(String[] args) {
        SplitOdd10 solver = new SplitOdd10();

        int[] test1 = {5, 5, 5};
        System.out.println(solver.splitOdd10(test1)); // true: 10 in one group, 5 (odd) in the other

        int[] test2 = {2, 4, 6};
        System.out.println(solver.splitOdd10(test2)); // false

        int[] test3 = {10, 1, 9};
        System.out.println(solver.splitOdd10(test3)); // true: 10 in one group, 1+9=10 (even) but sum1=10 satisfies multiple of 10
    }
}
