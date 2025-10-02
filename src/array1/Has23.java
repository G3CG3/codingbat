package array1;

/**
 * Has23 - CodingBat Array-1
 *
 * Given an int array length 2, return true if it contains a 2 or a 3.
 */
public class Has23 {

    /**
     * Checks if the array contains a 2 or a 3.
     *
     * @param nums int array of length 2
     * @return true if array contains 2 or 3
     */
    public boolean has23(int[] nums) {
        return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
    }

    public static void main(String[] args) {
        Has23 h23 = new Has23();
        System.out.println(h23.has23(new int[]{1, 2})); // true
        System.out.println(h23.has23(new int[]{4, 3})); // true
        System.out.println(h23.has23(new int[]{4, 5})); // false
    }
}
