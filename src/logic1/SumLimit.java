package logic1;

/**
 * SumLimit - CodingBat Logic-1
 *
 * Given 2 non-negative ints, a and b:
 * Return their sum if it has the same number of digits as a.
 * Otherwise, return a.
 */
public class SumLimit {

    public int sumLimit(int a, int b) {
        String strA = String.valueOf(a);
        String sum = String.valueOf(a + b);

        return (sum.length() > strA.length() ? a : a + b);
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        SumLimit sl = new SumLimit();
        System.out.println(sl.sumLimit(2, 3));   // 5
        System.out.println(sl.sumLimit(8, 3));   // 8
        System.out.println(sl.sumLimit(99, 1));  // 100 -> returns 99
        System.out.println(sl.sumLimit(99, 0));  // 99
    }
}
