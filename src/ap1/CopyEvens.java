package ap1;

/**
 * CopyEvens - CodingBat AP-1
 *
 * Returns a new array containing the first 'count' even numbers
 * from the given array of positive integers.
 */
public class CopyEvens {

    /**
     * Returns an array with the first 'count' even numbers from nums.
     *
     * @param nums  the source array (contains at least 'count' even numbers)
     * @param count the number of even numbers to copy
     * @return a new array of length 'count' containing the first evens
     */
    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length && index < count; i++) {
            if (nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
            }
        }

        return result;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CopyEvens ce = new CopyEvens();
        int[] nums = {3, 2, 4, 5, 8};
        int[] result = ce.copyEvens(nums, 3);

        for (int n : result) {
            System.out.print(n + " "); // 2 4 8
        }
    }
}
