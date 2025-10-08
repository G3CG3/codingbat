package array2;

/**
 * fizzArray - CodingBat Array-2
 *
 * Given a number n, create and return a new int array of length n,
 * containing the numbers 0, 1, 2, ... n-1.
 * The given n may be 0, in which case an empty array is returned.
 */
public class FizzArray {

    /**
     * Generates an array of integers from 0 to n-1.
     *
     * @param n the desired length of the array
     * @return an int array containing [0, 1, 2, ..., n-1]
     */
    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        FizzArray f = new FizzArray();

        System.out.println(java.util.Arrays.toString(f.fizzArray(4)));  // → [0, 1, 2, 3]
        System.out.println(java.util.Arrays.toString(f.fizzArray(1)));  // → [0]
        System.out.println(java.util.Arrays.toString(f.fizzArray(0)));  // → []
        System.out.println(java.util.Arrays.toString(f.fizzArray(7)));  // → [0, 1, 2, 3, 4, 5, 6]
    }
}
