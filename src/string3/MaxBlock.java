package string3;

/**
 * MaxBlock - CodingBat String-3
 *
 * Given a string, return the length of the largest "block" in the string.
 * A block is a run of adjacent chars that are the same.
 */
public class MaxBlock {

    /**
     * Returns the length of the largest block of adjacent identical characters.
     *
     * @param str input string
     * @return length of the largest block
     */
    public int maxBlock(String str) {
        if (str.isEmpty()) return 0;

        int max = 1;
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > max) max = count;
                count = 1;
            }
        }

        // Check last block
        if (count > max) max = count;

        return max;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MaxBlock mb = new MaxBlock();
        System.out.println(mb.maxBlock("hoopla"));        // → 2
        System.out.println(mb.maxBlock("abbCCCddBBBxx")); // → 3
        System.out.println(mb.maxBlock(""));             // → 0
        System.out.println(mb.maxBlock("aaaa"));         // → 4
        System.out.println(mb.maxBlock("abbbccddd"));    // → 3
    }
}
