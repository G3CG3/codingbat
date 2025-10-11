package recursion1;

/**
 * Array220 - CodingBat Recursion-1
 *
 * Recursively checks if the array contains a value followed by that value times 10.
 */
public class Array220 {

    /**
     * Recursively checks if any element is followed by that element times 10.
     *
     * @param nums  input array of integers
     * @param index current index to check
     * @return true if there exists nums[i] such that nums[i+1] == nums[i] * 10
     */
    public boolean array220(int[] nums, int index) {
        // Base case: index reached second-to-last or beyond
        if (index >= nums.length - 1) return false;

        // Check if current element times 10 equals the next element
        if (nums[index] * 10 == nums[index + 1]) return true;

        // Recurse to the next index
        return array220(nums, index + 1);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Array220 a220 = new Array220();
        System.out.println(a220.array220(new int[]{1, 2, 20}, 0));         // true
        System.out.println(a220.array220(new int[]{3, 30, 3, 30}, 0));     // true
        System.out.println(a220.array220(new int[]{3}, 0));                // false
        System.out.println(a220.array220(new int[]{10, 5, 50, 500}, 0));   // true
        System.out.println(a220.array220(new int[]{1, 2, 3, 4}, 0));       // false
    }
}
