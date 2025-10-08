package array2;

/**
 * haveThree - CodingBat Array-2
 *
 * Given an array of ints, return true if the value 3 appears
 * exactly 3 times in the array, and no 3's are next to each other.
 */
public class HaveThree {

    /**
     * Checks if the value 3 appears exactly 3 times and never consecutively.
     *
     * @param nums the input array
     * @return true if 3 appears exactly 3 times and no adjacent 3's exist
     */
    public boolean haveThree(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i > 0 && nums[i - 1] == 3) {
                    return false; // consecutive 3's → fail immediately
                }
            }
        }

        return count == 3;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        HaveThree h = new HaveThree();

        System.out.println(h.haveThree(new int[]{3, 1, 3, 1, 3}));   // → true
        System.out.println(h.haveThree(new int[]{3, 1, 3, 3}));      // → false (two 3's together)
        System.out.println(h.haveThree(new int[]{3, 1, 3, 1, 3, 1}));// → true
        System.out.println(h.haveThree(new int[]{1, 3, 1, 3, 1, 3}));// → true
        System.out.println(h.haveThree(new int[]{3, 3, 3}));          // → false (consecutive)
        System.out.println(h.haveThree(new int[]{3, 1, 3, 1}));       // → false (only 2 threes)
    }
}
