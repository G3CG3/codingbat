package array1;

/**
 * Start1 - CodingBat Array-1
 *
 * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
 */
public class Start1 {

    /**
     * Counts how many of the two arrays start with 1.
     *
     * @param a first int array
     * @param b second int array
     * @return number of arrays starting with 1
     */
    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) count++;
        if (b.length > 0 && b[0] == 1) count++;
        return count;
    }

    public static void main(String[] args) {
        Start1 s1 = new Start1();
        System.out.println(s1.start1(new int[]{1, 2, 3}, new int[]{1, 3})); // 2
        System.out.println(s1.start1(new int[]{7, 2, 3}, new int[]{1}));    // 1
        System.out.println(s1.start1(new int[]{1, 2}, new int[]{}));        // 1
    }
}
