package array2;

/**
 * either24 - CodingBat Array-2
 *
 * Given an array of ints, return true if the array contains a 2 next to a 2
 * or a 4 next to a 4, but not both.
 */
public class Either24 {

    /**
     * Checks whether the array contains a pair of adjacent 2s or a pair of
     * adjacent 4s, but not both.
     *
     * @param nums the input array
     * @return true if either condition (but not both) is true
     */
    public boolean either24(int[] nums) {
        boolean has2 = false;
        boolean has4 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) has2 = true;
            if (nums[i] == 4 && nums[i + 1] == 4) has4 = true;
        }

        return has2 != has4; // true if only one of them is true
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        Either24 e = new Either24();

        System.out.println(e.either24(new int[]{1, 2, 2}));        // → true
        System.out.println(e.either24(new int[]{4, 4, 1}));        // → true
        System.out.println(e.either24(new int[]{4, 4, 1, 2, 2}));  // → false
        System.out.println(e.either24(new int[]{1, 2, 3, 4}));     // → false
        System.out.println(e.either24(new int[]{2, 2, 4, 4}));     // → false
    }
}
