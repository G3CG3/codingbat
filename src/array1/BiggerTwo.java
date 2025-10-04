package array1;

/**
 * BiggerTwo - CodingBat Array-1
 *
 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
 * Return the array which has the largest sum. In event of a tie, return a.
 */
public class BiggerTwo {

    /**
     * Returns the array with the larger sum, or a if sums are equal.
     *
     * @param a first int array of length 2
     * @param b second int array of length 2
     * @return array with largest sum
     */
    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        return sumA >= sumB ? a : b;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        BiggerTwo bt = new BiggerTwo();
        int[] result1 = bt.biggerTwo(new int[]{1, 2}, new int[]{3, 4}); // {3, 4}
        int[] result2 = bt.biggerTwo(new int[]{5, 6}, new int[]{2, 9}); // {5, 6} (tie not happening)
        int[] result3 = bt.biggerTwo(new int[]{1, 2}, new int[]{2, 1}); // {1, 2} (tie)

        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
        System.out.println(java.util.Arrays.toString(result3));
    }
}
