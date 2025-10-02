package array1;

/**
 * Reverse3 - CodingBat Array-1
 *
 * Given an array of ints length 3, return a new array with the elements in reverse order.
 * Example: {1, 2, 3} becomes {3, 2, 1}.
 */
public class Reverse3 {

    /**
     * Reverses an array of length 3.
     *
     * @param nums input array of length 3
     * @return reversed array
     */
    public int[] reverse3(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[2];
        nums[2] = temp;
        return nums;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Reverse3 rev = new Reverse3();
        int[] result1 = rev.reverse3(new int[]{1, 2, 3});
        int[] result2 = rev.reverse3(new int[]{5, 11, 9});
        int[] result3 = rev.reverse3(new int[]{7, 0, 0});

        // Print results
        System.out.println(java.util.Arrays.toString(result1)); // [3, 2, 1]
        System.out.println(java.util.Arrays.toString(result2)); // [9, 11, 5]
        System.out.println(java.util.Arrays.toString(result3)); // [0, 0, 7]
    }
}
