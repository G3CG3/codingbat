package logic1;

/**
 * Old35 - CodingBat Logic-1
 *
 * Return true if the given non-negative number is a multiple of 3 or 5, but not both.
 */
public class Old35 {

    /**
     * Checks if n is a multiple of 3 or 5, but not both.
     *
     * @param n non-negative number
     * @return true if n is multiple of 3 or 5, but not both
     */
    public boolean old35(int n) {
        return ((n % 3 == 0 || n % 5 == 0) && n % 15 != 0);
    }

    // Optional main() for testing
    public static void main(String[] args) {
        Old35 o = new Old35();
        System.out.println(o.old35(3));  // true
        System.out.println(o.old35(5));  // true
        System.out.println(o.old35(15)); // false
        System.out.println(o.old35(7));  // false
    }
}
