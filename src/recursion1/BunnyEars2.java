package recursion1;

/**
 * BunnyEars2 - CodingBat Recursion-1
 *
 * We have bunnies standing in a line, numbered 1, 2, ...
 * The odd bunnies (1, 3, 5, ...) have 2 ears.
 * The even bunnies (2, 4, 6, ...) have 3 ears (due to a raised foot).
 *
 * This method recursively returns the total number of ears
 * across all the bunnies without using loops or multiplication.
 */
public class BunnyEars2 {

    /**
     * Recursively calculates the total number of bunny ears.
     *
     * @param bunnies the number of bunnies in line
     * @return the total number of ears
     */
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0; // Base case

        // Odd bunnies have 2 ears, even bunnies have 3
        if (bunnies % 2 != 0) {
            return 2 + bunnyEars2(bunnies - 1);
        } else {
            return 3 + bunnyEars2(bunnies - 1);
        }
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        BunnyEars2 be = new BunnyEars2();
        System.out.println(be.bunnyEars2(0)); // 0
        System.out.println(be.bunnyEars2(1)); // 2
        System.out.println(be.bunnyEars2(2)); // 5
        System.out.println(be.bunnyEars2(3)); // 7
        System.out.println(be.bunnyEars2(4)); // 10
    }
}
