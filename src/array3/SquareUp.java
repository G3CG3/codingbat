package array3;

/**
 * SquareUp - CodingBat Array-3
 *
 * Given n >= 0, create an array of length n*n with the following pattern
 * (shown here for n = 3):
 * {0, 0, 1,   0, 2, 1,   3, 2, 1}
 *
 * The array is composed of n blocks, each block length n. For block i (1..n)
 * the last i positions contain 1..i in reverse order, the rest are zeros.
 */
public class SquareUp {

    /**
     * Builds the square-up pattern array for the given n.
     *
     * @param n non-negative integer
     * @return an int array of length n*n with the described pattern
     */
    public int[] squareUp(int n) {
        int[] result = new int[n * n];

        // For block i (1..n) place numbers 1..i into last i positions of block
        for (int i = 1; i <= n; i++) {
            // place j at index (i*n - j) for j = 1..i
            for (int j = 1; j <= i; j++) {
                result[i * n - j] = j;
            }
        }

        return result;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        SquareUp su = new SquareUp();

        // n = 0 -> empty array
        System.out.println(java.util.Arrays.toString(su.squareUp(0))); // []

        // n = 1 -> {1}
        System.out.println(java.util.Arrays.toString(su.squareUp(1))); // [1]

        // n = 2 -> {0,1, 2,1}
        System.out.println(java.util.Arrays.toString(su.squareUp(2))); // [0, 1, 2, 1]

        // n = 3 -> {0,0,1, 0,2,1, 3,2,1}
        System.out.println(java.util.Arrays.toString(su.squareUp(3))); // [0, 0, 1, 0, 2, 1, 3, 2, 1]

        // n = 4 example
        System.out.println(java.util.Arrays.toString(su.squareUp(4)));
        // [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
    }
}
