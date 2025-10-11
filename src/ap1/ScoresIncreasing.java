package ap1;

/**
 * ScoresIncreasing - CodingBat AP-1
 *
 * Given an array of scores, return true if each score is equal to or greater than
 * the one before. The array will be length 2 or more.
 */
public class ScoresIncreasing {

    /**
     * Checks if the scores array is non-decreasing.
     *
     * @param scores array of integer scores
     * @return true if scores are increasing or equal, false otherwise
     */
    public boolean scoresIncreasing(int[] scores) {
        // Loop through the array
        for (int i = 0; i < scores.length - 1; i++) {
            // If the next score is smaller than the current, return false
            if (scores[i] > scores[i + 1]) return false;
        }
        // All scores are increasing or equal
        return true;
    }

    // Optional main() for testing
    public static void main(String[] args) {
        ScoresIncreasing si = new ScoresIncreasing();

        int[] test1 = {1, 3, 5, 5};
        System.out.println(si.scoresIncreasing(test1)); // true

        int[] test2 = {1, 3, 2};
        System.out.println(si.scoresIncreasing(test2)); // false

        int[] test3 = {5, 5, 5, 5};
        System.out.println(si.scoresIncreasing(test3)); // true
    }
}
