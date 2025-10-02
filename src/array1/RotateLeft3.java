package array1;

/**
 * RotateLeft3 - CodingBat Array-1
 *
 * Given an array of ints length 3, return an array with the elements "rotated left".
 * Example: {1, 2, 3} yields {2, 3, 1}.
 */
public class RotateLeft3 {

    /**
     * Rotates an array of length 3 to the left.
     *
     * @param nums input array of length 3
     * @return rotated array
     */
    public int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = temp;
        return nums;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        RotateLeft3 rl = new RotateLeft3();
        int[] result1 = rl.rotateLeft3(new int[]{1, 2, 3});
        int[] result2 = rl.rotateLeft3(new int[]{5, 11, 9});
        int[] result3 = rl.rotateLeft3(new int[]{7, 0, 0});

        // Print results
        System.out.println(java.util.Arrays.toString(result1)); // [2, 3, 1]
        System.out.println(java.util.Arrays.toString(result2)); // [11, 9, 5]
        System.out.println(java.util.Arrays.toString(result3)); // [0, 0, 7]
    }
}
