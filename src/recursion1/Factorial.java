package recursion1;

/**
 * Factorial - CodingBat Recursion-1
 *
 * Given n of 1 or more, return the factorial of n,
 * which is n * (n-1) * (n-2) ... * 1.
 * Compute the result recursively (without loops).
 */
public class Factorial {

    /**
     * Recursively computes the factorial of a given number.
     *
     * @param n a positive integer (n >= 1)
     * @return the factorial of n
     */
    public int factorial(int n) {
        // Base case: factorial(1) = 1
        if (n == 1) return 1;

        // Recursive step: n * factorial(n-1)
        return n * factorial(n - 1);
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factorial(1)); // 1
        System.out.println(f.factorial(3)); // 6
        System.out.println(f.factorial(5)); // 120
    }
}
