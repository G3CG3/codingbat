package recursion1;

/**
 * Fibonacci - CodingBat Recursion-1
 *
 * The Fibonacci sequence is a classic example of recursion.
 * The sequence starts with 0 and 1, and each subsequent number
 * is the sum of the previous two.
 *
 * Example sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 */
public class Fibonacci {

    /**
     * Recursively computes the nth Fibonacci number.
     *
     * @param n the index in the Fibonacci sequence (starting at 0)
     * @return the nth Fibonacci number
     */
    public int fibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive step: sum of the two previous Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibonacci(0)); // 0
        System.out.println(fib.fibonacci(1)); // 1
        System.out.println(fib.fibonacci(6)); // 8
        System.out.println(fib.fibonacci(9)); // 34
    }
}
