package ap1;

/**
 * UserCompare - CodingBat AP-1
 *
 * Compares two users by name and then by id.
 * Returns:
 *  -1 if user A comes before user B
 *   1 if user A comes after user B
 *   0 if both are the same
 */
public class UserCompare {

    /**
     * Compares two users by name, then by id if names are equal.
     *
     * @param aName name of user A
     * @param aId   id of user A
     * @param bName name of user B
     * @param bId   id of user B
     * @return -1 if A < B, 1 if A > B, 0 if equal
     */
    public int userCompare(String aName, int aId, String bName, int bId) {
        int nameCompare = aName.compareTo(bName);

        if (nameCompare < 0) return -1;
        if (nameCompare > 0) return 1;

        // Names are equal → compare IDs
        return Integer.compare(aId, bId);
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        UserCompare uc = new UserCompare();
        System.out.println(uc.userCompare("bb", 1, "zz", 2)); // → -1
        System.out.println(uc.userCompare("bb", 1, "aa", 2)); // → 1
        System.out.println(uc.userCompare("bb", 1, "bb", 1)); // → 0
        System.out.println(uc.userCompare("bb", 5, "bb", 2)); // → 1
    }
}
