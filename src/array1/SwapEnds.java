package array1;

/**
 * SwapEnds - CodingBat Array-1
 *
 * Given an array of ints, swap the first and last elements in the array.
 * Return the modified array. The array length will be at least 1.
 */
public class SwapEnds {

    /**
     * Swaps the first and last elements of an array.
     *
     * @param nums input array of ints (length ≥ 1)
     * @return array with first and last elements swapped
     */
    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public static void main(String[] args) {
        SwapEnds se = new SwapEnds();
        int[] result1 = se.swapEnds(new int[]{1, 2, 3, 4}); // {4, 2, 3, 1}
        int[] result2 = se.swapEnds(new int[]{7, 9, 5});    // {5, 9, 7}

        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
    }
}
