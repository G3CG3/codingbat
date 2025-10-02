package array1;

/**
 * FirstLast6 - CodingBat Array-1
 *
 * Given an array of ints, return true if 6 appears as either the
 * first or last element in the array. The array will be length 1 or more.
 */
public class FirstLast6 {

    /**
     * Checks if the first or last element of the array is 6.
     *
     * @param nums the input array (length >= 1)
     * @return true if 6 is the first or last element
     */
    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        FirstLast6 fl = new FirstLast6();
        System.out.println(fl.firstLast6(new int[]{1, 2, 6})); // true
        System.out.println(fl.firstLast6(new int[]{6, 1, 2, 3})); // true
        System.out.println(fl.firstLast6(new int[]{13, 6, 1, 2, 3})); // false
        System.out.println(fl.firstLast6(new int[]{6})); // true
    }
}
