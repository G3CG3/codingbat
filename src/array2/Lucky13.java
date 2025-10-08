package array2;

/**
 * lucky13 - CodingBat Array-2
 *
 * Return true if the array contains no 1's and no 3's.
 */
public class Lucky13 {

    /**
     * Checks if the array contains no 1s and no 3s.
     *
     * @param nums the array of integers
     * @return true if there are no 1's or 3's, false otherwise
     */
    public boolean lucky13(int[] nums) {
        for (int n : nums) {
            if (n == 1 || n == 3) return false;
        }
        return true;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Lucky13 l = new Lucky13();
        System.out.println(l.lucky13(new int[]{0, 2, 4}));    // → true
        System.out.println(l.lucky13(new int[]{1, 2, 3}));    // → false
        System.out.println(l.lucky13(new int[]{2, 7, 2, 8})); // → true
        System.out.println(l.lucky13(new int[]{3, 5, 6}));    // → false
        System.out.println(l.lucky13(new int[]{}));           // → true
    }
}
