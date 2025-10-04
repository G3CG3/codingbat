package logic1;

/**
 * SquirrelPlay - CodingBat Logic-1
 *
 * The squirrels in Palo Alto play if the temperature is between 60 and 90 inclusive.
 * During summer, the upper limit is 100 instead of 90.
 */
public class SquirrelPlay {

    /**
     * Determines if squirrels play based on temperature and season.
     *
     * @param temp     the temperature
     * @param isSummer true if it's summer
     * @return true if squirrels play, false otherwise
     */
    public boolean squirrelPlay(int temp, boolean isSummer) {
        int upper = isSummer ? 100 : 90;
        return temp >= 60 && temp <= upper;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        SquirrelPlay sp = new SquirrelPlay();
        System.out.println(sp.squirrelPlay(70, false)); // true
        System.out.println(sp.squirrelPlay(95, false)); // false
        System.out.println(sp.squirrelPlay(95, true));  // true
    }
}
