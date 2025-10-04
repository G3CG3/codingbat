package logic1;

/**
 * TeaParty - CodingBat Logic-1
 *
 * We are having a party with amounts of tea and candy. Return the int outcome of the party
 * encoded as 0=bad, 1=good, or 2=great.
 *
 * A party is good (1) if both tea and candy are at least 5.
 * However, if either tea or candy is at least double the amount of the other one,
 * the party is great (2).
 * However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
 */
public class TeaParty {

    /**
     * Determines the party rating based on the amounts of tea and candy.
     *
     * @param tea amount of tea
     * @param candy amount of candy
     * @return 0 if bad, 1 if good, 2 if great
     */
    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        if (tea >= 2 * candy || candy >= 2 * tea) return 2;
        return 1;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        TeaParty tp = new TeaParty();
        System.out.println(tp.teaParty(6, 8));  // 1 (good)
        System.out.println(tp.teaParty(3, 8));  // 0 (bad)
        System.out.println(tp.teaParty(20, 6)); // 2 (great)
    }
}
