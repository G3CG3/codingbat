package array2;

/**
 * has12 - CodingBat Array-2
 *
 * Given an array of ints, return true if there is a 1 in the array
 * with a 2 somewhere later in the array.
 */
public class Has12 {

    /**
     * Checks if there is a 1 in the array followed by a 2 later.
     *
     * @param nums the input array
     * @return true if 1 appears before 2, false otherwise
     */
    public boolean has12(int[] nums) {
        boolean has1 = false;

        for (int n : nums) {
            if (n == 1) has1 = true;
            if (n == 2 && has1) return true;
        }

        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Has12 h = new Has12();

        System.out.println(h.has12(new int[]{1, 3, 2}));     // → true
        System.out.println(h.has12(new int[]{3, 1, 2}));     // → true
        System.out.println(h.has12(new int[]{3, 1, 4, 5, 2})); // → true
        System.out.println(h.has12(new int[]{3, 2, 1}));     // → false
        System.out.println(h.has12(new int[]{1, 1, 1}));     // → false
    }
}
