package logic1;

/**
 * In1To10 - CodingBat Logic-1
 *
 * Given a number n, return true if n is in the range 1..10 inclusive.
 * Unless outsideMode is true, in which case return true if n <= 1 or n >= 10.
 */
public class In1To10 {

    /**
     * Returns true if n is within 1..10 inclusive,
     * or if outsideMode is true and n <= 1 or n >= 10.
     *
     * @param n           the number to check
     * @param outsideMode whether to use outside mode logic
     * @return true if the condition is satisfied
     */
    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) return (n <= 1 || n >= 10);
        return (n >= 1 && n <= 10);
    }

    // Optional main for quick testing
    public static void main(String[] args) {
        In1To10 i = new In1To10();
        System.out.println(i.in1To10(5, false)); // true
        System.out.println(i.in1To10(11, false)); // false
        System.out.println(i.in1To10(11, true));  // true
        System.out.println(i.in1To10(1, true));   // true
    }
}
