package array1;

/**
 * MaxEnd3 - CodingBat Array-1
 *
 * Given an array of ints length 3, figure out which is larger, the first or last element,
 * and set all the other elements to be that value. Return the changed array.
 */
public class MaxEnd3 {

    /**
     * Sets all elements to the larger of the first or last element.
     *
     * @param nums input array of length 3
     * @return modified array
     */
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MaxEnd3 me = new MaxEnd3();
        System.out.println(java.util.Arrays.toString(me.maxEnd3(new int[]{1, 2, 3}))); // [3, 3, 3]
        System.out.println(java.util.Arrays.toString(me.maxEnd3(new int[]{11, 5, 9}))); // [11, 11, 11]
        System.out.println(java.util.Arrays.toString(me.maxEnd3(new int[]{2, 11, 3}))); // [3, 3, 3]
    }
}
