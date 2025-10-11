package ap1;

/**
 * MergeTwo - CodingBat AP-1
 *
 * Merges two sorted string arrays A and B into a new sorted array of length N.
 * The resulting array has no duplicates and preserves alphabetical order.
 * Runs in linear time by using two pointers.
 */
public class MergeTwo {

    /**
     * Merges two sorted string arrays without duplicates, returning the first N elements.
     *
     * @param a first sorted array (no duplicates)
     * @param b second sorted array (no duplicates)
     * @param n number of elements to return
     * @return merged array of length N, sorted and without duplicates
     */
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int i = 0, j = 0, index = 0;

        while (index < n) {
            if (a[i].compareTo(b[j]) < 0) {
                result[index++] = a[i++];
            } else if (a[i].compareTo(b[j]) > 0) {
                result[index++] = b[j++];
            } else { // Equal elements — add one and advance both
                result[index++] = a[i];
                i++;
                j++;
            }
        }
        return result;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MergeTwo mt = new MergeTwo();
        String[] a = {"a", "c", "z"};
        String[] b = {"b", "f", "z"};
        String[] result = mt.mergeTwo(a, b, 3);
        for (String s : result) System.out.print(s + " "); // → a b c
    }
}
