package array2;

/**
 * twoTwo - CodingBat Array-2
 *
 * Given an array of ints, return true if every 2 that appears in the array
 * is next to another 2.
 */
public class TwoTwo {

    /**
     * Checks if every 2 in the array has another 2 adjacent to it.
     *
     * @param nums the input array
     * @return true if all 2's are adjacent to at least one other 2
     */
    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                boolean left = (i > 0 && nums[i - 1] == 2);
                boolean right = (i < nums.length - 1 && nums[i + 1] == 2);
                if (!left && !right) {
                    return false; // lonely 2 found
                }
            }
        }
        return true;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        TwoTwo t = new TwoTwo();

        System.out.println(t.twoTwo(new int[]{4, 2, 2, 3}));   // → true
        System.out.println(t.twoTwo(new int[]{2, 2, 4}));      // → true
        System.out.println(t.twoTwo(new int[]{2, 2, 4, 2}));   // → false (last 2 is alone)
        System.out.println(t.twoTwo(new int[]{1, 3, 4}));      // → true (no 2s)
        System.out.println(t.twoTwo(new int[]{2, 2, 2, 3}));   // → true (all together)
        System.out.println(t.twoTwo(new int[]{2}));            // → false (single 2)
    }
}
