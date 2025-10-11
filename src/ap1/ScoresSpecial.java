package ap1;

/**
 * ScoresSpecial - CodingBat AP-1
 *
 * Returns the sum of the largest "special" score (multiple of 10)
 * from each of two arrays.
 */
public class ScoresSpecial {

    /**
     * Returns the sum of the largest special score in each array.
     *
     * @param a first array of scores
     * @param b second array of scores
     * @return sum of largest special scores
     */
    public int scoresSpecial(int[] a, int[] b) {
        int maxA = largestSpecial(a);
        int maxB = largestSpecial(b);
        return maxA + maxB;
    }

    /**
     * Helper method to find the largest multiple of 10 in an array.
     *
     * @param scores array of non-negative integers
     * @return largest multiple of 10, or 0 if none
     */
    private int largestSpecial(int[] scores) {
        int max = 0;
        for (int score : scores) {
            if (score % 10 == 0 && score > max) {
                max = score;
            }
        }
        return max;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ScoresSpecial ss = new ScoresSpecial();

        int[] a = {20, 30, 25};
        int[] b = {15, 40, 50};

        System.out.println(ss.scoresSpecial(a, b)); // Output: 30 + 50 = 80
    }
}
