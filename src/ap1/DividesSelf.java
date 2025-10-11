package ap1;

/**
 * DividesSelf - CodingBat AP-1
 *
 * A positive integer divides itself if every digit in the number divides the number evenly.
 */
public class DividesSelf {

    /**
     * Returns true if n divides itself.
     *
     * @param n positive integer to check
     * @return true if every digit divides n evenly
     */
    public boolean dividesSelf(int n) {
        if (n == 0) return false; // 0 itself does not divide anything
        return dividesSelfHelper(n, n);
    }

    // Helper method to check digits recursively
    private boolean dividesSelfHelper(int n, int original) {
        if (n == 0) return true; // all digits checked

        int digit = n % 10;
        if (digit == 0 || original % digit != 0) return false;

        return dividesSelfHelper(n / 10, original);
    }

    // Optional main() for testing
    public static void main(String[] args) {
        DividesSelf ds = new DividesSelf();
        System.out.println(ds.dividesSelf(128)); // true
        System.out.println(ds.dividesSelf(12));  // true
        System.out.println(ds.dividesSelf(120)); // false (contains 0)
        System.out.println(ds.dividesSelf(26));  // false (6 does not divide 26)
    }
}
