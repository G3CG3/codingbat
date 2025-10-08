package array2;

/**
 * tripleUp - CodingBat Array-2
 *
 * Return true if the array contains, somewhere, three increasing adjacent numbers
 * like 4, 5, 6 or 23, 24, 25.
 */
public class TripleUp {

    /**
     * Checks if there are three adjacent increasing numbers in the array.
     *
     * @param nums the input array
     * @return true if such a triple exists, false otherwise
     */
    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
                return true;
            }
        }
        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        TripleUp t = new TripleUp();

        System.out.println(t.tripleUp(new int[]{1, 4, 5, 6, 2}));   // → true
        System.out.println(t.tripleUp(new int[]{1, 2, 3}));         // → true
        System.out.println(t.tripleUp(new int[]{1, 2, 4}));         // → false
        System.out.println(t.tripleUp(new int[]{23, 24, 25, 1}));   // → true
        System.out.println(t.tripleUp(new int[]{10, 11, 13, 14}));  // → false
    }
}
