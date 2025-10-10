package array3;

/**
 * CountClumps - CodingBat Array-3
 *
 * Returns the number of "clumps" in an array.
 * A clump is a series of 2 or more adjacent elements of the same value.
 */
public class CountClumps {

    /**
     * Counts the number of clumps in the given array.
     *
     * @param nums input array
     * @return number of clumps
     */
    public int countClumps(int[] nums) {
        if (nums.length == 0) return 0;

        int count = 0;
        boolean inClump = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    count++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }

        return count;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CountClumps cc = new CountClumps();

        int[] arr1 = {1, 2, 2, 3, 4, 4};
        System.out.println(cc.countClumps(arr1)); // 2

        int[] arr2 = {1, 1, 2, 1, 1};
        System.out.println(cc.countClumps(arr2)); // 2

        int[] arr3 = {1, 1, 1, 1, 1};
        System.out.println(cc.countClumps(arr3)); // 1
    }
}
