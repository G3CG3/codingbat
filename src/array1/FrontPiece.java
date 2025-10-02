package array1;

/**
 * FrontPiece - CodingBat Array-1
 *
 * Given an int array of any length, return a new array of its first 2 elements.
 * If the array is smaller than length 2, use whatever elements are present.
 */
public class FrontPiece {

    /**
     * Returns a new array of the first 2 elements of nums,
     * or the entire array if it has less than 2 elements.
     *
     * @param nums input array
     * @return array containing first 2 elements (or fewer if nums.length < 2)
     */
    public int[] frontPiece(int[] nums) {
        if (nums.length < 2) return nums;
        return new int[]{nums[0], nums[1]};
    }

    public static void main(String[] args) {
        FrontPiece fp = new FrontPiece();
        int[] result1 = fp.frontPiece(new int[]{1, 2, 3});
        int[] result2 = fp.frontPiece(new int[]{1});
        int[] result3 = fp.frontPiece(new int[]{});

        for (int n : result1) System.out.print(n + " "); // 1 2
        System.out.println();
        for (int n : result2) System.out.print(n + " "); // 1
        System.out.println();
        for (int n : result3) System.out.print(n + " "); // (empty)
    }
}
