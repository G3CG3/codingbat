package array2;

/**
 * withoutTen - CodingBat Array-2
 *
 * Returns a version of the array with all 10's removed,
 * shifting remaining elements left and filling the rest with 0.
 */
public class WithoutTen {

    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int n : nums) {
            if (n != 10) {
                result[index] = n;
                index++;
            }
        }

        // The rest of result[] is already 0 by default
        return result;
    }

    // Optional main() for testing
    public static void main(String[] args) {
        WithoutTen w = new WithoutTen();
        System.out.println(java.util.Arrays.toString(w.withoutTen(new int[]{1, 10, 10, 2}))); // [1, 2, 0, 0]
        System.out.println(java.util.Arrays.toString(w.withoutTen(new int[]{10, 2, 10})));    // [2, 0, 0]
        System.out.println(java.util.Arrays.toString(w.withoutTen(new int[]{1, 99, 10})));    // [1, 99, 0]
    }
}
