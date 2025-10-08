package array2;

/**
 * has77 - CodingBat Array-2
 *
 * Given an array of ints, return true if the array contains two 7's next to each other,
 * or there are two 7's separated by one element, such as with {7, 1, 7}.
 */
public class Has77 {

    /**
     * Checks if the array contains two 7's next to each other,
     * or separated by one element.
     *
     * @param nums the input array
     * @return true if the condition is met, false otherwise
     */
    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) return true;
            if (i + 2 < nums.length && nums[i] == 7 && nums[i + 2] == 7) return true;
        }
        return false;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        Has77 h = new Has77();

        System.out.println(h.has77(new int[]{1, 7, 7}));      // → true
        System.out.println(h.has77(new int[]{1, 7, 1, 7}));   // → true
        System.out.println(h.has77(new int[]{1, 7, 1, 1, 7})); // → false
    }
}
