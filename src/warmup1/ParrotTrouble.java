package warmup1;

/**
 * ParrotTrouble - CodingBat Warmup-1
 *
 * We have a loud talking parrot. The "hour" parameter is the current hour
 * time in the range 0..23. We are in trouble if the parrot is talking
 * and the hour is before 7 or after 20. Return true if we are in trouble.
 */
public class ParrotTrouble {

    /**
     * Returns true if we are in trouble with the parrot.
     *
     * @param talking true if the parrot is talking
     * @param hour current hour in range 0..23
     * @return true if we are in trouble
     */
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ParrotTrouble p = new ParrotTrouble();
        System.out.println(p.parrotTrouble(true, 6));  // true
        System.out.println(p.parrotTrouble(true, 7));  // false
        System.out.println(p.parrotTrouble(false, 21)); // false
        System.out.println(p.parrotTrouble(true, 21));  // true
    }
}
