package string3;

/**
 * SumNumbers - CodingBat String-3
 *
 * Given a string, return the sum of the numbers appearing in the string.
 * A number is a series of 1 or more digit chars in a row.
 */
public class SumNumbers {

    /**
     * Returns the sum of all numbers found in the input string.
     *
     * @param str input string
     * @return sum of numbers
     */
    public int sumNumbers(String str) {
        int sum = 0;
        StringBuilder number = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            } else {
                if (!number.isEmpty()) {
                    sum += Integer.parseInt(number.toString());
                    number.setLength(0); // reset for next number
                }
            }
        }

        // Add last number if string ends with digits
        if (!number.isEmpty()) {
            sum += Integer.parseInt(number.toString());
        }

        return sum;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        SumNumbers sn = new SumNumbers();
        System.out.println(sn.sumNumbers("abc123xyz"));     // → 123
        System.out.println(sn.sumNumbers("aa11b33"));       // → 44
        System.out.println(sn.sumNumbers("7 11"));          // → 18
        System.out.println(sn.sumNumbers("Chocolate"));     // → 0
        System.out.println(sn.sumNumbers("100abc200xyz3")); // → 303
    }
}
