package array1;

/**
 * PlusTwo - CodingBat Array-1
 *
 * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
 */
public class PlusTwo {

    /**
     * Combines two arrays of length 2 into a new array of length 4.
     *
     * @param a first array of length 2
     * @param b second array of length 2
     * @return new array containing all elements of a and b
     */
    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public static void main(String[] args) {
        PlusTwo pt = new PlusTwo();
        int[] result1 = pt.plusTwo(new int[]{1, 2}, new int[]{3, 4}); // {1, 2, 3, 4}
        int[] result2 = pt.plusTwo(new int[]{4, 4}, new int[]{2, 2}); // {4, 4, 2, 2}

        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
    }
}
