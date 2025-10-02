package array1;

/**
 * MakeMiddle - CodingBat Array-1
 *
 * Given an array of ints of even length, return a new array length 2 containing
 * the middle two elements from the original array. The original array will be length 2 or more.
 */
public class MakeMiddle {

    /**
     * Returns a new array with the middle two elements of the given even-length array.
     *
     * @param nums input array of even length (>=2)
     * @return new array with middle two elements
     */
    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[(nums.length / 2) - 1], nums[nums.length / 2]};
    }

    public static void main(String[] args) {
        MakeMiddle mm = new MakeMiddle();
        int[] result1 = mm.makeMiddle(new int[]{1, 2, 3, 4}); // {2, 3}
        int[] result2 = mm.makeMiddle(new int[]{7, 1, 2, 3, 4, 9}); // {2, 3}

        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
    }
}
