package array2;

/**
 * only14 - CodingBat Array-2
 *
 * Given an array of ints, return true if every element is a 1 or a 4.
 */
public class Only14 {

    /**
     * Checks if every element in the array is either 1 or 4.
     *
     * @param nums the input array
     * @return true if all elements are 1 or 4, false otherwise
     */
    public boolean only14(int[] nums) {
        for (int n : nums) {
            if (n != 1 && n != 4) return false;
        }
        return true;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Only14 o = new Only14();

        System.out.println(o.only14(new int[]{1, 4, 1, 4}));  // → true
        System.out.println(o.only14(new int[]{1, 4, 2, 4}));  // → false
        System.out.println(o.only14(new int[]{1, 1}));        // → true
        System.out.println(o.only14(new int[]{}));            // → true (empty array counts as true)
    }
}
