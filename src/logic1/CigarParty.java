package logic1;

/**
 * CigarParty - CodingBat Logic-1
 *
 * When squirrels get together for a party, they like to have cigars.
 * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
 * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
 */
public class CigarParty {

    /**
     * Determines if the squirrel party is successful.
     *
     * @param cigars   number of cigars
     * @param isWeekend true if it's the weekend
     * @return true if party is successful, false otherwise
     */
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (cigars >= 40 && cigars <= 60 && !isWeekend)
                || (isWeekend && cigars >= 40);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CigarParty cp = new CigarParty();
        System.out.println(cp.cigarParty(30, false)); // false
        System.out.println(cp.cigarParty(50, false)); // true
        System.out.println(cp.cigarParty(70, true));  // true
    }
}
