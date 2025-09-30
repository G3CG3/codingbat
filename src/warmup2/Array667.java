package warmup2;

/**
 * Array667 - CodingBat Warmup-2
 *
 * Given an array of ints, return the number of times that two 6's are next to each other
 * in the array. Also count instances where the second "6" is actually a 7.
 */
public class Array667 {

    /**
     * Counts the number of times a 6 is followed by another 6 or a 7 in the array.
     *
     * @param nums input array of integers
     * @return count of 6-6 or 6-7 pairs
     */
    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Array667 a667 = new Array667();
        System.out.println(a667.array667(new int[]{6, 6, 2}));       // 1
        System.out.println(a667.array667(new int[]{6, 6, 2, 6, 7})); // 2
        System.out.println(a667.array667(new int[]{6, 7, 2, 6, 7})); // 2
        System.out.println(a667.array667(new int[]{6, 2, 2, 6}));    // 0
    }
}
