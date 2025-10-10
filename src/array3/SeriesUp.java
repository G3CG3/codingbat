package array3;

/**
 * SeriesUp - CodingBat Array-3
 *
 * Given n >= 0, create an array with the pattern:
 * {1, 1,2, 1,2,3, ... 1..n}.
 * The array length is n*(n+1)/2.
 */
public class SeriesUp {

    /**
     * Builds the series-up array for the given n.
     *
     * @param n non-negative integer
     * @return an int array containing the series-up pattern
     */
    public int[] seriesUp(int n) {
        int size = n * (n + 1) / 2;
        int[] result = new int[size];
        int pos = 0; // current position in the array

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[pos++] = j;
            }
        }

        return result;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        SeriesUp su = new SeriesUp();

        System.out.println(java.util.Arrays.toString(su.seriesUp(0))); // []
        System.out.println(java.util.Arrays.toString(su.seriesUp(1))); // [1]
        System.out.println(java.util.Arrays.toString(su.seriesUp(2))); // [1, 1, 2]
        System.out.println(java.util.Arrays.toString(su.seriesUp(3))); // [1, 1, 2, 1, 2, 3]
        System.out.println(java.util.Arrays.toString(su.seriesUp(4))); // [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
    }
}
