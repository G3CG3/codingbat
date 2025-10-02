package array1;

/**
 * MakePi - CodingBat Array-1
 *
 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
 */
public class MakePi {

    /**
     * Returns an array containing the first 3 digits of pi.
     *
     * @return int array {3, 1, 4}
     */
    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MakePi mp = new MakePi();
        int[] piArray = mp.makePi();
        for (int num : piArray) {
            System.out.print(num + " ");
        }
        // Output: 3 1 4
    }
}