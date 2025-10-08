package array2;

/**
 * post4 - CodingBat Array-2
 *
 * Given a non-empty array of ints, return a new array containing the
 * elements from the original array that come after the last 4 in the
 * original array. The original array will contain at least one 4.
 */
public class Post4 {

    /**
     * Returns a new array with elements after the last 4.
     *
     * @param nums input array containing at least one 4
     * @return array of elements after the last 4
     */
    public int[] post4(int[] nums) {
        int last4Index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) last4Index = i;
        }

        int newLength = nums.length - last4Index - 1;
        int[] result = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            result[i] = nums[last4Index + 1 + i];
        }

        return result;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Post4 p = new Post4();

        int[] arr1 = {1, 2, 4, 1, 2};
        int[] arr2 = {4, 1, 4, 2};
        int[] arr3 = {4, 4, 1, 2, 3};

        System.out.println(java.util.Arrays.toString(p.post4(arr1))); // [1, 2]
        System.out.println(java.util.Arrays.toString(p.post4(arr2))); // [2]
        System.out.println(java.util.Arrays.toString(p.post4(arr3))); // [1, 2, 3]
    }
}
