package logic1;

/**
 * More20 - CodingBat Logic-1
 *
 * Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
 */
public class More20 {

    /**
     * Checks if n is 1 or 2 more than a multiple of 20.
     *
     * @param n non-negative number
     * @return true if n is 1 or 2 more than a multiple of 20
     */
    public boolean more20(int n) {
        return (n % 20 >= 1 && n % 20 <= 2);
    }

    // Optional main() for testing
    public static void main(String[] args) {
        More20 m = new More20();
        System.out.println(m.more20(21)); // true
        System.out.println(m.more20(22)); // true
        System.out.println(m.more20(23)); // false
        System.out.println(m.more20(40)); // false
    }
}
