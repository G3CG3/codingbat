package array1;

/**
 * Unlucky1 - CodingBat Array-1
 *
 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
 * Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions.
 */
public class Unlucky1 {

    /**
     * Returns true if an unlucky 1 is present at the start or end of the array.
     *
     * @param nums input array of integers
     * @return true if an unlucky 1 is found, false otherwise
     */
    public boolean unlucky1(int[] nums) {
        if (nums.length < 2) return false;
        return (nums[0] == 1 && nums[1] == 3) ||
                (nums[1] == 1 && nums[2] == 3) ||
                (nums[nums.length-2] == 1 && nums[nums.length-1] == 3);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Unlucky1 ul = new Unlucky1();
        System.out.println(ul.unlucky1(new int[]{1, 3, 4, 5})); // true
        System.out.println(ul.unlucky1(new int[]{2, 1, 3}));    // true
        System.out.println(ul.unlucky1(new int[]{1, 1, 2, 3})); // true
        System.out.println(ul.unlucky1(new int[]{1, 2, 3}));    // false
        System.out.println(ul.unlucky1(new int[]{1}));          // false
    }
}
