package recursion1;

/**
 * Array11 - CodingBat Recursion-1
 *
 * Recursively counts the number of times 11 appears in the array.
 */
public class Array11 {

    /**
     * Counts the occurrences of 11 in the array starting at the given index.
     *
     * @param nums  input array of integers
     * @param index current index to check
     * @return number of times 11 appears from index to the end
     */
    public int array11(int[] nums, int index) {
        // Base case: index has reached or passed the end of the array
        if (index >= nums.length) return 0;

        // If current element is 11, count it and recurse
        if (nums[index] == 11) return 1 + array11(nums, index + 1);

        // Otherwise, just recurse without counting
        return array11(nums, index + 1);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Array11 a11 = new Array11();
        System.out.println(a11.array11(new int[]{1, 2, 11}, 0));        // 1
        System.out.println(a11.array11(new int[]{11, 11}, 0));          // 2
        System.out.println(a11.array11(new int[]{1, 2, 3, 4}, 0));      // 0
        System.out.println(a11.array11(new int[]{11, 2, 11, 11}, 0));  // 3
    }
}
