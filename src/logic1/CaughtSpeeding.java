package logic1;

/**
 * CaughtSpeeding - CodingBat Logic-1
 *
 * Compute the result of getting stopped by a police officer, encoded as:
 * 0 = no ticket, 1 = small ticket, 2 = big ticket.
 *
 * Rules:
 * - Speed <= 60 → no ticket
 * - Speed between 61 and 80 → small ticket
 * - Speed >= 81 → big ticket
 * - On your birthday, you get a 5 mph grace in all cases.
 */
public class CaughtSpeeding {

    /**
     * Determines the ticket type based on speed and birthday allowance.
     *
     * @param speed      the driving speed
     * @param isBirthday true if it's your birthday
     * @return 0=no ticket, 1=small ticket, 2=big ticket
     */
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int allowance = isBirthday ? 5 : 0;

        if (speed <= 60 + allowance) return 0;
        if (speed <= 80 + allowance) return 1;
        return 2;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CaughtSpeeding cs = new CaughtSpeeding();
        System.out.println(cs.caughtSpeeding(60, false)); // 0
        System.out.println(cs.caughtSpeeding(65, false)); // 1
        System.out.println(cs.caughtSpeeding(85, false)); // 2
        System.out.println(cs.caughtSpeeding(65, true));  // 0 (birthday)
    }
}
