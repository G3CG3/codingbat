package logic2;

/**
 * MakeBricks - CodingBat Logic-2
 *
 * We want to make a row of bricks that is 'goal' inches long.
 * We have:
 * - small bricks (1 inch each)
 * - big bricks (5 inches each)
 *
 * Return true if it is possible to make the goal by choosing from the given bricks.
 * (No loops are needed.)
 */
public class MakeBricks {

    public boolean makeBricks(int small, int big, int goal) {
        // Use as many big bricks as possible without exceeding goal
        int maxBigUsed = Math.min(goal / 5, big);

        // Remaining length to fill with small bricks
        int remainder = goal - (maxBigUsed * 5);

        // Check if small bricks are enough for the remainder
        return remainder <= small;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        MakeBricks mb = new MakeBricks();
        System.out.println(mb.makeBricks(3, 1, 8));   // true
        System.out.println(mb.makeBricks(3, 1, 9));   // false
        System.out.println(mb.makeBricks(3, 2, 10));  // true
        System.out.println(mb.makeBricks(0, 3, 14));  // false
    }
}
