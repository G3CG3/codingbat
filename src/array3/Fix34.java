package array3;

/**
 * Fix34 - CodingBat Array-3
 *
 * Rearranges the array so that every 3 is immediately followed by a 4.
 * 3's do not move. Other numbers may move. Assumes same number of 3's and 4's.
 */
public class Fix34 {

    /**
     * Rearranges array so that each 3 is followed by a 4.
     *
     * @param nums input array of ints
     * @return rearranged array
     */
    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && (j == 0 || nums[j - 1] != 3)) {
                        // swap nums[i+1] and nums[j]
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        break; // stop after placing this 4
                    }
                }
            }
        }
        return nums;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Fix34 f = new Fix34();

        int[] arr1 = {1, 3, 1, 4};
        int[] arr2 = {3, 2, 2, 4};
        int[] arr3 = {3, 1, 4, 3, 2, 4};

        System.out.println(java.util.Arrays.toString(f.fix34(arr1))); // [1, 3, 4, 1]
        System.out.println(java.util.Arrays.toString(f.fix34(arr2))); // [3, 4, 2, 2]
        System.out.println(java.util.Arrays.toString(f.fix34(arr3))); // [3, 4, 1, 3, 4, 2]
    }
}
