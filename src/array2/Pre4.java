package array2;

/**
 * pre4 - CodingBat Array-2
 *
 * Given a non-empty array of ints, return a new array containing
 * the elements that come before the first 4 in the array.
 */
public class Pre4 {

    public int[] pre4(int[] nums) {
        int index = 0;

        // Find the index of the first 4
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                index = i;
                break; // stop at the first 4
            }
        }

        // Create new array with elements before the first 4
        int[] arr = new int[index];
        System.arraycopy(nums, 0, arr, 0, index);

        return arr;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Pre4 p = new Pre4();
        System.out.println(java.util.Arrays.toString(p.pre4(new int[]{1, 2, 4, 1})));     // [1, 2]
        System.out.println(java.util.Arrays.toString(p.pre4(new int[]{3, 1, 4})));        // [3, 1]
        System.out.println(java.util.Arrays.toString(p.pre4(new int[]{1, 4, 4})));        // [1]
        System.out.println(java.util.Arrays.toString(p.pre4(new int[]{4, 1, 2, 3})));     // []
    }
}
