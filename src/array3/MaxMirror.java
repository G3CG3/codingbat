package array3;

/**
 * MaxMirror - CodingBat Array-3
 *
 * Returns the size of the largest "mirror" section in an array.
 * A mirror section is a group of contiguous elements such that
 * somewhere else in the array, the same group appears in reverse order.
 */
public class MaxMirror {

    /**
     * Finds the largest mirror section length in the given array.
     *
     * @param nums input array
     * @return length of the largest mirror section
     */
    public int maxMirror(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int length = 0;
                int x = i;
                int y = j;
                // count contiguous matching elements
                while (x < nums.length && y >= 0 && nums[x] == nums[y]) {
                    length++;
                    x++;
                    y--;
                }
                if (length > max) max = length;
            }
        }

        return max;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MaxMirror mm = new MaxMirror();

        int[] arr1 = {1, 2, 3, 8, 9, 3, 2, 1};
        System.out.println(mm.maxMirror(arr1)); // 3

        int[] arr2 = {1, 2, 1, 4};
        System.out.println(mm.maxMirror(arr2)); // 3

        int[] arr3 = {7, 1, 2, 9, 7, 2, 1};
        System.out.println(mm.maxMirror(arr3)); // 2
    }
}
