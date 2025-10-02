package array1;

/**
 * Sum2 - CodingBat Array-1
 *
 * Given an array of ints, return the sum of the first 2 elements in the array.
 * If the array length is less than 2, just sum up the elements that exist,
 * returning 0 if the array is length 0.
 */
public class Sum2 {

    /**
     * Returns the sum of the first 2 elements, or fewer if the array is smaller.
     *
     * @param nums input array of ints
     * @return sum of the first 2 elements
     */
    public int sum2(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return nums[0] + nums[1];
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Sum2 s2 = new Sum2();
        System.out.println(s2.sum2(new int[]{1, 2, 3})); // 3
        System.out.println(s2.sum2(new int[]{1, 1}));    // 2
        System.out.println(s2.sum2(new int[]{1}));       // 1
        System.out.println(s2.sum2(new int[]{}));        // 0
    }
}
