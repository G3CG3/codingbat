package ap1;

/**
 * SumHeights - CodingBat AP-1
 *
 * Given an array of heights, representing altitude along a trail,
 * return the sum of the absolute changes in height between start and end indexes.
 *
 * Example: with {5, 3, 6, 7, 2}, start=2, end=4 → |6-7| + |7-2| = 6
 */
public class SumHeights {

    /**
     * Computes the total elevation change between two points.
     *
     * @param heights array of heights
     * @param start   starting index (inclusive)
     * @param end     ending index (inclusive)
     * @return total absolute change in height from start to end
     */
    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }

        return sum;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        SumHeights sh = new SumHeights();
        int[] heights = {5, 3, 6, 7, 2};
        System.out.println(sh.sumHeights(heights, 2, 4)); // Expected: 6
    }
}
