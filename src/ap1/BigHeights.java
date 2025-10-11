package ap1;

/**
 * BigHeights - CodingBat AP-1
 *
 * A variation of SumHeights: counts the number of "big" steps
 * between two indexes in a trail represented by an array of heights.
 * A step is considered big if the change in height is 5 or more.
 *
 * Example: {5, 3, 6, 7, 2}, start=2, end=4 → one big step (7→2)
 */
public class BigHeights {

    /**
     * Counts how many big steps (difference >= 5) occur between start and end.
     *
     * @param heights array of heights
     * @param start   starting index (inclusive)
     * @param end     ending index (inclusive)
     * @return number of big steps
     */
    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;

        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                count++;
            }
        }

        return count;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        BigHeights bh = new BigHeights();
        int[] heights = {5, 3, 6, 7, 2};
        System.out.println(bh.bigHeights(heights, 2, 4)); // Expected: 1
        System.out.println(bh.bigHeights(heights, 0, 1)); // Expected: 0
        System.out.println(bh.bigHeights(heights, 0, 4)); // Expected: 2
    }
}
