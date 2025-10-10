package array3;

/**
 * CanBalance - CodingBat Array-3
 *
 * Given a non-empty array, returns true if there is a place to split
 * the array so that the sum of the numbers on one side is equal to the sum
 * of the numbers on the other side.
 */
public class CanBalance {

    /**
     * Checks if the array can be balanced into two parts with equal sum.
     *
     * @param nums input array of integers
     * @return true if a balance point exists, false otherwise
     */
    public boolean canBalance(int[] nums) {
        int totalSum = 0;
        for (int n : nums) totalSum += n;

        int leftSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) return true;
        }
        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CanBalance cb = new CanBalance();

        int[] example1 = {1, 1, 1, 2, 1};
        System.out.println(cb.canBalance(example1)); // true
        // Explanation: split between index 2 and 3 → leftSum = 3, rightSum = 3

        int[] example2 = {2, 1, 1, 2, 1};
        System.out.println(cb.canBalance(example2)); // false
        // No split gives equal sums

        int[] example3 = {10, 10};
        System.out.println(cb.canBalance(example3)); // true
        // Split between 10 and 10 → leftSum = 10, rightSum = 10
    }
}
