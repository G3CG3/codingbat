package ap1;

/**
 * HasOne - CodingBat AP-1
 *
 * Given a positive int n, returns true if n contains the digit 1.
 */
public class HasOne {

    /**
     * Recursively checks if the number contains the digit 1.
     *
     * @param n the positive integer to check
     * @return true if n contains the digit 1, false otherwise
     */
    public boolean hasOne(int n) {
        // Base case: single-digit number
        if (n < 10) return n == 1;

        // Check rightmost digit
        if (n % 10 == 1) return true;

        // Recur on the rest of the number
        return hasOne(n / 10);
    }

    // Optional main() for testing
    public static void main(String[] args) {
        HasOne ho = new HasOne();
        System.out.println(ho.hasOne(123)); // true
        System.out.println(ho.hasOne(456)); // false
        System.out.println(ho.hasOne(1));   // true
        System.out.println(ho.hasOne(9));   // false
    }
}
