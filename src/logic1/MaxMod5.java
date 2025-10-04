package logic1;

/**
 * MaxMod5 - CodingBat Logic-1
 *
 * Return the larger of two int values, except:
 * - If the values have the same remainder when divided by 5, return the smaller.
 * - If the values are the same, return 0.
 */
public class MaxMod5 {

    public int maxMod5(int a, int b) {
        if (a == b) return 0;
        return (a % 5 == b % 5 ? Math.min(a, b) : Math.max(a, b));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MaxMod5 mm = new MaxMod5();
        System.out.println(mm.maxMod5(2, 3)); // 3
        System.out.println(mm.maxMod5(6, 2)); // 6
        System.out.println(mm.maxMod5(3, 8)); // 3 (same remainder)
        System.out.println(mm.maxMod5(4, 4)); // 0
    }
}
