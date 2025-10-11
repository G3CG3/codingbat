package recursion1;

/**
 * BunnyEars - CodingBat Recursion-1
 *
 * We have a number of bunnies and each bunny has two big floppy ears.
 * We want to compute the total number of ears across all the bunnies recursively
 * (without using loops or multiplication).
 */
public class BunnyEars {

    /**
     * Recursively computes the total number of ears among all bunnies.
     *
     * @param bunnies number of bunnies
     * @return total number of ears
     */
    public int bunnyEars(int bunnies) {
        // Base case: no bunnies means no ears
        if (bunnies == 0) return 0;

        // Recursive step: each bunny contributes 2 ears
        return 2 + bunnyEars(bunnies - 1);
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        BunnyEars be = new BunnyEars();
        System.out.println(be.bunnyEars(0)); // 0
        System.out.println(be.bunnyEars(1)); // 2
        System.out.println(be.bunnyEars(5)); // 10
    }
}
