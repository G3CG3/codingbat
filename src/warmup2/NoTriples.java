package warmup2;

/**
 * NoTriples - CodingBat Warmup-2
 *
 * Given an array of ints, we'll say that a triple is a value appearing
 * 3 times in a row in the array. Return true if the array does not contain any triples.
 */
public class NoTriples {

    /**
     * Checks if the array contains no triples (3 identical values in a row).
     *
     * @param nums input array of integers
     * @return true if no triples are found, false otherwise
     */
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NoTriples nt = new NoTriples();
        System.out.println(nt.noTriples(new int[]{1, 1, 2, 2, 1})); // true
        System.out.println(nt.noTriples(new int[]{1, 1, 2, 2, 2, 1})); // false
        System.out.println(nt.noTriples(new int[]{1, 1, 1})); // false
        System.out.println(nt.noTriples(new int[]{1, 2, 1})); // true
    }
}
