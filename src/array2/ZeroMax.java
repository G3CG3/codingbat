package array2;

/**
 * zeroMax - CodingBat Array-2
 *
 * Returns a version of the array where each 0 is replaced by
 * the largest odd value to its right. If no odd value exists, 0 remains.
 */
public class ZeroMax {

    public int[] zeroMax(int[] nums) {
        int[] result = nums.clone(); // Δημιουργούμε νέο array για να μην τροποποιήσουμε το αρχικό

        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                int maxOdd = 0;
                for (int j = i + 1; j < result.length; j++) {
                    if (result[j] % 2 == 1 && result[j] > maxOdd) {
                        maxOdd = result[j];
                    }
                }
                if (maxOdd > 0) {
                    result[i] = maxOdd;
                }
            }
        }

        return result;
    }

    // Optional main() for testing
    public static void main(String[] args) {
        ZeroMax zm = new ZeroMax();
        System.out.println(java.util.Arrays.toString(zm.zeroMax(new int[]{0, 5, 0, 3}))); // [5, 5, 3, 3]
        System.out.println(java.util.Arrays.toString(zm.zeroMax(new int[]{0, 4, 0, 3}))); // [3, 4, 3, 3]
        System.out.println(java.util.Arrays.toString(zm.zeroMax(new int[]{0, 2, 0})));    // [0, 2, 0]
    }
}
