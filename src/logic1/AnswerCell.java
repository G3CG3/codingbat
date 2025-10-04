package logic1;

/**
 * AnswerCell - CodingBat Logic-1
 *
 * Your cell phone rings. Return true if you should answer it. Normally you answer,
 * except in the morning you only answer if it is your mom calling. In all cases,
 * if you are asleep, you do not answer.
 */
public class AnswerCell {

    /**
     * Determines whether to answer the phone.
     *
     * @param isMorning true if it is morning
     * @param isMom true if it is your mom calling
     * @param isAsleep true if you are asleep
     * @return true if you should answer, false otherwise
     */
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        return !isMorning || isMom;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        AnswerCell ac = new AnswerCell();
        System.out.println(ac.answerCell(false, false, false)); // true
        System.out.println(ac.answerCell(true, false, false));  // false
        System.out.println(ac.answerCell(true, true, false));   // true
        System.out.println(ac.answerCell(false, true, true));   // false
    }
}
