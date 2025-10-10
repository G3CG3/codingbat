package array3;

/**
 * Fix45 - CodingBat Array-3
 *
 * Rearranges an array so that every 4 is immediately followed by a 5.
 * The 4's do not move, but other numbers (including 5's) can move.
 * Assumes the array has the same number of 4's and 5's,
 * and every 4 has a number after it that is not a 4.
 */
public class Fix45 {

    /**
     * Rearranges the array so each 4 is followed by a 5.
     *
     * @param nums input array
     * @return rearranged array
     */
    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                // Find a 5 that is not already following a 4
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
                        // Swap the number after 4 with this 5
                        int temp = nums[i + 1];
                        nums[i + 1] = 5;
                        nums[j] = temp;
                        break; // stop after first suitable 5
                    }
                }
            }
        }
        return nums;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Fix45 f = new Fix45();
        int[] arr1 = {5, 4, 9, 4, 9, 5};
        int[] result1 = f.fix45(arr1); // expected: {9, 4, 5, 4, 5, 9}
        for (int n : result1) System.out.print(n + " ");
        System.out.println();

        int[] arr2 = {1, 4, 1, 5};
        int[] result2 = f.fix45(arr2); // expected: {1, 4, 5, 1}
        for (int n : result2) System.out.print(n + " ");
        System.out.println();
    }
}
