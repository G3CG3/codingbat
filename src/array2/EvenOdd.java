package array2;

/**
 * evenOdd - CodingBat Array-2
 *
 * Returns a version of the array where all even numbers
 * appear before all odd numbers. The relative order does not matter.
 */
public class EvenOdd {

    public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int n : nums) {
            if (n % 2 == 0) {
                result[evenIndex++] = n;
            } else {
                result[oddIndex--] = n;
            }
        }

        return result;
    }

    // Optional main() for testing
    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();

        System.out.println(java.util.Arrays.toString(eo.evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}))); // [0, 0, 0, 1, 1, 1, 1]
        System.out.println(java.util.Arrays.toString(eo.evenOdd(new int[]{3, 3, 2})));             // [2, 3, 3]
        System.out.println(java.util.Arrays.toString(eo.evenOdd(new int[]{2, 2, 2})));             // [2, 2, 2]
    }
}