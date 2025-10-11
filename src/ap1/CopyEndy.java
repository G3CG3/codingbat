package ap1;

/**
 * CopyEndy - CodingBat AP-1
 *
 * Returns a new array containing the first 'count' endy numbers
 * from the given array. A number is "endy" if it is in the range
 * 0..10 or 90..100 (inclusive).
 */
public class CopyEndy {

    /**
     * Returns an array with the first 'count' endy numbers from nums.
     *
     * @param nums  the source array (contains at least 'count' endy numbers)
     * @param count the number of endy numbers to copy
     * @return a new array of length 'count' containing the first endy numbers
     */
    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length && index < count; i++) {
            if (isEndy(nums[i])) {
                result[index] = nums[i];
                index++;
            }
        }

        return result;
    }

    /**
     * Determines if a number is "endy" (0..10 or 90..100 inclusive).
     *
     * @param n the number to check
     * @return true if n is endy, false otherwise
     */
    private boolean isEndy(int n) {
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CopyEndy ce = new CopyEndy();
        int[] nums = {9, 11, 90, 22, 6, 99};
        int[] result = ce.copyEndy(nums, 3);

        for (int n : result) {
            System.out.print(n + " "); // 9 90 6
        }
    }
}
