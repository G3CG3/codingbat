package string2;

/**
 * CountCode - CodingBat String-2
 *
 * Given a string, return the number of times that the string "code" appears anywhere,
 * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
 *
 * Examples:
 * countCode("aaacodebbb") → 1
 * countCode("codexxcode") → 2
 * countCode("cozexxcope") → 2
 */
public class CountCode {

    /**
     * Counts occurrences of "co?e" where ? can be any character.
     *
     * @param str the input string
     * @return the number of occurrences
     */
    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co", i) && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CountCode cc = new CountCode();
        System.out.println(cc.countCode("aaacodebbb"));  // 1
        System.out.println(cc.countCode("codexxcode"));  // 2
        System.out.println(cc.countCode("cozexxcope"));  // 2
    }
}
