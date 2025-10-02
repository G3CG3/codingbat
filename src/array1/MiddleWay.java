package array1;

/**
 * MiddleWay - CodingBat Array-1
 *
 * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
 */
public class MiddleWay {

    /**
     * Returns a new array containing the middle elements of the two input arrays.
     *
     * @param a first array of length 3
     * @param b second array of length 3
     * @return new array of length 2 with middle elements
     */
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public static void main(String[] args) {
        MiddleWay mw = new MiddleWay();
        int[] result = mw.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println(java.util.Arrays.toString(result)); // [2, 5]
    }
}