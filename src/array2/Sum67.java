package array2;

/**
 * sum67 - CodingBat Array-2
 *
 * Return the sum of the numbers in the array, except ignore sections of numbers
 * starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
 */
public class Sum67 {

    /**
     * Computes the sum ignoring sections from 6 to the next 7.
     *
     * @param nums the array of integers
     * @return the sum according to the rule
     */
    public int sum67(int[] nums) {
        int sum = 0;
        boolean inBlock = false;

        for (int n : nums) {
            if (n == 6) inBlock = true;
            if (!inBlock) sum += n;
            if (n == 7 && inBlock) inBlock = false;
        }

        return sum;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Sum67 s = new Sum67();

        System.out.println(s.sum67(new int[]{1, 2, 2}));             // → 5
        System.out.println(s.sum67(new int[]{1, 2, 2, 6, 99, 99, 7})); // → 5
        System.out.println(s.sum67(new int[]{1, 1, 6, 7, 2}));       // → 4
        System.out.println(s.sum67(new int[]{}));                    // → 0
        System.out.println(s.sum67(new int[]{6, 7, 6, 7}));          // → 0
    }
}
