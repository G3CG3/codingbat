package array1;

/**
 * Make2 - CodingBat Array-1
 *
 * Given 2 int arrays, a and b, return a new array length 2 containing,
 * as much as will fit, the elements from a followed by the elements from b.
 * The arrays may be any length, including 0, but there will be 2 or more
 * elements available between the 2 arrays.
 */
public class Make2 {

    /**
     * Returns a new array length 2 using elements from a then b as needed.
     *
     * @param a first int array
     * @param b second int array
     * @return new int array of length 2
     */
    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int index = 0;

        // Add from a
        for (int i = 0; i < a.length && index < 2; i++) {
            result[index++] = a[i];
        }

        // Add from b if needed
        for (int i = 0; i < b.length && index < 2; i++) {
            result[index++] = b[i];
        }

        return result;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Make2 m2 = new Make2();
        System.out.println(java.util.Arrays.toString(m2.make2(new int[]{4, 5}, new int[]{1, 2}))); // [4, 5]
        System.out.println(java.util.Arrays.toString(m2.make2(new int[]{4}, new int[]{1, 2})));    // [4, 1]
        System.out.println(java.util.Arrays.toString(m2.make2(new int[]{}, new int[]{1, 2})));     // [1, 2]
    }
}
