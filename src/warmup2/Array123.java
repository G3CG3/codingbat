package warmup2;

/**
 * Array123 - CodingBat Warmup-2
 *
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3
 * appears in the array somewhere.
 */
public class Array123 {

    /**
     * Checks if the sequence 1,2,3 appears in the array.
     *
     * @param nums input array of integers
     * @return true if sequence 1,2,3 appears, false otherwise
     */
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Array123 a123 = new Array123();
        System.out.println(a123.array123(new int[]{1, 1, 2, 3, 1})); // true
        System.out.println(a123.array123(new int[]{1, 1, 2, 4, 1})); // false
        System.out.println(a123.array123(new int[]{1, 2, 3}));       // true
        System.out.println(a123.array123(new int[]{1, 2}));          // false
    }
}
