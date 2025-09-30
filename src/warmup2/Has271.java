package warmup2;

/**
 * Has271 - CodingBat Warmup-2
 *
 * Given an array of ints, return true if it contains a 2,7,1 pattern:
 * a value, followed by the value plus 5, followed by the value minus 1.
 * The "1" counts if it differs by 2 or less from the correct value.
 */
public class Has271 {

    /**
     * Checks if the array contains the 2,7,1 pattern with allowed tolerance.
     *
     * @param nums input array of integers
     * @return true if pattern is found, false otherwise
     */
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 5 && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Has271 h271 = new Has271();
        System.out.println(h271.has271(new int[]{1, 6, 0})); // true
        System.out.println(h271.has271(new int[]{1, 6, 1})); // true
        System.out.println(h271.has271(new int[]{2, 7, 1})); // true
        System.out.println(h271.has271(new int[]{2, 7, 4})); // false
        System.out.println(h271.has271(new int[]{1, 2, 3, 7, 1})); // true
    }
}
