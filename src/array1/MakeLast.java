package array1;

/**
 * MakeLast - CodingBat Array-1
 *
 * Given an int array, return a new array with double the length
 * where its last element is the same as the original array,
 * and all the other elements are 0.
 */
public class MakeLast {

    /**
     * Returns a new array with double length, last element same as original, others 0.
     *
     * @param nums original int array (length >= 1)
     * @return new array of double length with last element same as original
     */
    public int[] makeLast(int[] nums) {
        int[] arr = new int[nums.length * 2];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;
    }

    public static void main(String[] args) {
        MakeLast ml = new MakeLast();
        int[] res1 = ml.makeLast(new int[]{4, 5, 6}); // {0,0,0,0,0,6}
        int[] res2 = ml.makeLast(new int[]{1});       // {0,1}

        for (int n : res1) System.out.print(n + " "); // 0 0 0 0 0 6
        System.out.println();
        for (int n : res2) System.out.print(n + " "); // 0 1
    }
}
