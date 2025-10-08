package array2;

/**
 * tenRun - CodingBat Array-2
 *
 * For each multiple of 10 in the given array, changes all the values following it
 * to be that multiple of 10, until encountering another multiple of 10.
 */
public class TenRun {

    /**
     * Modifies the array so that after each multiple of 10,
     * all following numbers become that multiple until another multiple of 10 appears.
     *
     * @param nums input array of integers
     * @return the modified array
     */
    public int[] tenRun(int[] nums) {
        Integer currentMultiple = null;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                currentMultiple = nums[i];
            } else if (currentMultiple != null) {
                nums[i] = currentMultiple;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        TenRun t = new TenRun();

        int[][] tests = {
                {2, 10, 3, 4, 20, 5},
                {10, 1, 9, 20, 5, 13, 40, 7},
                {1, 2, 3, 4, 5},
                {10, 10, 20, 20}
        };

        for (int[] test : tests) {
            System.out.print("Input:  ");
            printArray(test);
            int[] result = t.tenRun(test.clone());
            System.out.print(" → Output: ");
            printArray(result);
            System.out.println();
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.print("}");
    }
}
