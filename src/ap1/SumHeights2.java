package ap1;

/**
 * SumHeights2 - CodingBat AP-1
 *
 * A variation on SumHeights: increases in height count double.
 * Given an array of heights, compute the total "effort" for a walk
 * between two indexes, where ascents count double and descents count normally.
 *
 * Example: {5, 3, 6, 7, 2}, start=2, end=4 → (7-6)*2 + (7-2) = 7
 */
public class SumHeights2 {

    /**
     * Computes total effort with ascents counting double.
     *
     * @param heights array of heights
     * @param start   starting index (inclusive)
     * @param end     ending index (inclusive)
     * @return total sum of changes with ascents doubled
     */
    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                sum += 2 * diff; // uphill — count double
            } else {
                sum -= diff;    // downhill — absolute value
            }
        }

        return sum;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        SumHeights2 sh2 = new SumHeights2();
        int[] heights = {5, 3, 6, 7, 2};
        System.out.println(sh2.sumHeights2(heights, 2, 4)); // Expected: 7
    }
}
