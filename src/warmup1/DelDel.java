package warmup1;

/**
 * DelDel - CodingBat Warmup-1
 *
 * Given a string, if the string "del" appears starting at index 1,
 * return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 */
public class DelDel {

    /**
     * Deletes "del" from index 1 if it exists.
     *
     * @param str input string
     * @return string with "del" deleted from index 1 if present
     */
    public String delDel(String str) {
        if (str.length() >= 4 && str.startsWith("del", 1)) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        DelDel dd = new DelDel();
        System.out.println(dd.delDel("adelbc"));   // "abc"
        System.out.println(dd.delDel("adelHello")); // "aHello"
        System.out.println(dd.delDel("abcdel"));    // "abcdel"
        System.out.println(dd.delDel("a"));         // "a"
    }
}
