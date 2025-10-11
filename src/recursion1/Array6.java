package recursion1;

/**
 * Array6 - CodingBat Recursion-1
 *
 * Recursively checks if the array contains a 6 starting from a given index.
 */
public class Array6 {

    /**
     * Recursively checks if the array contains a 6 starting at the given index.
     *
     * @param nums  input array of integers
     * @param index current index to check
     * @return true if 6 is found, false otherwise
     */
    public boolean array6(int[] nums, int index) {
        // Base case: index has reached the end of the array
        if (index >= nums.length) return false;

        // If current element is 6, return true
        if (nums[index] == 6) return true;

        // Recurse on the next index
        return array6(nums, index + 1);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Array6 a6 = new Array6();
        System.out.println(a6.array6(new int[]{1, 6, 4}, 0)); // true
        System.out.println(a6.array6(new int[]{1, 4}, 0));    // false
        System.out.println(a6.array6(new int[]{6}, 0));       // true
        System.out.println(a6.array6(new int[]{}, 0));        // false
    }
}
