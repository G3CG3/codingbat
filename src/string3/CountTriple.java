package string3;

/**
 * countTriple - CodingBat String-3
 *
 * We'll say that a "triple" in a string is a char appearing three times in a row.
 * Return the number of triples in the given string. The triples may overlap.
 */
public class CountTriple {

    public int countTriple(String str) {
        int count = 0;

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i - 1) && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountTriple test = new CountTriple();

        System.out.println(test.countTriple("abcXXXabc"));   // → 1
        System.out.println(test.countTriple("xxxabyyyycd")); // → 3
        System.out.println(test.countTriple("a"));           // → 0
        System.out.println(test.countTriple("xxxx"));        // → 2 (overlapping)
    }
}
