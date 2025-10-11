package ap1;

/**
 * ScoreUp - CodingBat AP-1
 *
 * Computes the score for a student's answers against a key.
 * +4 for correct answers, -1 for incorrect, 0 for blanks ("?").
 */
public class ScoreUp {

    /**
     * Returns the total score for a student's answers.
     *
     * @param key array of correct answers
     * @param answers array of student's answers
     * @return total score
     */
    public int scoreUp(String[] key, String[] answers) {
        int sum = 0;

        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals("?")) {
                // blank answer, 0 points
            } else if (key[i].equals(answers[i])) {
                sum += 4; // correct answer
            } else {
                sum -= 1; // incorrect answer
            }
        }

        return sum;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ScoreUp su = new ScoreUp();

        String[] key = {"a", "a", "b", "b"};
        String[] answers1 = {"a", "c", "b", "?"};
        System.out.println(su.scoreUp(key, answers1)); // Output: 7

        String[] answers2 = {"a", "a", "b", "b"};
        System.out.println(su.scoreUp(key, answers2)); // Output: 16
    }
}
