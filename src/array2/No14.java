package array2;

/**
 * no14 - CodingBat Array-2
 *
 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
 */
public class No14 {

    /**
     * Checks if the array contains no 1's or no 4's.
     *
     * @param nums the input array
     * @return true if the array has no 1's or no 4's
     */
    public boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;

        for (int n : nums) {
            if (n == 1) has1 = true;
            if (n == 4) has4 = true;
        }

        return !has1 || !has4;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        No14 n = new No14();

        System.out.println(n.no14(new int[]{1, 2, 3}));      // → true (no 4)
        System.out.println(n.no14(new int[]{2, 3, 4}));      // → true (no 1)
        System.out.println(n.no14(new int[]{1, 2, 3, 4}));   // → false (has both)
        System.out.println(n.no14(new int[]{}));             // → true (has neither)
    }
}
