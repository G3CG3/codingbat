package ap1;

/**
 * ScoresAverage - CodingBat AP-1
 *
 * Given an array of scores, compute the int average of the first half and the second half,
 * and return whichever is larger. The second half begins at index length/2.
 */
public class ScoresAverage {

    /**
     * Computes the larger of the average of the first and second halves.
     *
     * @param scores array of scores
     * @return the larger average
     */
    public int scoresAverage(int[] scores) {
        int mid = scores.length / 2;
        int avg1 = average(scores, 0, mid - 1);
        int avg2 = average(scores, mid, scores.length - 1);
        return Math.max(avg1, avg2);
    }

    /**
     * Computes the integer average of elements from index start to end (inclusive).
     *
     * @param scores array of scores
     * @param start  starting index (inclusive)
     * @param end    ending index (inclusive)
     * @return integer average
     */
    private int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += scores[i];
        }
        return sum / (end - start + 1);
    }

    // Optional main() for testing
    public static void main(String[] args) {
        ScoresAverage sa = new ScoresAverage();

        System.out.println(sa.scoresAverage(new int[]{2, 2, 4, 4})); // 4
        System.out.println(sa.scoresAverage(new int[]{4, 4, 4, 2, 2, 2})); // 4
        System.out.println(sa.scoresAverage(new int[]{3, 4, 5, 1, 2, 3})); // 4
    }
}
