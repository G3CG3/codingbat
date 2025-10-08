package array2;

/**
 * fizzArray3 - CodingBat Array-2
 *
 * Given start and end numbers, return a new array containing
 * the sequence of integers from start up to but not including end.
 * Example: start=5, end=10 → {5, 6, 7, 8, 9}.
 */
public class FizzArray3 {

    /**
     * Generates an array of integers from start (inclusive) to end (exclusive).
     *
     * @param start the starting integer (inclusive)
     * @param end   the ending integer (exclusive)
     * @return an array containing the sequence start..end-1
     */
    public int[] fizzArray3(int start, int end) {
        int[] arr = new int[end - start];

        for (int i = start; i < end; i++) {
            arr[i - start] = i;
        }

        return arr;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        FizzArray3 f = new FizzArray3();

        // Test cases
        System.out.println(java.util.Arrays.toString(f.fizzArray3(5, 10))); // → [5, 6, 7, 8, 9]
        System.out.println(java.util.Arrays.toString(f.fizzArray3(11, 18))); // → [11, 12, 13, 14, 15, 16, 17]
        System.out.println(java.util.Arrays.toString(f.fizzArray3(1, 1))); // → []
        System.out.println(java.util.Arrays.toString(f.fizzArray3(0, 4))); // → [0, 1, 2, 3]
    }
}
