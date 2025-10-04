package logic1;

/**
 * Less20 - CodingBat Logic-1
 *
 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
 */
public class Less20 {

    /**
     * Checks if n is 1 or 2 less than a multiple of 20.
     *
     * @param n non-negative number
     * @return true if n % 20 is 18 or 19
     */
    public boolean less20(int n) {
        int mod = n % 20;
        return (mod == 18 || mod == 19);
    }

    // Optional main() for testing
    public static void main(String[] args) {
        Less20 l = new Less20();
        System.out.println(l.less20(38)); // true
        System.out.println(l.less20(39)); // true
        System.out.println(l.less20(40)); // false
        System.out.println(l.less20(20)); // false
    }
}
