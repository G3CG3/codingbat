package array1;

/**
 * SameFirstLast - CodingBat Array-1
 *
 * Given an array of ints, return true if the array is length 1 or more,
 * and the first element and the last element are equal.
 */
public class SameFirstLast {

    /**
     * Checks if the array has at least one element and
     * whether the first and last elements are the same.
     *
     * @param nums input array
     * @return true if length >= 1 and first == last
     */
    public boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        SameFirstLast sfl = new SameFirstLast();
        System.out.println(sfl.sameFirstLast(new int[]{1, 2, 3}));    // false
        System.out.println(sfl.sameFirstLast(new int[]{1, 2, 3, 1})); // true
        System.out.println(sfl.sameFirstLast(new int[]{1, 2, 1}));    // true
        System.out.println(sfl.sameFirstLast(new int[]{6}));          // true
        System.out.println(sfl.sameFirstLast(new int[]{}));           // false
    }
}
