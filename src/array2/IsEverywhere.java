package array2;

/**
 * isEverywhere - CodingBat Array-2
 *
 * We'll say that a value is "everywhere" in an array if for every pair of
 * adjacent elements in the array, at least one of the pair is that value.
 * Return true if the given value is everywhere in the array.
 */
public class IsEverywhere {

    /**
     * Checks if the given value appears in every pair of adjacent elements.
     *
     * @param nums the input array
     * @param val  the value to check
     * @return true if val is everywhere, false otherwise
     */
    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) return false;
        }
        return true;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        IsEverywhere ie = new IsEverywhere();

        System.out.println(ie.isEverywhere(new int[]{1, 2, 1, 3}, 1));   // → true
        System.out.println(ie.isEverywhere(new int[]{1, 2, 1, 3}, 2));   // → false
        System.out.println(ie.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1)); // → false
        System.out.println(ie.isEverywhere(new int[]{1, 1, 1}, 1));      // → true
        System.out.println(ie.isEverywhere(new int[]{2, 1, 2, 1}, 2));   // → true
    }
}
