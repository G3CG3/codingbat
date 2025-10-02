package array1;

/**
 * Double23 - CodingBat Array-1
 *
 * Given an int array, return true if the array contains 2 twice, or 3 twice.
 * The array will be length 0, 1, or 2.
 */
public class Double23 {

    /**
     * Checks if the array contains two 2's or two 3's.
     *
     * @param nums input array (length 0..2)
     * @return true if two 2's or two 3's are present
     */
    public boolean double23(int[] nums) {
        if (nums.length < 2) return false;
        return nums[0] == nums[1] && (nums[0] == 2 || nums[0] == 3);
    }

    public static void main(String[] args) {
        Double23 d23 = new Double23();
        System.out.println(d23.double23(new int[]{2, 2})); // true
        System.out.println(d23.double23(new int[]{3, 3})); // true
        System.out.println(d23.double23(new int[]{2, 3})); // false
        System.out.println(d23.double23(new int[]{2}));    // false
    }
}
