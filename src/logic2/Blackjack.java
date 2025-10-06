package logic2;

/**
 * Blackjack - CodingBat Logic-2
 *
 * Given 2 int values greater than 0, return whichever value is nearest to 21
 * without going over. Return 0 if they both go over.
 *
 * Examples:
 * blackjack(19, 21) → 21
 * blackjack(21, 19) → 21
 * blackjack(19, 22) → 19
 * blackjack(22, 22) → 0
 */
public class Blackjack {

    /**
     * Returns the value nearest to 21 without going over.
     * If both values go over 21, returns 0.
     *
     * @param a first integer value (> 0)
     * @param b second integer value (> 0)
     * @return value closest to 21 without exceeding it, or 0 if both exceed 21
     */
    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) return 0;
        if (a > 21) return b;
        if (b > 21) return a;
        return Math.max(a, b);
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        Blackjack bj = new Blackjack();
        System.out.println(bj.blackjack(19, 21)); // 21
        System.out.println(bj.blackjack(21, 19)); // 21
        System.out.println(bj.blackjack(19, 22)); // 19
        System.out.println(bj.blackjack(22, 22)); // 0
    }
}
