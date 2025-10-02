package array1;

/**
 * CommonEnd - CodingBat Array-1
 *
 * Given 2 arrays of ints, a and b, return true if they have the same
 * first element or the same last element. Both arrays will be length 1 or more.
 */
public class CommonEnd {

    /**
     * Checks if two arrays share the same first or last element.
     *
     * @param a first int array
     * @param b second int array
     * @return true if they share the same first or last element
     */
    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CommonEnd ce = new CommonEnd();
        System.out.println(ce.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));   // true
        System.out.println(ce.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2})); // false
        System.out.println(ce.commonEnd(new int[]{1, 2, 3}, new int[]{1}));       // true
    }
}
