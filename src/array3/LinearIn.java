package array3;

/**
 * LinearIn - CodingBat Array-3
 *
 * Given two sorted arrays, outer and inner, return true if all elements
 * of inner appear in outer. Linear pass using two pointers.
 */
public class LinearIn {

    /**
     * Checks if all elements of inner are present in outer.
     *
     * @param outer sorted array
     * @param inner sorted array
     * @return true if all elements of inner are in outer
     */
    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0; // pointer for outer
        int j = 0; // pointer for inner

        while (i < outer.length && j < inner.length) {
            if (outer[i] == inner[j]) {
                j++; // found inner[j], move to next
            } else if (outer[i] > inner[j]) {
                // inner[j] not in outer
                return false;
            }
            i++; // always move outer pointer
        }

        return j == inner.length; // true if all inner elements found
    }

    // Optional main for testing
    public static void main(String[] args) {
        LinearIn li = new LinearIn();
        int[] outer = {1, 2, 4, 6, 8};
        int[] inner = {2, 4, 8};
        System.out.println(li.linearIn(outer, inner)); // true

        int[] inner2 = {2, 5, 8};
        System.out.println(li.linearIn(outer, inner2)); // false
    }
}
