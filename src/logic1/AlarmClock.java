package logic1;

/**
 * AlarmClock - CodingBat Logic-1
 *
 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
 * and a boolean indicating if we are on vacation, return a string of
 * the form "7:00" indicating when the alarm clock should ring.
 * Weekdays: "7:00", weekend: "10:00".
 * If vacation: weekdays "10:00", weekend "off".
 */
public class AlarmClock {

    /**
     * Returns the alarm clock time based on the day and vacation flag.
     *
     * @param day       the day of the week (0=Sun..6=Sat)
     * @param vacation  true if on vacation
     * @return alarm time ("7:00", "10:00", or "off")
     */
    public String alarmClock(int day, boolean vacation) {
        boolean isWeekend = (day == 0 || day == 6);

        if (vacation)
            return isWeekend ? "off" : "10:00";
        else
            return isWeekend ? "10:00" : "7:00";
    }

    // Optional main for testing
    public static void main(String[] args) {
        AlarmClock ac = new AlarmClock();
        System.out.println(ac.alarmClock(1, false)); // "7:00"
        System.out.println(ac.alarmClock(6, false)); // "10:00"
        System.out.println(ac.alarmClock(0, true));  // "off"
        System.out.println(ac.alarmClock(3, true));  // "10:00"
    }
}
