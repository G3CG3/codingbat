package array2;

/**
 * sameEnds - CodingBat Array-2
 *
 * Return true if the group of N numbers at the start and end of the array are the same.
 * For example, with {5, 6, 45, 99, 13, 5, 6},
 * the ends are the same for n=0 and n=2, and false for n=1 and n=3.
 */
public class SameEnds {

    /**
     * Checks if the first 'len' elements and the last 'len' elements are identical.
     *
     * @param nums the input array
     * @param len  the number of elements to compare from both ends
     * @return true if the start and end groups are identical, false otherwise
     */
    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        SameEnds s = new SameEnds();

        System.out.println(s.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 0)); // → true
        System.out.println(s.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1)); // → false
        System.out.println(s.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2)); // → true
        System.out.println(s.sameEnds(new int[]{1, 2, 3, 1, 2, 3}, 3));       // → true
        System.out.println(s.sameEnds(new int[]{1, 2, 3, 4, 5, 6}, 3));       // → false
    }
}
