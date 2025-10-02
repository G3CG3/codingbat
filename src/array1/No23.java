package array1;

/**
 * No23 - CodingBat Array-1
 *
 * Given an int array length 2, return true if it does not contain a 2 or 3.
 */
public class No23 {

    /**
     * Checks if the array does not contain 2 or 3.
     *
     * @param nums int array of length 2
     * @return true if array contains neither 2 nor 3
     */
    public boolean no23(int[] nums) {
        return nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3;
    }

    public static void main(String[] args) {
        No23 n23 = new No23();
        System.out.println(n23.no23(new int[]{1, 4})); // true
        System.out.println(n23.no23(new int[]{2, 5})); // false
        System.out.println(n23.no23(new int[]{3, 3})); // false
    }
}