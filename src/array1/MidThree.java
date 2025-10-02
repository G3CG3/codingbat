package array1;

/**
 * MidThree - CodingBat Array-1
 *
 * Given an array of ints of odd length, return a new array length 3
 * containing the elements from the middle of the array.
 * The array length will be at least 3.
 */
public class MidThree {

    /**
     * Returns the middle three elements of an odd-length array.
     *
     * @param nums input array of ints (odd length ≥ 3)
     * @return new array length 3 with middle elements
     */
    public int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }

    public static void main(String[] args) {
        MidThree mt = new MidThree();
        int[] result1 = mt.midThree(new int[]{1, 2, 3, 4, 5});   // {2, 3, 4}
        int[] result2 = mt.midThree(new int[]{7, 1, 9});         // {7, 1, 9}

        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
    }
}
