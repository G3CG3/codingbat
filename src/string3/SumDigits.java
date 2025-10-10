package string3;

/**
 * sumDigits - CodingBat String-3
 *
 * Given a string, return the sum of the digits 0-9 that appear in the string,
 * ignoring all other characters. Return 0 if there are no digits in the string.
 */
public class SumDigits {

    public int sumDigits(String str) {
        int sum = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumDigits test = new SumDigits();

        System.out.println(test.sumDigits("aa1bc2d3"));    // → 6
        System.out.println(test.sumDigits("aa11b33"));     // → 8
        System.out.println(test.sumDigits("Chocolate"));   // → 0
        System.out.println(test.sumDigits("5h3ll0"));      // → 8
    }
}
