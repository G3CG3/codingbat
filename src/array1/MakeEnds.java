package array1;

/**
 * MakeEnds - CodingBat Array-1
 *
 * Given an array of ints, return a new array length 2 containing the first and last elements
 * from the original array. The original array will be length 1 or more.
 */
public class MakeEnds {

    /**
     * Returns a new array with the first and last elements of the input array.
     *
     * @param nums input array (length ≥ 1)
     * @return new array of length 2
     */
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public static void main(String[] args) {
        MakeEnds me = new MakeEnds();
        int[] result = me.makeEnds(new int[]{1, 2, 3, 4});
        System.out.println(java.util.Arrays.toString(result)); // [1, 4]
    }
}