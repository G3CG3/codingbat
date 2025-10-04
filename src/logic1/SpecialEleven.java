package logic1;

/**
 * SpecialEleven - CodingBat Logic-1
 *
 * We'll say a number is special if it is a multiple of 11 or if it is
 * one more than a multiple of 11. Return true if the given non-negative
 * number is special. Use the % "mod" operator.
 */
public class SpecialEleven {

    /**
     * Checks if the given number is "special".
     * A number is special if it is a multiple of 11
     * or one more than a multiple of 11.
     *
     * @param n non-negative number
     * @return true if the number is special
     */
    public boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1);
    }

    // Optional main for quick testing
    public static void main(String[] args) {
        SpecialEleven s = new SpecialEleven();
        System.out.println(s.specialEleven(22)); // true (multiple of 11)
        System.out.println(s.specialEleven(23)); // true (one more than multiple of 11)
        System.out.println(s.specialEleven(24)); // false
        System.out.println(s.specialEleven(0));  // true (multiple of 11)
    }
}
