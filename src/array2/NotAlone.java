package array2;

/**
 * notAlone - CodingBat Array-2
 *
 * We'll say that an element in an array is "alone" if there are values
 * before and after it, and those values are different from it. Return
 * a version of the array where every instance of the given value which
 * is alone is replaced by whichever value to its left or right is larger.
 */
public class NotAlone {

    /**
     * Replaces "alone" elements equal to val with the larger neighbor.
     *
     * @param nums input array
     * @param val  the value to check for "alone" instances
     * @return modified array
     */
    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) { // ξεκινάμε από 1 και πηγαίνουμε μέχρι length-2
            if (nums[i] == val && nums[i-1] != val && nums[i+1] != val) {
                nums[i] = Math.max(nums[i-1], nums[i+1]);
            }
        }
        return nums;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NotAlone n = new NotAlone();

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 2, 5, 2};
        int[] arr3 = {3, 4};

        System.out.println(java.util.Arrays.toString(n.notAlone(arr1, 2))); // [1, 3, 3]
        System.out.println(java.util.Arrays.toString(n.notAlone(arr2, 2))); // [1, 3, 3, 5, 5, 2]
        System.out.println(java.util.Arrays.toString(n.notAlone(arr3, 3))); // [3, 4]
    }
}
