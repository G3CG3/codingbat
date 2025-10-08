package array2;

/**
 * has22 - CodingBat Array-2
 *
 * Return true if the array contains a 2 next to a 2 somewhere.
 */
public class Has22 {

    /**
     * Checks if there are two consecutive 2s in the array.
     *
     * @param nums the array of integers
     * @return true if a pair of adjacent 2s exists, false otherwise
     */
    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Has22 h = new Has22();

        System.out.println(h.has22(new int[]{1, 2, 2}));     // → true
        System.out.println(h.has22(new int[]{1, 2, 1, 2}));  // → false
        System.out.println(h.has22(new int[]{2, 1, 2}));     // → false
        System.out.println(h.has22(new int[]{2, 2, 2}));     // → true
        System.out.println(h.has22(new int[]{}));            // → false
    }
}
