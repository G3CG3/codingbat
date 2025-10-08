package array2;

/**
 * zeroFront - CodingBat Array-2
 *
 * Return an array that contains the same numbers as the given array,
 * but with all zeros grouped at the start.
 */
public class ZeroFront {

    public int[] zeroFront(int[] nums) {
        int insertPos = 0; // θέση για τα μηδενικά

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                // swap nums[i] με nums[insertPos]
                int temp = nums[i];
                nums[i] = nums[insertPos];
                nums[insertPos] = temp;
                insertPos++;
            }
        }
        return nums;
    }

    // Optional: main() για testing
    public static void main(String[] args) {
        ZeroFront zf = new ZeroFront();
        int[] arr1 = {1, 0, 0, 1};
        int[] arr2 = {0, 1, 1, 0, 0};
        int[] arr3 = {1, 0};

        System.out.println(java.util.Arrays.toString(zf.zeroFront(arr1))); // [0, 0, 1, 1]
        System.out.println(java.util.Arrays.toString(zf.zeroFront(arr2))); // [0, 0, 0, 1, 1]
        System.out.println(java.util.Arrays.toString(zf.zeroFront(arr3))); // [0, 1]
    }
}
