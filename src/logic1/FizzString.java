package logic1;

/**
 * FizzString - CodingBat Logic-1
 *
 * Given a string str:
 * - If it starts with "f", return "Fizz".
 * - If it ends with "b", return "Buzz".
 * - If both conditions are true, return "FizzBuzz".
 * - Otherwise, return the string unchanged.
 */
public class FizzString {

    /**
     * Returns "Fizz", "Buzz", "FizzBuzz", or the string itself based on its start and end.
     *
     * @param str the input string
     * @return the transformed string based on the rules above
     */
    public String fizzString(String str) {
        StringBuilder sb = new StringBuilder();

        if (str.startsWith("f")) sb.append("Fizz");
        if (str.endsWith("b")) sb.append("Buzz");

        return sb.isEmpty() ? str : sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        FizzString fs = new FizzString();
        System.out.println(fs.fizzString("fig"));   // Fizz
        System.out.println(fs.fizzString("dib"));   // Buzz
        System.out.println(fs.fizzString("fib"));   // FizzBuzz
        System.out.println(fs.fizzString("cat"));   // cat
    }
}
