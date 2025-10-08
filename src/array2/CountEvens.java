package array2;

/**
 * countEvens - CodingBat Array-2
 *
 * Given an array of ints, return the number of even ints in the array.
 * Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
 */
public class CountEvens {

    /**
     * Counts how many even numbers exist in the given array.
     *
     * @param nums the array of integers
     * @return the number of even integers in the array
     */
    public int countEvens(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n % 2 == 0) count++;
        }
        return count;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        CountEvens ce = new CountEvens();

        System.out.println(ce.countEvens(new int[]{2, 1, 2, 3, 4}));  // → 3
        System.out.println(ce.countEvens(new int[]{2, 2, 0}));        // → 3
        System.out.println(ce.countEvens(new int[]{1, 3, 5}));        // → 0
        System.out.println(ce.countEvens(new int[]{}));               // → 0
    }
}
