package array1;

/**
 * Fix23 - CodingBat Array-1
 *
 * Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
 * set the 3 element to 0. Return the changed array.
 */
public class Fix23 {

    /**
     * Replaces 3 with 0 when it immediately follows a 2 in a length-3 array.
     *
     * @param nums input array of length 3
     * @return modified array
     */
    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) nums[1] = 0;
        if (nums[1] == 2 && nums[2] == 3) nums[2] = 0;
        return nums;
    }

    public static void main(String[] args) {
        Fix23 f23 = new Fix23();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 5};
        int[] arr3 = {2, 3, 3};

        System.out.println(java.util.Arrays.toString(f23.fix23(arr1))); // [1, 2, 3]
        System.out.println(java.util.Arrays.toString(f23.fix23(arr2))); // [2, 0, 5]
        System.out.println(java.util.Arrays.toString(f23.fix23(arr3))); // [2, 0, 3]
    }
}
