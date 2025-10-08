package array2;

/**
 * shiftLeft - CodingBat Array-2
 *
 * Returns an array that is "left shifted" by one position.
 * For example, {6, 2, 5, 3} becomes {2, 5, 3, 6}.
 * The given array may be modified and returned, or a new array can be returned.
 */
public class ShiftLeft {

    /**
     * Shifts all elements of the given array one position to the left,
     * moving the first element to the end.
     *
     * @param nums the input array of integers
     * @return the left-shifted array
     */
    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) return nums;

        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

    /**
     * Optional main() method for quick local testing.
     */
    public static void main(String[] args) {
        ShiftLeft s = new ShiftLeft();

        int[][] tests = {
                {6, 2, 5, 3},
                {1, 2, 3, 4, 5},
                {7},
                {}
        };

        for (int[] test : tests) {
            int[] result = s.shiftLeft(test.clone());
            System.out.print("Input: ");
            printArray(test);
            System.out.print(" → Output: ");
            printArray(result);
            System.out.println();
        }
    }

    // Utility method for printing arrays nicely
    private static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.print("}");
    }
}
