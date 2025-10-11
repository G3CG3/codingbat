package recursion1;

/**
 * Triangle - CodingBat Recursion-1
 *
 * We have a triangle made of blocks.
 * The topmost row has 1 block, the next row down has 2 blocks,
 * the next has 3 blocks, and so on.
 *
 * This method recursively computes the total number of blocks
 * in such a triangle with the given number of rows (no loops).
 */
public class Triangle {

    /**
     * Recursively calculates the total number of blocks
     * in a triangle with the given number of rows.
     *
     * @param rows the number of rows in the triangle
     * @return the total number of blocks
     */
    public int triangle(int rows) {
        if (rows == 0) return 0; // Base case: no rows, no blocks
        return rows + triangle(rows - 1); // Recursive case
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.triangle(0)); // 0
        System.out.println(t.triangle(1)); // 1
        System.out.println(t.triangle(2)); // 3
        System.out.println(t.triangle(3)); // 6
        System.out.println(t.triangle(4)); // 10
        System.out.println(t.triangle(5)); // 15
    }
}
