package array1;

/**
 * Sum3 - CodingBat Array-1
 *
 * Given an array of ints length 3, return the sum of all the elements.
 */
public class Sum3 {

    /**
     * Returns the sum of the three elements of the array.
     *
     * @param nums input array of length 3
     * @return sum of elements
     */
    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Sum3 s3 = new Sum3();
        System.out.println(s3.sum3(new int[]{1, 2, 3})); // 6
        System.out.println(s3.sum3(new int[]{5, 11, 2})); // 18
        System.out.println(s3.sum3(new int[]{7, 0, 0}));  // 7
    }
}
