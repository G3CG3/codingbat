package logic2;

/**
 * EvenlySpaced - CodingBat Logic-2
 *
 * Given three ints, a b c, one of them is small, one is medium and one is large.
 * Return true if the three values are evenly spaced, so the difference between
 * small and medium is the same as the difference between medium and large.
 *
 * Examples:
 * evenlySpaced(2, 4, 6) → true
 * evenlySpaced(4, 6, 2) → true
 * evenlySpaced(4, 6, 3) → false
 */
public class EvenlySpaced {

    /**
     * Returns true if the three values are evenly spaced.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return true if evenly spaced, false otherwise
     */
    public boolean evenlySpaced(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;
        return (max - mid) == (mid - min);
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        EvenlySpaced es = new EvenlySpaced();
        System.out.println(es.evenlySpaced(2, 4, 6)); // true
        System.out.println(es.evenlySpaced(4, 6, 2)); // true
        System.out.println(es.evenlySpaced(4, 6, 3)); // false
        System.out.println(es.evenlySpaced(6, 2, 4)); // true
    }
}
