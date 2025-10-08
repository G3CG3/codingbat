package array2;

/**
 * fizzArray2 - CodingBat Array-2
 *
 * Given a number n, create and return a new String array of length n,
 * containing the strings "0", "1", "2", ... through "n-1".
 * N may be 0, in which case just return a length 0 array.
 */
public class FizzArray2 {

    /**
     * Creates a String array from "0" to "n-1".
     *
     * @param n the length of the desired array
     * @return an array of String values from "0" to "n-1"
     */
    public String[] fizzArray2(int n) {
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        FizzArray2 f = new FizzArray2();

        System.out.println(java.util.Arrays.toString(f.fizzArray2(4)));  // → ["0", "1", "2", "3"]
        System.out.println(java.util.Arrays.toString(f.fizzArray2(1)));  // → ["0"]
        System.out.println(java.util.Arrays.toString(f.fizzArray2(0)));  // → []
    }
}
