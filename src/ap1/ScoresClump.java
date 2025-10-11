package ap1;

/**
 * ScoresClump - CodingBat AP-1
 *
 * Given an array of scores sorted in increasing order, return true if
 * the array contains 3 adjacent scores that differ from each other by
 * at most 2 (e.g. {3, 4, 5} or {3, 5, 5}).
 */
public class ScoresClump {

    /**
     * Checks if there is any "clump" of 3 adjacent scores where
     * the difference between the smallest and largest is at most 2.
     *
     * @param scores array of scores (sorted in increasing order)
     * @return true if a clump exists, false otherwise
     */
    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ScoresClump sc = new ScoresClump();

        System.out.println(sc.scoresClump(new int[]{3, 4, 5}));     // true
        System.out.println(sc.scoresClump(new int[]{3, 5, 5}));     // true
        System.out.println(sc.scoresClump(new int[]{1, 3, 5, 7}));  // false
        System.out.println(sc.scoresClump(new int[]{1, 2, 4, 5, 7})); // true (2,4,5)
        System.out.println(sc.scoresClump(new int[]{1, 2, 9, 10, 11, 12})); // true (10,11,12)
    }
}
