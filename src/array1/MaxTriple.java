package array1;

/**
 * MaxTriple - CodingBat Array-1
 *
 * Given an array of ints of odd length, look at the first, last,
 * and middle values in the array and return the largest.
 * The array length will be at least 1.
 */
public class MaxTriple {

    /**
     * Returns the largest of the first, middle, and last elements.
     *
     * @param nums input array of ints (odd length ≥ 1)
     * @return the largest of first, middle, and last elements
     */
    public int maxTriple(int[] nums) {
        if (nums.length < 3) return nums[0];
        int mid = nums.length / 2;
        return Math.max(nums[0], Math.max(nums[mid], nums[nums.length - 1]));
    }

    public static void main(String[] args) {
        MaxTriple mt = new MaxTriple();
        System.out.println(mt.maxTriple(new int[]{1, 2, 3}));       // 3
        System.out.println(mt.maxTriple(new int[]{1, 5, 3}));       // 5
        System.out.println(mt.maxTriple(new int[]{7}));             // 7
    }
}
