package logic2;

/**
 * MakeChocolate - CodingBat Logic-2
 *
 * We want to make a package of goal kilos of chocolate. We have:
 * - small bars (1 kilo each)
 * - big bars (5 kilos each)
 *
 * We should use big bars before small bars.
 * Return the number of small bars to use, or -1 if it is not possible
 * to reach exactly the goal.
 *
 * Examples:
 * makeChocolate(4, 1, 9) → 4
 * makeChocolate(4, 1, 10) → -1
 * makeChocolate(4, 1, 7) → 2
 */
public class MakeChocolate {

    /**
     * Determines the number of small bars needed to reach the goal weight.
     * Uses as many big bars as possible first.
     *
     * @param small number of 1kg small bars available
     * @param big   number of 5kg big bars available
     * @param goal  target weight in kilos
     * @return number of small bars to use, or -1 if not possible
     */
    public int makeChocolate(int small, int big, int goal) {
        int maxBigBars = goal / 5;
        int bigBarsUsed = Math.min(maxBigBars, big);
        int remaining = goal - bigBarsUsed * 5;

        if (remaining <= small) {
            return remaining;
        } else {
            return -1;
        }
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        MakeChocolate mc = new MakeChocolate();
        System.out.println(mc.makeChocolate(4, 1, 9));  // 4
        System.out.println(mc.makeChocolate(4, 1, 10)); // -1
        System.out.println(mc.makeChocolate(4, 1, 7));  // 2
        System.out.println(mc.makeChocolate(6, 2, 7));  // 2
        System.out.println(mc.makeChocolate(1, 2, 6));  // 1
    }
}
