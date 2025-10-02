package array1;

/**
 * Front11 - CodingBat Array-1
 *
 * Given 2 int arrays, a and b, of any length, return a new array
 * with the first element of each array. If either array is length 0, ignore that array.
 */
public class Front11 {

    /**
     * Returns a new array containing the first element of each input array, if present.
     *
     * @param a first array
     * @param b second array
     * @return new array with first elements from a and b
     */
    public int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        } else if (a.length > 0) {
            return new int[]{a[0]};
        } else if (b.length > 0) {
            return new int[]{b[0]};
        } else {
            return new int[]{};
        }
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Front11 f11 = new Front11();
        int[] result1 = f11.front11(new int[]{1, 2}, new int[]{3, 4}); // {1, 3}
        int[] result2 = f11.front11(new int[]{1}, new int[]{});         // {1}
        int[] result3 = f11.front11(new int[]{}, new int[]{2});         // {2}
        int[] result4 = f11.front11(new int[]{}, new int[]{});          // {}

        for (int n : result1) System.out.print(n + " ");  // 1 3
        System.out.println();
        for (int n : result2) System.out.print(n + " ");  // 1
        System.out.println();
        for (int n : result3) System.out.print(n + " ");  // 2
        System.out.println();
        for (int n : result4) System.out.print(n + " ");  // (empty)
    }
}
