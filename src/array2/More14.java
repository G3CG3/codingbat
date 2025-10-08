package array2;

/**
 * more14 - CodingBat Array-2
 *
 * Given an array of ints, return true if the number of 1's is greater
 * than the number of 4's.
 */
public class More14 {

    /**
     * Checks if the array contains more 1's than 4's.
     *
     * @param nums the array of integers
     * @return true if count(1) > count(4), false otherwise
     */
    public boolean more14(int[] nums) {
        int ones = 0;
        int fours = 0;

        for (int n : nums) {
            if (n == 1) ones++;
            if (n == 4) fours++;
        }

        return ones > fours;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        More14 m = new More14();
        System.out.println(m.more14(new int[]{1, 4, 1}));       // → true
        System.out.println(m.more14(new int[]{1, 4, 1, 4}));    // → false
        System.out.println(m.more14(new int[]{1, 1}));          // → true
        System.out.println(m.more14(new int[]{4, 4, 4}));       // → false
        System.out.println(m.more14(new int[]{}));               // → false
    }
}
