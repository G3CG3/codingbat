package warmup1;

/**
 * SleepIn - CodingBat Warmup-1
 *
 * The parameter weekday is true if it is a weekday,
 * and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation.
 * Return true if we sleep in.
 */

public class SleepIn {
    /**
     * Returns true if we sleep in.
     *
     * @param weekday  true if it is a weekday
     * @param vacation true if we are on vacation
     * @return true if we sleep in
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    // Optional: main() για δοκιμή
    public static void main(String[] args) {
        SleepIn s = new SleepIn();
        System.out.println(s.sleepIn(false, false)); // true
        System.out.println(s.sleepIn(true, false));  // false
    }
}
