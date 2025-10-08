package array2;

/**
 * fizzBuzz - CodingBat Array-2
 *
 * Returns an array of Strings representing the numbers from start up to (but not including) end.
 * Multiples of 3 are replaced with "Fizz", multiples of 5 with "Buzz",
 * and multiples of both 3 and 5 with "FizzBuzz".
 */
public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];

        for (int i = start; i < end; i++) {
            if (i % 15 == 0) {
                result[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - start] = "Buzz";
            } else {
                result[i - start] = String.valueOf(i);
            }
        }

        return result;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();

        System.out.println(java.util.Arrays.toString(fb.fizzBuzz(1, 6)));
        // ["1", "2", "Fizz", "4", "Buzz"]

        System.out.println(java.util.Arrays.toString(fb.fizzBuzz(1, 8)));
        // ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]

        System.out.println(java.util.Arrays.toString(fb.fizzBuzz(15, 21)));
        // ["FizzBuzz", "16", "17", "Fizz", "19", "Buzz"]
    }
}
