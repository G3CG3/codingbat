package recursion1;

/**
 * PowerN - CodingBat Recursion-1
 *
 * Compute recursively the value of base to the power n.
 * Example: powerN(3, 2) → 9
 */
public class PowerN {

    /**
     * Recursively computes base^n.
     *
     * @param base the base, >= 1
     * @param n the exponent, >= 1
     * @return base raised to the power n
     */
    public int powerN(int base, int n) {
        if (n == 1) return base; // Base case: base^1 = base
        return base * powerN(base, n - 1); // Recursive step
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        PowerN p = new PowerN();
        System.out.println(p.powerN(3, 2)); // 9
        System.out.println(p.powerN(2, 5)); // 32
        System.out.println(p.powerN(5, 1)); // 5
    }
}
