package logic1;

/**
 * DateFashion - CodingBat Logic-1
 *
 * You and your date are trying to get a table at a restaurant.
 * "you" is the stylishness of your clothes, in the range 0..10,
 * and "date" is the stylishness of your date's clothes.
 *
 * Result:
 * - 0 = no (if either ≤ 2)
 * - 1 = maybe (otherwise)
 * - 2 = yes (if either ≥ 8, unless the ≤ 2 case applies first)
 */
public class DateFashion {

    /**
     * Determines if you and your date will get a table.
     *
     * @param you  stylishness of your clothes (0..10)
     * @param date stylishness of your date's clothes (0..10)
     * @return 0=no, 1=maybe, 2=yes
     */
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        if (you >= 8 || date >= 8) return 2;
        return 1;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        DateFashion df = new DateFashion();
        System.out.println(df.dateFashion(5, 10)); // 2
        System.out.println(df.dateFashion(5, 2));  // 0
        System.out.println(df.dateFashion(5, 5));  // 1
    }
}
