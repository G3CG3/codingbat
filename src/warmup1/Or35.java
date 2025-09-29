package warmup1;

/**
 * Or35 - CodingBat Warmup-1
 *
 * Return true if the given non-negative number is a multiple of 3
 * or a multiple of 5. Use the % "mod" operator.
 */
public class Or35 {

    /**
     * Checks if the number is a multiple of 3 or 5.
     *
     * @param n non-negative integer
     * @return true if n is divisible by 3 or 5
     */
    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Or35 o = new Or35();
        System.out.println(o.or35(3));   // true
        System.out.println(o.or35(10));  // true
        System.out.println(o.or35(8));   // false
    }
}
