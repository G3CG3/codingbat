package warmup1;

/**
 * SumDouble - CodingBat Warmup-1
 *
 * Given two int values, return their sum.
 * Unless the two values are the same, then return double their sum.
 */
public class SumDouble {

    /**
     * Returns the sum of a and b, or double the sum if they are equal.
     *
     * @param a first integer
     * @param b second integer
     * @return sum or double sum if a == b
     */
    public int sumDouble(int a, int b) {
        return (a == b) ? 2 * (a + b) : (a + b);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        SumDouble s = new SumDouble();
        System.out.println(s.sumDouble(1, 2)); // 3
        System.out.println(s.sumDouble(3, 3)); // 12
        System.out.println(s.sumDouble(0, 0)); // 0
    }
}