package warmup2;

/**
 * ArrayCount9 - CodingBat Warmup-2
 *
 * Given an array of ints, return the number of 9's in the array.
 */
public class ArrayCount9 {

    /**
     * Counts the number of 9's in the input array.
     *
     * @param nums input array of integers
     * @return count of 9's
     */
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ArrayCount9 ac9 = new ArrayCount9();
        System.out.println(ac9.arrayCount9(new int[]{1, 2, 9}));          // 1
        System.out.println(ac9.arrayCount9(new int[]{1, 9, 9}));          // 2
        System.out.println(ac9.arrayCount9(new int[]{1, 9, 9, 3, 9}));    // 3
        System.out.println(ac9.arrayCount9(new int[]{1, 2, 3}));          // 0
    }
}
