package warmup1;

/**
 * IntMax - CodingBat Warmup-1
 *
 * Given three int values, a, b, c, return the largest.
 */
public class IntMax {

    /**
     * Returns the largest of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return the largest of a, b, c
     */
    public int intMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        IntMax im = new IntMax();
        System.out.println(im.intMax(1, 2, 3));   // 3
        System.out.println(im.intMax(10, 5, 7));  // 10
        System.out.println(im.intMax(0, -1, -2));// 0
    }
}