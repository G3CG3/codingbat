package ap1;

/**
 * Scores100 - CodingBat AP-1
 *
 * Given an array of scores, return true if there are scores of 100
 * next to each other in the array. The array length will be at least 2.
 */
public class Scores100 {

    /**
     * Checks if the array contains two adjacent scores of 100.
     *
     * @param scores array of integer scores
     * @return true if two consecutive elements are both 100, false otherwise
     */
    public boolean scores100(int[] scores) {
        // Loop through the array up to the second-to-last element
        for (int i = 0; i < scores.length - 1; i++) {
            // Check if current and next elements are both 100
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        // No consecutive 100s found
        return false;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Scores100 s100 = new Scores100();

        int[] test1 = {1, 100, 100};
        System.out.println(s100.scores100(test1)); // true

        int[] test2 = {100, 1, 100};
        System.out.println(s100.scores100(test2)); // false

        int[] test3 = {100, 100, 100};
        System.out.println(s100.scores100(test3)); // true

        int[] test4 = {90, 95, 99};
        System.out.println(s100.scores100(test4)); // false
    }
}
