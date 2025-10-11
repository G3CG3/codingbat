package ap1;

/**
 * CommonTwo - CodingBat AP-1
 *
 * Given two sorted string arrays a and b (possibly with duplicates),
 * returns the count of unique strings that appear in both arrays.
 *
 * Runs in linear time O(a.length + b.length) using the two-pointer technique.
 */
public class CommonTwo {

    /**
     * Counts unique common strings between two sorted arrays.
     *
     * @param a first sorted array (may contain duplicates)
     * @param b second sorted array (may contain duplicates)
     * @return number of unique strings that appear in both arrays
     */
    public int commonTwo(String[] a, String[] b) {
        int i = 0, j = 0, count = 0;
        String lastCounted = "";

        while (i < a.length && j < b.length) {
            if (a[i].equals(b[j])) {
                if (!a[i].equals(lastCounted)) {
                    count++;
                    lastCounted = a[i];
                }
                i++;
                j++;
            } else if (a[i].compareTo(b[j]) < 0) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CommonTwo ct = new CommonTwo();
        String[] a = {"a", "c", "x"};
        String[] b = {"b", "c", "d", "x"};
        System.out.println(ct.commonTwo(a, b)); // → 2 ("c", "x")
    }
}
