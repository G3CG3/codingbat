package array2;

/**
 * modThree - CodingBat Array-2
 *
 * Given an array of ints, return true if the array contains
 * either 3 even or 3 odd values all next to each other.
 */
public class ModThree {

    /**
     * Checks for 3 consecutive even or odd numbers in the array.
     *
     * @param nums the input array
     * @return true if 3 consecutive numbers are all even or all odd
     */
    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0)
                return true;
            if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0)
                return true;
        }
        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ModThree m = new ModThree();

        System.out.println(m.modThree(new int[]{2, 1, 3, 5}));    // → true (3,5 odd)
        System.out.println(m.modThree(new int[]{2, 1, 2, 5}));    // → false
        System.out.println(m.modThree(new int[]{2, 4, 6, 1}));    // → true (2,4,6 even)
        System.out.println(m.modThree(new int[]{1, 3, 5, 7}));    // → true
        System.out.println(m.modThree(new int[]{2, 4, 1, 3, 5})); // → true
    }
}
