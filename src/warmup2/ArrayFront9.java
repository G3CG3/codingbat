package warmup2;

/**
 * ArrayFront9 - CodingBat Warmup-2
 *
 * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
 * The array length may be less than 4.
 */
public class ArrayFront9 {

    /**
     * Checks if a 9 appears in the first 4 elements of the array.
     *
     * @param nums input array of integers
     * @return true if 9 is found in the first 4 elements, false otherwise
     */
    public boolean arrayFront9(int[] nums) {
        int end = Math.min(nums.length, 4);
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ArrayFront9 af9 = new ArrayFront9();
        System.out.println(af9.arrayFront9(new int[]{1, 2, 9, 3, 4})); // true
        System.out.println(af9.arrayFront9(new int[]{1, 2, 3, 4, 9})); // false
        System.out.println(af9.arrayFront9(new int[]{1, 2, 3}));       // false
        System.out.println(af9.arrayFront9(new int[]{9, 2, 3}));       // true
    }
}
